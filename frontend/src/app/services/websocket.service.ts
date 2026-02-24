// ============================================
// FILE: src/app/services/websocket.service.ts
// ============================================

import { Injectable } from '@angular/core';
import { Client } from '@stomp/stompjs';
import { Subject } from 'rxjs';
import SockJS from 'sockjs-client';
import { WS_BASE } from '../config/api.config';  // ✅ Import centralized WS_BASE

@Injectable({
  providedIn: 'root'
})
export class WebsocketService {
  private client: Client | null = null;
  private notificationSubject = new Subject<string>();
  public notifications$ = this.notificationSubject.asObservable();

  connect(userId: number): void {
    this.client = new Client({
      webSocketFactory: () => new SockJS(WS_BASE) as any,  // ✅ Use WS_BASE
      debug: (str: string) => console.log(str),
      reconnectDelay: 5000,
      heartbeatIncoming: 4000,
      heartbeatOutgoing: 4000,
    });

    this.client.onConnect = () => {
      console.log('WebSocket Connected');
      this.client?.subscribe(`/topic/notifications/${userId}`, (message: any) => {
        this.notificationSubject.next(message.body);
      });
    };

    this.client.onStompError = (frame: any) => {
      console.error('WebSocket Error:', frame);
    };

    this.client.activate();
  }

  disconnect(): void {
    if (this.client) {
      this.client.deactivate();
      this.client = null;
    }
  }
}

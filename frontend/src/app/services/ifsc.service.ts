import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BankDetails } from '../models/account.model';
import { API_BASE } from '../config/api.config';

@Injectable({
  providedIn: 'root'
})
export class IfscService {
  private apiUrl = `${API_BASE}/ifsc`;

  constructor(private http: HttpClient) {}

  verifyIFSC(ifscCode: string): Observable<BankDetails> {
    return this.http.get<BankDetails>(`${this.ifscApi}/${ifscCode}`);
  }
}

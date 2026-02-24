import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BankDetails } from '../models/account.model';
import { API_BASE } from '../config/api.config';

@Injectable({
  providedIn: 'root'
})
export class IfscService {
  private apiUrl = `${API_BASE}/ifsc`;  // ✅ Correct property name

  constructor(private http: HttpClient) {}

  verifyIFSC(ifscCode: string): Observable<BankDetails> {
    // ✅ Use this.apiUrl instead of this.ifscApi
    return this.http.get<BankDetails>(`${this.apiUrl}/${ifscCode}`);
  }
}

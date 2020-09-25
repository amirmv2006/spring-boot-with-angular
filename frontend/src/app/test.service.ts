import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {OktaAuthService} from '@okta/okta-angular';


@Injectable({
  providedIn: 'root'
})
export class AmirService {
  private url = 'http://localhost:8081/amir';

  constructor(private http: HttpClient, public oktaAuth: OktaAuthService) {
  }

  async hello(name: string): Promise<Observable<SampleDto>> {
    const accessToken = await this.oktaAuth.getAccessToken();
    return this.http.get<SampleDto>(this.url + '?name=' + name, {
      headers: {
        Authorization: 'Bearer ' + accessToken,
      }
    });
  }
}

export interface SampleDto {
  firstName: string;
  lastName: string;
}

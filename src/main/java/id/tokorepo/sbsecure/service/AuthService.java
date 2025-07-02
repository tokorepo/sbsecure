package id.tokorepo.sbsecure.service;

import id.tokorepo.sbsecure.dto.request.LoginRequest;
import id.tokorepo.sbsecure.dto.request.SignupRequest;
import id.tokorepo.sbsecure.dto.response.JWTResponse;

public interface AuthService {

    String register(SignupRequest request);

    JWTResponse login(LoginRequest request);

    String logout(String token);
}

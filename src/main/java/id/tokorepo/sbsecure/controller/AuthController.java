package id.tokorepo.sbsecure.controller;

import id.tokorepo.sbsecure.dto.request.LoginRequest;
import id.tokorepo.sbsecure.dto.request.SignupRequest;
import id.tokorepo.sbsecure.dto.response.CustomResponse;
import id.tokorepo.sbsecure.dto.response.JWTResponse;
import id.tokorepo.sbsecure.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomResponse<String> register(@RequestBody SignupRequest request) {

        return CustomResponse.created(authService.register(request));
    }

    @PostMapping("/login")
    public CustomResponse<JWTResponse> login(@RequestBody LoginRequest request) {

        return CustomResponse.ok(authService.login(request));
    }

    @PostMapping("/logout")
    public CustomResponse<String> logout(@RequestHeader("Authorization") String token) {

        return CustomResponse.ok(authService.logout(token));
    }
}

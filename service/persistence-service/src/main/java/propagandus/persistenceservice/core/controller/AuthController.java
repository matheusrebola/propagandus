package propagandus.persistenceservice.core.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import propagandus.persistenceservice.core.dtos.AuthRequest;
import propagandus.persistenceservice.core.dtos.TokenDTO;
import propagandus.persistenceservice.core.services.AuthService;

@RestController
@AllArgsConstructor
@RequestMapping("api/auth")
public final class AuthController {
    private final AuthService service;

    @PostMapping("login")
    public TokenDTO login(@RequestBody AuthRequest request) {
        return service.login(request);
    }

}

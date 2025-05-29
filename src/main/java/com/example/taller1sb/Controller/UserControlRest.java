package com.example.taller1sb.Controller;

import com.example.taller1sb.services.IUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RESUMEN DE responceBody y Controlles
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Slf4j
public class UserControlRest {
    private final IUserService userService;

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userService.getAll());
    }

}

package com.example.taller1sb.Controller;

import com.example.taller1sb.services.ICartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/carts")
@RequiredArgsConstructor
@Slf4j
public class CartControllerRest {
    private final ICartService cartService;

    @GetMapping("/{userID}")
    public ResponseEntity<?> getAllProducts(@PathVariable Integer userID) {
        return ResponseEntity.ok(cartService.getAllById(userID));
    }

}

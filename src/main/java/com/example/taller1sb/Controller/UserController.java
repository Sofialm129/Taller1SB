package com.example.taller1sb.Controller;

import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.services.IUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Controller
public class UserController {
    private final IUserService userService;

    @GetMapping("/login")
    public String index(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute UserDTO user, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "login";
        }
        Optional<UserDTO> user1 = userService.findByUsername(user.getUsername());
        if(user1.isEmpty()){
            model.addAttribute("error", "usuario no encontrado");
            return "login";
        }

        if (!user1.get().getPassword().equals(user.getPassword())) {
            model.addAttribute("error", "Acceso denegado");
            return "login";
        }

        log.info("Usuario login: {}", user1.get());
        model.addAttribute("username", user1.get().getUsername());
        return "products";
    }
}

package com.example.taller1sb.Controller;

import com.example.taller1sb.DTO.CartDTO;
import com.example.taller1sb.DTO.ProductCartDTO;
import com.example.taller1sb.DTO.ProductDTO;
import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.services.ICartService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class CartController {
    private final ICartService cartService;

    @GetMapping("/login/carts")
    public String index(Model model, HttpSession session) {
        model.addAttribute("cartDTO", new CartDTO());
        UserDTO user = (UserDTO) session.getAttribute("userLogged");
        model.addAttribute("username", user.getUsername());

        List<CartDTO> carts = cartService.getAllById(user.getId());
        model.addAttribute("carts", carts);

        for (CartDTO c : carts) {
            log.info("Cart: {}", c);
        }
        return "carts";
    }
}

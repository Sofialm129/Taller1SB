package com.example.taller1sb.Controller;

import com.example.taller1sb.DTO.ProductDTO;
import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.services.IProductService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final IProductService productService;

    @GetMapping("login/products")
    public String index(Model model, HttpSession session) {
        model.addAttribute("productDTO", new ProductDTO());
        UserDTO user = (UserDTO) session.getAttribute("userLogged");
        model.addAttribute("username", user.getUsername());

        List<ProductDTO> products = productService.getAll();
        model.addAttribute("products", products);
        for (ProductDTO p: products){
            log.info("Product: {}", p);
        }

        return "products";
    }

}

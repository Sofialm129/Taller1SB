package com.example.taller1sb.Controller;

import com.example.taller1sb.DTO.ProductDTO;
import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.services.IProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ProductController {
    private final IProductService productService;

    @PostMapping("/products")
    public String showProduct(@ModelAttribute ProductDTO productDTO, Model model) {
        List<ProductDTO> products = productService.getAll();
        model.addAttribute("products", products); //referencia al html
        return "products";
    }

}

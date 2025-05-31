package com.example.taller1sb.services.implementations;

import com.example.taller1sb.DTO.CartDTO;
import com.example.taller1sb.DTO.ProductDTO;
import com.example.taller1sb.services.ICartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements ICartService {

    private final RestTemplate restTemplate;

    @Override
    public CartDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<CartDTO> getAll() {
        return List.of();
    }

    @Override
    public List<CartDTO> getAllById(Integer userID){
        CartDTO[] carts = restTemplate.getForObject("/carts/user/{userID}", CartDTO[].class, userID);
        return List.of(carts);
    }
}

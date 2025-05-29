package com.example.taller1sb.services.implementations;

import com.example.taller1sb.DTO.ProductDTO;
import com.example.taller1sb.services.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {
    private final RestTemplate restTemplate;
    @Override
    public ProductDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<ProductDTO> getAll() {
        ProductDTO[] products = restTemplate.getForObject("/products", ProductDTO[].class);
        return List.of(products);
    }
}

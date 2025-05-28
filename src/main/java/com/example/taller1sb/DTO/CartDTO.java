package com.example.taller1sb.DTO;

import com.example.taller1sb.model.Product;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartDTO {
    private Integer id;
    private Integer userId;
    private List<Product> products;
}

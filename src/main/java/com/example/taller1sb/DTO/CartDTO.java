package com.example.taller1sb.DTO;


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
    private List<ProductCartDTO> products;
}

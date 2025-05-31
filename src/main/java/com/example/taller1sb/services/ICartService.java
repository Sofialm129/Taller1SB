package com.example.taller1sb.services;

import com.example.taller1sb.DTO.CartDTO;
import java.util.List;

public interface ICartService extends BaseService<CartDTO> {
    List<CartDTO> getAllById(Integer userID);
}

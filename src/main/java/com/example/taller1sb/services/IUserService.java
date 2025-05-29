package com.example.taller1sb.services;

import com.example.taller1sb.DTO.UserDTO;

import java.util.Optional;

public interface IUserService extends BaseService<UserDTO> {
    Optional<UserDTO> findByUsername(String username);
}

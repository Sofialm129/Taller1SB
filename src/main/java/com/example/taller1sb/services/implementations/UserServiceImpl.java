package com.example.taller1sb.services.implementations;

import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.model.User;
import com.example.taller1sb.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final RestTemplate restTemplate;
    @Override
    public UserDTO findById(Integer id) {
        return null;
    }
    @Override
    public List<UserDTO> getAll() {
        UserDTO[] users = restTemplate.getForObject("/users", UserDTO[].class);
        return List.of(users);
    }
}

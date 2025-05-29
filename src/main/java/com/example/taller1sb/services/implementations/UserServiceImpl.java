package com.example.taller1sb.services.implementations;

import com.example.taller1sb.DTO.UserDTO;
import com.example.taller1sb.model.User;
import com.example.taller1sb.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<UserDTO> findByUsername(String username) {
        List<UserDTO> users = getAll();
        for (UserDTO user : users) {
            if (user.getUsername().equals(username)) {
                return Optional.of(UserDTO.builder().
                        id(user.getId()).
                        username(user.getUsername()).
                        password(user.getPassword()).
                        build());
            }
        }
        return Optional.empty();
    }
}

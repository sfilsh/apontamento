package com.apontamento.main.service;

import com.apontamento.main.DTO.UserDTO;
import com.apontamento.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getUsers() {
        return userRepository.findAll().stream().map(UserDTO::create).collect(Collectors.toList());
    }

}



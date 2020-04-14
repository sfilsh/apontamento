package com.apontamento.main.endpoint;

import com.apontamento.main.DTO.UserDTO;
import com.apontamento.main.security.User;
import com.apontamento.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apontamentos/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity get() {
        List<UserDTO> list = userService.getUsers();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/info")
    public UserDTO userInfo(@AuthenticationPrincipal User user) {
        return UserDTO.create(user);
    }
}



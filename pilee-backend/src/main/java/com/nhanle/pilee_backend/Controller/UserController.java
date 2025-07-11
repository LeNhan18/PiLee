package com.nhanle.pilee_backend.Controller;

import com.nhanle.pilee_backend.Model.User;
import com.nhanle.pilee_backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
} 
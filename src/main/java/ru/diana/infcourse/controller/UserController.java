package ru.diana.infcourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.diana.infcourse.model.User;
import ru.diana.infcourse.service.UserService;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User userInfo(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/users")
    public void putUser(@RequestBody User name) {
        userService.putUser(name);
    }
    @PostMapping("/users/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}

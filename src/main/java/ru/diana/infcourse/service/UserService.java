package ru.diana.infcourse.service;

import ru.diana.infcourse.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void putUser(User name);
    void deleteUser(Long id);

}

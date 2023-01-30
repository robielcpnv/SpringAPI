package com.robiel.springapi.service;

import com.robiel.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> usersList;

    public UserService() {
        usersList = new ArrayList<>();
        User user1 = new User(1, "John", "test.gmail.com", 25, "123456789");
        User user2 = new User(2, "Jane", "test.gmail.com", 25, "123456789");
        User user3 = new User(3, "Jack", "test.gmail.com", 25, "123456789");
        User user4 = new User(4, "Jill", "test.gmail.com", 25, "123456789");
        User user5 = new User(5, "Jenny", "test.gmail.com", 25, "123456789");
        usersList.addAll(List.of(user1, user2, user3, user4, user5));

    }

    public User getUser(Integer id) {
        return usersList.get(id);
    }

    public List<User> getUsers() {
        return usersList;
    }
}

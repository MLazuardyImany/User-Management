package com.example.user_management.service;

import com.example.user_management.model.User;
import com.example.user_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User create(User user) {
        return repo.save(user);
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User update(Long id, User data) {
        User user = repo.findById(id).orElse(null);
        if (user == null) return null;

        user.setUsername(data.getUsername());
        user.setPassword(data.getPassword());
        user.setRole(data.getRole());

        return repo.save(user);
    }

    public void delete(Long id) {
        repo.deleteById(null);
    }
}


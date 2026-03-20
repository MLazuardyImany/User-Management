package com.example.user_management.service;

import com.exmaple.usermanagement.model.User;
import com.example.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowiredl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User create(User user) {
        return repo.save(save);
    }

    public List<User> getAll() {
        return repo.findAll();
    }

    public User getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User update(Long id, User data) {
        
    }
}


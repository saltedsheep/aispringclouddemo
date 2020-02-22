package com.southwind.repository;

import com.southwind.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository {
    User login(String username, String password);
}

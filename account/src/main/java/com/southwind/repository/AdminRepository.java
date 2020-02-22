package com.southwind.repository;

import com.southwind.entity.Admin;
import org.springframework.stereotype.Component;

@Component
public interface AdminRepository {
    Admin login(String username, String password);
}

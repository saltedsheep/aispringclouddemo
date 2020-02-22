package com.southwind.repository;

import com.southwind.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository {
    public List<User> findAll(int index,int limit);
    public User findById(long id);
    public int count();
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}

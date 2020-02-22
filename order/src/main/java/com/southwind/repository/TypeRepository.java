package com.southwind.repository;

import com.southwind.entity.Type;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TypeRepository {
    Type findById(long id);
    List<Type> findAll();
}

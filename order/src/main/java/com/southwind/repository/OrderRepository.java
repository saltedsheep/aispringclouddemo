package com.southwind.repository;

import com.southwind.entity.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(int index, int limit,int uid);
    public int countByUid(int uid);

    public List<Order> findAll(int index,int limit);
    public void updateState(long id);
    public int count();
}

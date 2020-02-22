package com.southwind.feign;

import com.southwind.entity.Menu;
import com.southwind.entity.MenuVO;
import com.southwind.entity.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@FeignClient(value = "menu")    //该服务提供者在注册中心的name，即配置文件里的name
public interface MenuFeign {
    @GetMapping("/menu/findAll/{index}/{limit}")
    MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);

    @DeleteMapping("/menu/deleteById/{id}")
    void deleteById(@PathVariable("id") long id);

    @GetMapping("/menu/findTypes")
    List<Type> findTypes();

    @PostMapping("/menu/save")
    void save(Menu menu);

    @GetMapping("/menu/findById/{id}")
    Menu findById(@PathVariable("id")long id);

    @PutMapping("/menu/update")
    void update(Menu menu);
}

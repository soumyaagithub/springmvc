package com.example.springmvc.Mapper;

import com.example.springmvc.Food;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Mapper

public interface FoodMapper {
    @Select("SELECT * FROM FOOD")
    public Food[]getFoods();
    @Insert("INSERT INTO FOOD(name,price)VALUES(#{name},#{price})")
    int addFood(Food food);

}

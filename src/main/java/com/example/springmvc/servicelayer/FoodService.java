package com.example.springmvc.servicelayer;

import com.example.springmvc.Food;
import com.example.springmvc.Mapper.FoodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    @Autowired
    private FoodMapper foodMapper;
    public Food[] getfoods(){
        Food[] foods=foodMapper.getFoods();
        return foods;
    }

    public int addFOOD(Food food){
        return foodMapper.addFood(food);

    }
}

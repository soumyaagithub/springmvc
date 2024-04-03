package com.example.springmvc.controller;

import com.example.springmvc.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springmvc.servicelayer.FoodService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {

    private FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/food")
    public String getFood(Food food,Model model){
        Food[] foods=foodService.getfoods();

        model.addAttribute("foods",foods);
        return "food";
    }
    @PostMapping("/food")
    public String addFood(Food food,Model model){
       if(food.getPrice()>1000 ){
           model.addAttribute("errormessage",String.format("could not add %s",food.getName()));
       }else if(foodService.addFOOD(food)<1){
           model.addAttribute("errormessage",String.format("could not add %s",food.getName()));

        }else
        model.addAttribute("successfull", String.format("succesfully added %s", food.getName()));

        Food[] foods=foodService.getfoods();

        model.addAttribute("foods",foods);
        return "food";

    }
}

package com.skypro.controller;

import com.skypro.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasketController {
    BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @PostMapping("/add")
    public Integer addToBasket(@RequestParam(name = "value") Integer intValue){
        return basketService.addToBasket(intValue);
    }

    @GetMapping("/get")
    public List<Integer> getBasket(){
        return basketService.getBasket();
    }
}

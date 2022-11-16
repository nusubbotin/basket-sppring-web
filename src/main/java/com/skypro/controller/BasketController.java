package com.skypro.controller;

import com.skypro.service.BasketService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addList")
    public List<Integer>  addToBasket(@RequestBody List<Integer> intList){
        basketService.addListToBasket(intList);
        return intList;
    }

    @GetMapping("/get")
    public List<Integer> getBasket(){
        return basketService.getBasket();
    }
}

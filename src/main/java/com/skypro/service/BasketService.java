package com.skypro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BasketService {
    List<Integer> basket;

    public BasketService() {
        this.basket = new ArrayList<>();
    }

    public Integer addToBasket(Integer intValue){
        basket.add(intValue);
        return basket.get(basket.size()-1);
    }

    public List<Integer> getBasket(){
        return basket;
    }
}

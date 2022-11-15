package org.example.service.impl;

import org.example.enums.FoodType;
import org.example.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class CandyServiceImpl implements FoodService {

    @Override
    public FoodType getFoodType() {
        return FoodType.CANDY;
    }

    @Override
    public void deliverItem() {
        System.out.println("사탕 배달 완료!");
    }
}
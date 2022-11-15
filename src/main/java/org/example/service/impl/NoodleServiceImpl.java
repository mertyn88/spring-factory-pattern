package org.example.service.impl;

import org.example.enums.FoodType;
import org.example.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class NoodleServiceImpl implements FoodService {

    @Override
    public FoodType getFoodType() {
        return FoodType.NOODLE;
    }

    @Override
    public void deliverItem() {
        System.out.println("라면 배달 완료!");
    }
}
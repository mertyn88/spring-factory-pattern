package org.example.service.impl;

import org.example.enums.FoodType;
import org.example.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class ChocolateServiceImpl implements FoodService {

    @Override
    public FoodType getFoodType() {
        return FoodType.CHOCOLATE;
    }

    @Override
    public void deliverItem() {
        System.out.println("초콜릿 배달 완료!");
    }
}
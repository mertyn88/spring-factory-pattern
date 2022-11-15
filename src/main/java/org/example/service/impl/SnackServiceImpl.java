package org.example.service.impl;

import org.example.enums.FoodType;
import org.example.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class SnackServiceImpl implements FoodService {

    @Override
    public FoodType getFoodType() {
        return FoodType.SNACK;
    }

    @Override
    public void deliverItem() {
        System.out.println("과자 배달 완료!");
    }
}
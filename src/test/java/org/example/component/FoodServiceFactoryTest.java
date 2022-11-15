package org.example.component;

import org.example.enums.FoodType;
import org.example.service.FoodService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FoodServiceFactoryTest {

    @Autowired
    private FoodServiceFactory foodServiceFactory;

    @Test
    void 음식_타입별로_서비스_가져오기() {
        // given
        FoodType candy = FoodType.CANDY;
        FoodType chocolate = FoodType.CHOCOLATE;
        FoodType snack = FoodType.SNACK;
        FoodType noodle = FoodType.NOODLE;

        // when
        FoodService candyService = foodServiceFactory.getService(candy);
        FoodService chocolateService = foodServiceFactory.getService(chocolate);
        FoodService snackService = foodServiceFactory.getService(snack);
        FoodService noodleService = foodServiceFactory.getService(noodle);

        // then
        assertEquals(candyService.getFoodType(), FoodType.CANDY);
        assertEquals(chocolateService.getFoodType(), FoodType.CHOCOLATE);
        assertEquals(snackService.getFoodType(), FoodType.SNACK);
        assertEquals(noodleService.getFoodType(), FoodType.NOODLE);

        // print
        candyService.deliverItem();
        chocolateService.deliverItem();
        snackService.deliverItem();
        noodleService.deliverItem();
    }
}
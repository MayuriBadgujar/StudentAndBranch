package com.Buddhu.IRCTC.IrctcController;

import com.Buddhu.IRCTC.IrctcService.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/foodOrder")
public class FoodOrderController {
    @Autowired
    FoodOrderService foodOrderService;

    //GET API - Get the total price of the orders placed by Customers on Date D in TrainId T.
    @GetMapping("/getTotalPricee")
    public int getTotalPricee(@RequestParam Date date,@RequestParam int trainId){
        return foodOrderService.getTotalPricee(date, trainId);
    }

}

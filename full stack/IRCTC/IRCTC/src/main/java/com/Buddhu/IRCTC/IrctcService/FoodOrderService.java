package com.Buddhu.IRCTC.IrctcService;

import com.Buddhu.IRCTC.Entity.FoodOrder;
import com.Buddhu.IRCTC.IrctcRepository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FoodOrderService {
    @Autowired
    FoodOrderRepository foodOrderRepository;

    public int getTotalPricee(Date date, int trainId) {
        List<FoodOrder> foodOrderList=foodOrderRepository.findByTrainId(trainId);
        int totalprice=0;

        for(FoodOrder foodOrder:foodOrderList){
            totalprice+=foodOrder.getPrice();
        }
        return totalprice;
    }
}

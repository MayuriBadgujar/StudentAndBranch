package com.Buddhu.IRCTC.IrctcRepository;

import com.Buddhu.IRCTC.Entity.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodOrderRepository  extends JpaRepository<FoodOrder,Integer> {
    List<FoodOrder> findByTrainId(int trainId);
}

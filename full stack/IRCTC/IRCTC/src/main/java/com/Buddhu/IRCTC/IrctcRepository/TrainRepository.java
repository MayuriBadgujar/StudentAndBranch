package com.Buddhu.IRCTC.IrctcRepository;

import com.Buddhu.IRCTC.Entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer> {
}

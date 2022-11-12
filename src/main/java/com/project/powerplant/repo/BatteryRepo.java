package com.project.powerplant.repo;

import com.project.powerplant.entity.Battery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatteryRepo extends JpaRepository<Battery,Integer> {
}

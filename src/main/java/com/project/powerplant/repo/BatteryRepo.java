package com.project.powerplant.repo;

import com.project.powerplant.entity.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface BatteryRepo extends JpaRepository<Battery,Integer> {

    @Query(value = "SELECT * FROM battery_details WHERE post_code BETWEEN ?1 AND ?2",nativeQuery = true)
    List<Battery> getBatteryByPostCodeRange(String sPC, String ePC);


}

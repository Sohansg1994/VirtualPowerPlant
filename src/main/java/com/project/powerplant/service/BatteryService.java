package com.project.powerplant.service;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.entity.Battery;
import com.project.powerplant.repo.BatteryRepo;
import com.project.powerplant.util.VarList;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BatteryService {
    @Autowired
    private BatteryRepo batteryRepo;
    @Autowired
    private ModelMapper modelMapper;

    public String saveBatteries(BatteryDTO batteryDTO){
        batteryRepo.save(modelMapper.map(batteryDTO, Battery.class));
        return VarList.RSP_SUCCESS;
    }

}



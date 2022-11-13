package com.project.powerplant.service;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.entity.Battery;
import com.project.powerplant.repo.BatteryRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

@Service
@Transactional
public class BatteryService {
    @Autowired
    private BatteryRepo batteryRepo;

    @Autowired
    private ModelMapper modelMapper;

    public void saveBatteries(BatteryDTO batteryDTO) throws Exception{
        Battery map = modelMapper.map(batteryDTO, Battery.class);
        batteryRepo.saveAndFlush(map);

    }

    public List<BatteryDTO> getBatteries(String startPC ,String endPC) throws Exception{
        List<Battery> batteryList=batteryRepo.getBatteryByPostCodeRange(startPC,endPC);
        List<BatteryDTO> map=modelMapper.map(batteryList,new TypeToken<List<BatteryDTO>>(){}.getType());
        return (map);
    }







}



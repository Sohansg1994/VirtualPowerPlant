package com.project.powerplant.service;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.dto.SummaryDTO;
import com.project.powerplant.entity.Battery;
import com.project.powerplant.repo.BatteryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
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

    public SummaryDTO getBatteries(String startPC ,String endPC) throws Exception{
        List<Battery> batteryList=batteryRepo.getBatteryByPostCodeRange(startPC,endPC);
        List<BatteryDTO> batteryDTOList=new ArrayList<>();
        double totalWattCapacity=0;
        double averageWattCapacity;
        for(Battery battery:batteryList){
            batteryDTOList.add(modelMapper.map(battery,BatteryDTO.class));
            totalWattCapacity=totalWattCapacity+battery.getWattCapacity();
        }
        averageWattCapacity=totalWattCapacity/batteryList.size();
        SummaryDTO summaryDTO=new SummaryDTO(batteryDTOList,totalWattCapacity,averageWattCapacity);
        return (summaryDTO);
    }

   public void updateBattery(int batteryId,BatteryDTO batteryDTO) throws Exception{
        Battery battery=batteryRepo.getReferenceById(batteryId);
        battery.setName(batteryDTO.getName());
        battery.setPostCode(batteryDTO.getPostCode());
        battery.setWattCapacity(batteryDTO.getWattCapacity());
        batteryRepo.save(battery);
   }

    public void deleteBattery(int batteryId) throws Exception{
        batteryRepo.deleteById(batteryId);
    }






}



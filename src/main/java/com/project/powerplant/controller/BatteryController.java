package com.project.powerplant.controller;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.dto.ResponseDTO;
import com.project.powerplant.dto.SummaryDTO;
import com.project.powerplant.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "api/v1/battery")
@CrossOrigin

public class BatteryController {
    @Autowired
    BatteryService batteryService;

    @PostMapping(value = "/")
    public ResponseEntity saveBatteries(@RequestBody BatteryDTO batteryDTO) {
        ResponseDTO responseDTO ;
        try {
            batteryService.saveBatteries(batteryDTO);
            responseDTO = new ResponseDTO("success", batteryDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        } catch (Exception e) {
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO, HttpStatus.NOT_ACCEPTABLE);
        }
    }

   @GetMapping()
    public ResponseEntity getBatteries(@RequestParam String sPC,@RequestParam String ePC){
        ResponseDTO responseDTO ;
        try{
            SummaryDTO summaryDTO=batteryService.getBatteries(sPC,ePC);
            responseDTO=new ResponseDTO("SUCCESS",summaryDTO);
            return new ResponseEntity(responseDTO,HttpStatus.ACCEPTED);

        }catch (Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO, HttpStatus.NOT_ACCEPTABLE);

        }
    }

    @PutMapping()
    public ResponseEntity getBatteries(@RequestParam int batteryId,@RequestBody BatteryDTO batteryDTO){
        ResponseDTO responseDTO;
        try {
            batteryService.updateBattery(batteryId,batteryDTO);
            responseDTO = new ResponseDTO("success", batteryDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }catch (Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO, HttpStatus.NOT_ACCEPTABLE);

        }
    }

    @DeleteMapping()
    public ResponseEntity deleteBattery(@RequestParam int batteryId){
        ResponseDTO responseDTO;
        try {
            batteryService.deleteBattery(batteryId);
            responseDTO = new ResponseDTO("success", null);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }catch (Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO, HttpStatus.NOT_ACCEPTABLE);

        }

    }



}


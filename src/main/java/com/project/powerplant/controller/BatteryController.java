package com.project.powerplant.controller;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.dto.ResponseDTO;
import com.project.powerplant.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

   @GetMapping(value = "/{sPC}/{ePC}")
    public ResponseEntity getBatteries(@PathVariable String sPC,@PathVariable String ePC){
        ResponseDTO responseDTO ;
        try{
            List<BatteryDTO> batteryDTOList=batteryService.getBatteries(sPC,ePC);
            responseDTO=new ResponseDTO("SUCCESS",batteryDTOList);
            return new ResponseEntity(responseDTO,HttpStatus.ACCEPTED);

        }catch (Exception e){
            responseDTO=new ResponseDTO("Error",null);
            return new ResponseEntity(responseDTO, HttpStatus.NOT_ACCEPTABLE);

        }
    }






}


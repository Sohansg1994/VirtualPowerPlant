package com.project.powerplant.controller;

import com.project.powerplant.dto.BatteryDTO;
import com.project.powerplant.dto.ResponseDTO;
import com.project.powerplant.service.BatteryService;
import com.project.powerplant.util.VarList;
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

    @Autowired
    ResponseDTO responseDTO;

    @PostMapping(value = "/saveBatteries")
    public ResponseEntity saveBatteries(@RequestBody BatteryDTO batteryDTO){
        try{
            responseDTO.setCode(VarList.RSP_SUCCESS);
            responseDTO.setMassage("SUCCESS");
            responseDTO.setContent(batteryDTO);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }catch(Exception e){
            responseDTO.setCode(VarList.RSP_FAIL);
            responseDTO.setMassage("ERROR");
            responseDTO.setContent(null);
            return new ResponseEntity(responseDTO, HttpStatus.ACCEPTED);

        }


    }



}
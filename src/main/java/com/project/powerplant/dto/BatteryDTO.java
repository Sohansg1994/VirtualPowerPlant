package com.project.powerplant.dto;

public class BatteryDTO {
    private String name;
    private String postCode;
    private String wattCapacity;

    public BatteryDTO(String name, String postCode, String wattCapacity) {
        this.name = name;
        this.postCode = postCode;
        this.wattCapacity = wattCapacity;
    }

    protected BatteryDTO(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getWattCapacity() {
        return wattCapacity;
    }

    public void setWattCapacity(String wattCapacity) {
        this.wattCapacity = wattCapacity;
    }
}


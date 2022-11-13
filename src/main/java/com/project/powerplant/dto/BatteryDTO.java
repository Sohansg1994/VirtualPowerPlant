package com.project.powerplant.dto;

public class BatteryDTO {
    private String name;
    private String postCode;
    private double wattCapacity;

    public BatteryDTO(String name, String postCode, double wattCapacity) {
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

    public double getWattCapacity() {
        return wattCapacity;
    }

    public void setWattCapacity(double wattCapacity) {
        this.wattCapacity = wattCapacity;
    }
}


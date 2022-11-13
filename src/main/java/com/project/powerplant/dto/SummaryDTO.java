package com.project.powerplant.dto;

import java.util.List;


public class SummaryDTO {
    private List<BatteryDTO> batteryDTOList;
    private double totalWattCapacity;
    private double averageWattCapacity;

    public SummaryDTO(List<BatteryDTO> batteryDTOList, double totalWattCapacity, double averageWattCapacity) {
        this.batteryDTOList = batteryDTOList;
        this.totalWattCapacity = totalWattCapacity;
        this.averageWattCapacity = averageWattCapacity;
    }
     protected SummaryDTO(){}

    public List<BatteryDTO> getBatteryDTOList() {
        return batteryDTOList;
    }

    public void setBatteryDTOList(List<BatteryDTO> batteryDTOList) {
        this.batteryDTOList = batteryDTOList;
    }

    public double getTotalWattCapacity() {
        return totalWattCapacity;
    }

    public void setTotalWattCapacity(double totalWattCapacity) {
        this.totalWattCapacity = totalWattCapacity;
    }

    public double getAverageWattCapacity() {
        return averageWattCapacity;
    }

    public void setAverageWattCapacity(double averageWattCapacity) {
        this.averageWattCapacity = averageWattCapacity;
    }
}

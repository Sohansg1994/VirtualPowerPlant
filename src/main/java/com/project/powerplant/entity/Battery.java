package com.project.powerplant.entity;

import javax.persistence.*;

@Entity
@Table(name = "batteryDetails")
public class Battery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batteryId;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String postCode;
    @Column(nullable = false)
    private double wattCapacity;


    public Battery(String name, String postCode, double wattCapacity) {
        this.name = name;
        this.postCode = postCode;
        this.wattCapacity = wattCapacity;
    }
    protected Battery(){
    }

    public int getBatteryId() {
        return batteryId;
    }

    public void setBatteryId(int batteryId) {
        this.batteryId = batteryId;
    }

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

package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public Boat (String name, int capacity){
        setName(name);
        setCapacity(capacity);
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

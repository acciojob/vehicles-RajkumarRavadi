package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        setWheels(wheels);
        setDoors(doors);
        setGears(gears);
        setManual(isManual);
        setType(type);
        setSeats(seats);
        setCurrentGear(1);//Initialize the gear to 1
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type) {
        // Set default seats value or handle this according to your logic
        this(name, wheels, doors, gears, isManual, type, 4); // Defaulting seats to 4
    }


    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        if (newSpeed < 0) {
            System.out.println("Invalid speed. Speed must be non-negative.");
            return;
        }
        setCurrentSpeed(newSpeed);
        setCurrentDirection(newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}

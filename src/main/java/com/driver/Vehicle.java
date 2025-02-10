package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        setName(name);
        setCurrentSpeed(0);
        setCurrentDirection(0);
    }

    public void steer(int direction){
        // Normalize direction to be between 0 and 360 degrees
        direction = direction % 360;
        if (direction < 0) {
            direction += 360; // Ensure negative directions are corrected
        }
        setCurrentDirection(direction);
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        if (speed < 0) {
            System.out.println("Invalid speed. Speed must be non-negative.");
            return; // Prevent setting negative speed
        }

        // Normalize direction between 0 and 360 degrees
        direction = direction % 360;
        if (direction < 0) {
            direction += 360; // Ensure negative directions are corrected
        }

        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        setCurrentSpeed(0);
        System.out.println("stop method called - The vehicle is stopped");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}

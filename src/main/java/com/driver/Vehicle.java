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
        direction = getCurrentDirection() + direction % 360;
        if (direction < 0) {
            direction += 360; // Ensure negative directions are corrected
        }
        setCurrentDirection(direction);
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction) {
        // Check for invalid speed (negative values)
        if (speed < 0) {
            setCurrentSpeed(0); // Set speed to 0 if negative
            //System.out.println("Invalid speed. Speed must be non-negative.");
            return; // Exit method early to prevent further execution with invalid speed
        }

        // Normalize direction between 0 and 360 degrees
        direction = direction % 360;  // Ensure the direction falls within the range [-360, 360)
        if (direction < 0) {
            direction += 360;  // Convert negative direction to positive by adding 360
        }

        // Update the speed and direction
        setCurrentSpeed(speed);  // Set the speed
        setCurrentDirection(direction);  // Set the direction

        // Optional: Log the changes for debugging (you might remove this in production)
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

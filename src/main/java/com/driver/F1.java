package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Call the constructor of Car with arbitrary values for unspecified parameters
        super(name, 4, 2, 6, isManual, "Sports", 2);  // Example arbitrary values
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;  // Calculate the new speed by adding rate to current speed

        // If speed is 0 or negative, stop the car and set gear to 1
        if (newSpeed <= 0) {
            newSpeed = 0;  // Ensure speed is 0 if it's negative
            super.stop();  // Stop the car
            changeGear(1);  // Set gear to 1 when the car is stopped
        } else {
            // Change gear based on speed ranges
            if (newSpeed <= 50) {
                changeGear(1);  // Gear 1 for speed <= 50
            } else if (newSpeed <= 100) {
                changeGear(2);  // Gear 2 for speed 51 to 100
            } else if (newSpeed <= 150) {
                changeGear(3);  // Gear 3 for speed 101 to 150
            } else if (newSpeed <= 200) {
                changeGear(4);  // Gear 4 for speed 151 to 200
            } else if (newSpeed <= 250) {
                changeGear(5);  // Gear 5 for speed 201 to 250
            } else {
                changeGear(6);  // Gear 6 for speed > 250
            }

            // Update the car speed and direction
            super.changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

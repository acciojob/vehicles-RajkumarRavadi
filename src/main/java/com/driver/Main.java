package com.driver;

public class Main {
    public static void main(String[] args) {
        // Testing F1 Class
        F1 mercedes = new F1("Mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);  // Test with negative acceleration

//        System.out.println("----Testing test case : testCar2----");
//
//        // Testing Car Class
//        Car car = new Car("Tata", 4, 4, 4, true, "Sedan");
//
//        // Checking initial values set by constructor
//        System.out.println(car.getName().equals("Tata"));
//        System.out.println(car.getDoors() == 4);
//        System.out.println(car.getGears() == 4);
//        System.out.println(car.getWheels() == 4);
//        System.out.println(car.isManual());
//        System.out.println(car.getType().equals("Sedan"));
//        System.out.println(car.getCurrentGear() == 1); // Check initial gear is 1
//
//        // Changing speed and direction, then checking the results
//        car.changeSpeed(20, 30);
//        System.out.println(car.getCurrentSpeed() == 20); // Speed should be 20
//        System.out.println(car.getCurrentDirection() == 30); // Direction should be 30
//
//        // Changing gear and checking the result
//        car.changeGear(3);
//        System.out.println(car.getCurrentGear() == 3); // Gear should be 3



    }
}

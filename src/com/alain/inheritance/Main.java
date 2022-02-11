package com.alain.inheritance;

public class Main {


    public static void main(String[] args) {



        //TODO Create an instance of your Car class and name it carOne. Pass in the appropriate arguments
        Car carOne = new Car(50, "White", "Kia", "Optima", false, 4);
        System.out.println(carOne.getModel());
        System.out.println(carOne.getCurrentSpeed());
        //TODO Create an instance of your Moto class and name it motoOne. Pass in the appropriate arguments
        Moto motoOne = new Moto(100, "Pink", "Ford", "moto1", true, 2);
        System.out.println(motoOne.getModel());
        System.out.println(motoOne.getCurrentSpeed());
        //TODO Call increaseSpeed() on carOne.
        carOne.increaseSpeed();
        System.out.println("Increase speed");
        System.out.println(carOne.getModel());
        System.out.println(carOne.getCurrentSpeed());

        //TODO Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)
//        System.out.println(motoOne.getCurrentSpeed());

        //TODO Call decreaseSpeed() on carOne.
        carOne.decreaseSpeed();
        System.out.println("Decrease speed");
        System.out.println(carOne.getModel());
        System.out.println(carOne.getCurrentSpeed());

        //TODO Using System.out.println print the current speed of carOne (You will need to use your getter for currentSpeed here)
//        System.out.println(motoOne.getCurrentSpeed());

        //TODO Call increaseSpeed() on motoOne.
        motoOne.increaseSpeed();
        System.out.println("Increase speed");
        System.out.println(motoOne.getModel());
        System.out.println(motoOne.getCurrentSpeed());

        //TODO Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)
//        System.out.println(motoOne.getCurrentSpeed());

        //TODO Call decreaseSpeed() on motoOne.
        motoOne.decreaseSpeed();
        System.out.println("Decrease speed");
        System.out.println(motoOne.getModel());
        System.out.println(motoOne.getCurrentSpeed());

        //TODO Using System.out.println print the current speed of motoOne (You will need to use your getter for currentSpeed here)
//        System.out.println(motoOne.getCurrentSpeed());

        //TODO Try to increase the speed of motoOne above it's max speed. This should not be allowed.
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.increaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());

        //TODO Try to decrease the speed of motoOne below 0. This should not be allowed.
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
        motoOne.decreaseSpeed();
        System.out.println(motoOne.getCurrentSpeed());
    }
}

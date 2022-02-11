package com.alain.inheritance;



public class Vehicle {
    //TODO  Add other instance variables here
    private int topSpeed;
    private int currentSpeed = 0;
    private String color;
    private String make;
    private String model;
    private boolean isElectric;

    //TODO Create your constructor here
    public Vehicle(int topSpeed, String color, String make, String model, boolean isElectric) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.make = make;
        this.model = model;
        this.isElectric = isElectric;
    }


    //TODO Create your getters and setters here
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    //TODO Create your increaseSpeed() method here
    public void increaseSpeed() {
        if(this.currentSpeed < topSpeed) {
            this.currentSpeed += 10;
        } else {
            System.out.println("Can't increase the speed because it reached to the top speed.");
        }
    }

    //TODO Create your decreaseSpeed() method here
    public void decreaseSpeed() {
        if(this.currentSpeed > 0) {
            this.currentSpeed -= 10;
        } else {
            System.out.println("Can't decrease the speed because it reached to stop.");
        }
    }



    //TODO Create a toString() method here to print the values of your objects



}

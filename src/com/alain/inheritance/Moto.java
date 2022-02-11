package com.alain.inheritance;

public class Moto extends Vehicle {

    //TODO Create your instance field here
    private int numOfSeats;

    //TODO Create your contructor here
    public Moto (int topSpeed, String color, String make, String model, boolean isElectric, int numOfSeats) {
        super(topSpeed, color, make, model, isElectric);
        this.numOfSeats = numOfSeats;
    }

    //TODO Create your getter and setter here
    public int getNumOfSeats() {
        return this.numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }


    //TODO Create your increaseSpeed method here
    @Override
    public void increaseSpeed() {
        if(getCurrentSpeed() < getTopSpeed()) {
            setCurrentSpeed(getCurrentSpeed() + 20);
        } else {
            System.out.println("Can't increase the speed because it reached to the top speed.");
        }
    }

}

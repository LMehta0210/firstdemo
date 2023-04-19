package edu.guilford;

public class Dice {
    
    //attributes
    private int sides;
    private int value;

    //constructor
    public Dice(int sides) {
        this.sides = sides;
    }

    //methods
    public int roll() {
        value = (int) (Math.random() * sides) + 1;
        return value;
    }

    public int getValue() {
        return value;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

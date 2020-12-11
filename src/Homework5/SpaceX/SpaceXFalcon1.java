package Homework5.SpaceX;

public class SpaceXFalcon1 {

    private int year;
    private int weight;
    private double length;
    private double diameter;

    public SpaceXFalcon1 () {

    }

    public SpaceXFalcon1 (int year, int weight, double length, double diameter) {
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.diameter = diameter;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    }

package Homework5.SpaceX;

public class SpaceXFalcon1 {

    private int year;
    private int weight;
    private double length;
    private double diameter;

   public SpaceXFalcon1 (int year, int weight, double length, double diameter) {
        this.setYear(year);
        this.setWeight(weight);
        this.setLength(length);
        this.setDiameter(diameter);
    }

    public void setYear(int year) {
       this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void info() {
        System.out.println("Falcon1 stats: Year:" + this.year + "Weight:" + this.weight + "Length:" + this.length + "Diameter:" + this.diameter);
    }

    }

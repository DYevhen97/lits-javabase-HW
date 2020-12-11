package Homework5.SpaceX;


public class SpaceX4_Falcon9Block5 extends SpaceX3_Falcon9FT {

    private int Capacity;
    private int Inoperable;

    public SpaceX4_Falcon9Block5(int year, int weight, double length, double diameter, boolean status, int TotalLaunches, int Capacity, int Inoperable) {
        super(year, weight, length, diameter, status, TotalLaunches);
        this.Capacity = Capacity;
        this.Inoperable = Inoperable;
        //Capacity - Capacity when landing

    }

    public int Capacity () {
        return Capacity;
    }
    public void setCapacity() {
        this.Capacity = Capacity;
    }

    public int getInoperable() {
        return Inoperable;
    }
    public void setInoperable(int inoperable) {
        if (Inoperable == 0) {
            System.out.println("This rocket in inoperable");
        } else if (Inoperable == 1) {
            System.out.println("This rocket is ready for launch");
        }
        this.Inoperable = inoperable;
    }
}

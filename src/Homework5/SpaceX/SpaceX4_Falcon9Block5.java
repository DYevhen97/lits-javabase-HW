package Homework5.SpaceX;

public class SpaceX4_Falcon9Block5 extends SpaceX3_Falcon9FT {

    public int Capacity;
    private int Inoperable;
    public SpaceX4_Falcon9Block5(int year, int weight, double length, double diameter, boolean Status, int TotalLaunches, int Capacity, int Inoperable) {
        super(year, weight, length, diameter, Status, TotalLaunches);
        this.Capacity = Capacity;
        this.Inoperable = Inoperable;
        //Capacity - Capacity when landing

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

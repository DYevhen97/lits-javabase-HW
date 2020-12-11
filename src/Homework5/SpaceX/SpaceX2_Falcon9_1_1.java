package Homework5.SpaceX;

public class SpaceX2_Falcon9_1_1 extends SpaceXFalcon1 {

    public boolean Status = false;

    public SpaceX2_Falcon9_1_1(int year, int weight, double length, double diameter, boolean Status) {
        super(year, weight, length, diameter);
    this.Status = Status;
    // Status - чи ще в розробці чи припинена розробка
    }
}

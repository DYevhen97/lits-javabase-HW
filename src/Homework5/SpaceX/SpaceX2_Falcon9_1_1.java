package Homework5.SpaceX;

public class SpaceX2_Falcon9_1_1 extends SpaceXFalcon1 {

    public boolean status;

  public SpaceX2_Falcon9_1_1(int year, int weight, double length, double diameter, boolean status) {
        super(year, weight, length, diameter);
    this.status = status;
    // Status - чи ще в розробці чи припинена розробка
    }
}

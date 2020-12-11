package Homework5.SpaceX;

public class SpaceX3_Falcon9FT extends SpaceX2_Falcon9_1_1 {

    private int TotalLaunches;

    public SpaceX3_Falcon9FT(int year, int weight, double length, double diameter, boolean status, int TotalLaunches) {
        super (year, weight, length, diameter, status);
        this.TotalLaunches = TotalLaunches;
    }
    public int TotalLaunches() {
        return TotalLaunches;
    }
    public void setTotalLaunches() {
        this.TotalLaunches = TotalLaunches;
    }
}

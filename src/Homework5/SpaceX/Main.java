package Homework5.SpaceX;

public class Main {

    public static void main(String[] args) {

        SpaceXFalcon1 spaceXFalcon1 = new SpaceXFalcon1 (2010, 28000, 21.0, 1.7);

        SpaceX2_Falcon9_1_1 spaceX2_falcon9_1_1 = new SpaceX2_Falcon9_1_1(2013, 505846, 68.4, 3.7, false);

        SpaceX3_Falcon9FT spaceX3_falcon9FT = new SpaceX3_Falcon9FT(2018, 549054, 70.0, 3.7, true, 101);

        SpaceX4_Falcon9Block5 spaceX4_falcon9Block5 = new SpaceX4_Falcon9Block5(2018, 549054, 70.0, 3.66, true, 45, 15600, 1);
    }
}

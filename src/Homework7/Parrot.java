package Homework7;

public class Parrot implements Bird{
    @Override
    public String getName() { return "Carl";}

    @Override
    public void feed() {
        System.out.println("Попугая покормили"); }
}

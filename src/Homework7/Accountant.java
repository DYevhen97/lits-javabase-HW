package Homework7;

public class Accountant {

    int ticketPrice = 100;

    public void income(int numberOfVisitors){
        int income = numberOfVisitors * ticketPrice;
        System.out.println("Good job. This days income is " + income + " hryvnias!");
    }
}

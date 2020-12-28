package Homework7;

public class Accountant {

    int j = 100;
    //j - ціна за квиток

    public void income(int numberofvisitors){
        int income = numberofvisitors * j;
        System.out.println("Good job. This days income is " + income + " hryvnias!");
    }
}

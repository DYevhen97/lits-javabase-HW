package Homework7;

public class Visitor {

    String visitorname1;

    public String getVisitorname1() {
        return "Олег";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname1() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname1() + " leaves the zoo.");
    }
}

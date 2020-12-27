package Homework7;

public class Visitor5 {
    String visitorname5;

    public String getVisitorname5() {
        return "Сергій";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname5() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname5() + " leaves the zoo.");
    }
}

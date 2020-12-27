package Homework7;

public class Visitor6 {
    String visitorname6;

    public String getVisitorname6() {
        return "Оксана";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname6() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname6() + " leaves the zoo.");
    }
}

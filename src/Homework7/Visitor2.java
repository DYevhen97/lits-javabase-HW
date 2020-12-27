package Homework7;

public class Visitor2 {
    String visitorname2;

    public String getVisitorname2() {
        return "Володя";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname2() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname2() + " leaves the zoo.");
    }
}

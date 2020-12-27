package Homework7;

public class Visitor4 {
    String visitorname4;

    public String getVisitorname4() {
        return "Коля";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname4() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname4() + " leaves the zoo.");
    }
}

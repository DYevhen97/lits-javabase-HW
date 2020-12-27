package Homework7;

public class Visitor3 {
    String visitorname3;

    public String getVisitorname3() {
        return "Марта";
    }
    public void enter(){
        System.out.println("Visitor " + getVisitorname3() + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + getVisitorname3() + " leaves the zoo.");
    }
}

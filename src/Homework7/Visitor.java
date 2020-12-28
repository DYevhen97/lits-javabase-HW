package Homework7;

public class Visitor {

    String visitorName;

    public Visitor(String VisitorName){
        this.visitorName = VisitorName;
    }
    public void enter(){
        System.out.println("Visitor " + visitorName + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + visitorName + " leaves the zoo.");
    }
}

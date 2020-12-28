package Homework7;

public class Visitor {

    String VisitorName;

    public Visitor(String VisitorName){
        this.VisitorName = VisitorName;
    }
    public void enter(){
        System.out.println("Visitor " + VisitorName + " enters the zoo. Pay up 100 hryvnias.");
    }

    public void exit(){
        System.out.println("The visitor " + VisitorName + " leaves the zoo.");
    }
}

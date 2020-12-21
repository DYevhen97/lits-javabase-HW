package Homework7;

public class ZooWorker extends Zoo {
    @Override
    public void available(){
        System.out.println("Ці робітники доступні та зоопарк відкритий");
    }
    public void dinner(){
        System.out.println("Наступив обід");
    }
    public void evening(){
        System.out.println("Наступив вечір та зоопарк зачиняється");
    }
}

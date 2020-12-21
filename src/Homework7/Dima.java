package Homework7;

public class Dima implements Zoo2{

    private Job job = Job.FEEDER;

    @Override
    public void available() { System.out.println("Дмитро доступний для інтерв'ю"); }

    @Override
    public void addWorker(AddingWorker addingWorker) {
        System.out.println("Проводиться інтерв'ю");
        AddingWorker.apply(Job.FEEDER);
        System.out.println("Дмитро найнятий як готівник");
    }
}

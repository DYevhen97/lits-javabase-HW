package Homework7;

public class ZooMain {
    public static void main(String[] args) {

        int numberOfVisitors = 0;
        Mammal alex = new Lion();
        Mammal george = new Monkey();
        Bird carl = new Parrot();
        Bird dima = new Peacock();
        Feeder feeder = new Feeder(alex);
        Cleaner cleaner = new Cleaner(alex);
        Feeder feeder2 = new Feeder(george);
        Cleaner cleaner2 = new Cleaner(george);
        Feeder feeder3 = new Feeder(carl);
        Cleaner cleaner3 = new Cleaner(carl);
        Feeder feeder4 = new Feeder(dima);
        Cleaner cleaner4 = new Cleaner(dima);

        System.out.println(DayTime.MORNING);
        Visitor visitor = new Visitor("Олег");
        Visitor visitor2 = new Visitor("Володя");
        Visitor visitor3 = new Visitor("Марта");
        Visitor visitor4 = new Visitor("Коля");
        visitor.enter();
        numberOfVisitors++;
        visitor2.enter();
        numberOfVisitors++;
        visitor3.enter();
        numberOfVisitors++;
        visitor4.enter();
        numberOfVisitors++;
        try {
            feeder.feedMammal();
        } catch (Error e){
            System.out.println(e);
        }
        try {
            feeder2.feedMammal();
        } catch (Error e){
            System.out.println(e);
        }
        feeder3.feedBird();
        feeder4.feedBird();

        System.out.println(DayTime.DAY);
        Visitor visitor5 = new Visitor("Сергій");
        Visitor visitor6 = new Visitor("Оксана");
        visitor5.enter();
        numberOfVisitors++;
        visitor6.enter();
        numberOfVisitors++;
        feeder.feedMammal();
        feeder.feedMammal();
        cleaner.cleanMammal();
        feeder2.feedMammal();
        cleaner2.cleanMammal();
        feeder3.feedBird();
        cleaner3.cleanBird();
        feeder4.feedBird();
        cleaner4.cleanBird();

        System.out.println(DayTime.EVENING);
        visitor.exit();
        visitor2.exit();
        visitor3.exit();
        visitor4.exit();
        visitor5.exit();
        visitor6.exit();
        Accountant accountant = new Accountant();
        accountant.income(numberOfVisitors);
    }
}


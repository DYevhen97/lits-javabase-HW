package Homework7;

public class ZooMain {
    public static void main(String[] args) {

        int i = 0;
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
        Visitor visitor = new Visitor();
        visitor.enter();
        i++;
        Visitor2 visitor2 = new Visitor2();
        visitor2.enter();
        i++;
        Visitor3 visitor3 = new Visitor3();
        visitor3.enter();
        i++;
        Visitor4 visitor4 = new Visitor4();
        visitor4.enter();
        i++;
        feeder.feedMammal();
        feeder2.feedMammal();
        feeder3.feedBird();
        feeder4.feedBird();

        System.out.println(DayTime.DAY);
        feeder.feedMammal();
        Visitor5 visitor5 = new Visitor5();
        visitor5.enter();
        i++;
        Visitor6 visitor6 = new Visitor6();
        visitor6.enter();
        i++;
        feeder.feedMammal();
        cleaner.CleanMammal();
        feeder2.feedMammal();
        cleaner2.CleanMammal();
        feeder3.feedBird();
        cleaner3.CleanBird();
        feeder4.feedBird();
        cleaner4.CleanBird();

        System.out.println(DayTime.EVENING);
        visitor.exit();
        visitor2.exit();
        visitor3.exit();
        visitor4.exit();
        visitor5.exit();
        visitor6.exit();
        Accountant accountant = new Accountant();
        accountant.income(i);
    }
}


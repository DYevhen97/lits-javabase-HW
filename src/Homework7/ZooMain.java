package Homework7;

public class ZooMain {
    public static void main(String[] args) {

        Mammal alex = new Lion();
        Mammal george = new Monkey();
        Bird carl = new Parrot();
        Bird dima = new Peacock();
        Feeder feeder = new Feeder(alex);
        Feeder feeder2 = new Feeder(george);
        Feeder feeder3 = new Feeder(carl);
        Feeder feeder4 = new Feeder(dima);
        feeder.feedMammal();
        feeder2.feedMammal();
        feeder3.feedBird();
        feeder4.feedBird();
        Cleaner cleaner1 = new Cleaner();
        cleaner1.setDayTime("Прибиральник працює днем");
        System.out.println(cleaner1.getDayTime());
    }
}


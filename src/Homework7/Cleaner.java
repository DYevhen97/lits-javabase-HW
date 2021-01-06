package Homework7;

public class Cleaner {

    private Mammal mammal;
    private Bird bird;

    public Cleaner(Mammal mammal) {
        this.mammal = mammal;
    }

    public Cleaner(Bird bird) {
        this.bird = bird;
    }

    public void cleanMammal() {
        System.out.println("Cleaner is cleaning after " + mammal.getName());
        mammal.feed();
    }
    public void cleanBird() {
        System.out.println("Cleaner is cleaning after " + bird.getName());
        bird.feed();
    }
}

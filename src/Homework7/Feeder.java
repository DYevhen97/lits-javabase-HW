package Homework7;

public class Feeder {
    private Mammal mammal;
    private Bird bird;

    public Feeder(Mammal mammal) {
        this.mammal = mammal;
    }

    public Feeder(Bird bird) {
        this.bird = bird;
    }

    public void feedMammal() {
        System.out.println("Worker is feeding " + mammal.getName());
        mammal.feed();
    }
    public void feedBird() {
        System.out.println("Worker is feeding " + bird.getName());
        bird.feed();
    }
}

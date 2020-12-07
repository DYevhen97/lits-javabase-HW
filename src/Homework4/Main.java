package Homework4;

public class Main {
    public static void main(String[] args) {

        Calculator one = new Calculator();

        Equations equations = new Equations();
        equations.adding(one);
        System.out.println(one.a + "+" + one.b + "=" + one.c);
        equations.subtracting(one);
        System.out.println(one.a + "-" + one.b + "=" + one.c);
        equations.multiplication(one);
        System.out.println(one.a + "*" + one.b + "=" + one.c);
        equations.division(one);
        System.out.println(one.a + "/" + one.b + "=" + one.c);
    }
}

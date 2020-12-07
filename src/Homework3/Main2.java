package Homework3;

import java.util.Arrays;
import java.util.Random;

public class Main2 {
    public static void main(String[] args){
        int [] a = new int [20];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(47);
            System.out.println(a[i]);
        }
        System.out.println(" ");
        int biggest = a[0];
        int smallest = a[0];
        for (int j=1; j<20; j++) {

            // а. Знайти набільше число

            if (biggest<a[j]){
                biggest = a[j];
            }

            // b. Знайти наменше число

            if (smallest>a[j]){
                smallest=a[j];
            }

            //c. Зробити масив в протилежному напрямі

            if (a[j]%2!=0){
                System.out.print(a[j]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Biggest " + biggest);
        System.out.println("Smallest " + smallest);
        for (int k=a.length-1; k>=0; k--){
            System.out.print(a[k]+" ");
        }
        System.out.println(" ");

        // e. Відсортувати масив любим відомим мав алгоритмом

        Arrays.sort(a);
        System.out.print(Arrays.toString(a));
        System.out.println(" ");
    }
}

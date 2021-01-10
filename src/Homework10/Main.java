package Homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountInformation accountInformation1 = new AccountInformation("Yevhen","Damrin", 23, "Secretary", "+38095078146", "yevhen@gmail.com", "Kossaka st.", "user");

        AccountInformation accountInformation2 = new AccountInformation("Oleh", "Kuzik", 48, "Administrator", "+380630288100", "olehk@gmail.com", "Lviv", "admin");

        Scanner in = new Scanner(System.in);

        String UserInput = "";
        while(!UserInput.equals("exit")) {
            System.out.println("Введіть логін:");
            System.out.println("Щоби вийти - напишіть exit");
            UserInput = in.nextLine();
            switch (UserInput) {
                case "user":
                    System.out.println("Welcome, user. Here is your information: " + accountInformation1.name);
                    System.out.println("The homework isn't ready yet.");
                    break;
                case "admin":
                    System.out.println("Welcome, admin. Here is everyones information: " + accountInformation1.name + " " + accountInformation1.role + " " + accountInformation2.name + " " + accountInformation2.role);
                    System.out.println("The homework isn't ready yet.");
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Login invalid");
            }
        }
    }
}

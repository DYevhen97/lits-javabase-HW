package Homework4;

public class Main2 {
    public static void main(String[] args) {

        Human one = new Human();
        one.name = "Євген";
        one.surname = "Дамрін";
        one.BornMonth = 10;

        Human two = new Human();
        two.name = "Марко";
        two.surname = "Кулик";
        two.BornMonth = 2;

        switch (one.BornMonth) {
            case 1:
                System.out.println(one.name + " " + one.surname + " родився в Січні");
                break;
            case 2:
                System.out.println(one.name + " " + one.surname + " родився в Лютому");
                break;
            case 3:
                System.out.println(one.name + " " + one.surname + " родився в Березні");
                break;
            case 4:
                System.out.println(one.name + " " + one.surname + " родився в Квітні");
                break;
            case 5:
                System.out.println(one.name + " " + one.surname + " родився в Травні");
                break;
            case 6:
                System.out.println(one.name + " " + one.surname + " родився в Червні");
                break;
            case 7:
                System.out.println(one.name + " " + one.surname + " родився в Липні");
                break;
            case 8:
                System.out.println(one.name + " " + one.surname + " родився в Серпні");
                break;
            case 9:
                System.out.println(one.name + " " + one.surname + " родився в Вересні");
                break;
            case 10:
                System.out.println(one.name + " " + one.surname + " родився в Жовтні");
                break;
            case 11:
                System.out.println(one.name + " " + one.surname + " родився в Листопаді");
                break;
            case 12:
                System.out.println(one.name + " " + one.surname + " родився в Грудні");
                break;
            default:
                System.out.println(" невідомо в якому місяці родився");
                break;
        }
        switch (two.BornMonth) {
            case 1:
                System.out.println(two.name + " " + two.surname + " родився в Січні");
                break;
            case 2:
                System.out.println(two.name + " " + two.surname + " родився в Лютому");
                break;
            case 3:
                System.out.println(two.name + " " + two.surname + " родився в Березні");
                break;
            case 4:
                System.out.println(two.name + " " + two.surname + " родився в Квітні");
                break;
            case 5:
                System.out.println(two.name + " " + two.surname + " родився в Травні");
                break;
            case 6:
                System.out.println(two.name + " " + two.surname + " родився в Червні");
                break;
            case 7:
                System.out.println(two.name + " " + two.surname + " родився в Липні");
                break;
            case 8:
                System.out.println(two.name + " " + two.surname + " родився в Серпні");
                break;
            case 9:
                System.out.println(two.name + " " + two.surname + " родився в Вересні");
                break;
            case 10:
                System.out.println(two.name + " " + two.surname + " родився в Жовтні");
                break;
            case 11:
                System.out.println(two.name + " " + two.surname + " родився в Листопаді");
                break;
            case 12:
                System.out.println(two.name + " " + two.surname + " родився в Грудні");
                break;
            default:
                System.out.println(" невідомо в якому місяці родився");
                break;
        }
    }
}

package Homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema movieName = new Cinema();
        movieName.AddMovie(new Moviescript("Sonic The Hedgehog", 10, 10));
        movieName.AddMovie(new Moviescript("Birds of Prey", 5, 8));
        movieName.AddMovie(new Moviescript("Star Wars Episode IX", 3, 3));
        movieName.AddMovie(new Moviescript("Marvel Endgame", 10, 10));

        Scanner in = new Scanner(System.in);

        System.out.println("Добрий вечір. Виберіть фільм:");
        movieName.ListMovie();
        String UserInput = "";
        while(!UserInput.equals("Вийти")){
            System.out.println("Виберіть фільм");
            System.out.println("'Список' щоби переглянути фільми");
            System.out.println("'Вийти' щоби вийти");
            UserInput = in.nextLine();
            switch (UserInput){
                case "Вийти" : break;
                case "Список" :
                    movieName.ListMovie();
                    break;
                default:
                    Moviescript film = movieName.FindMovie(UserInput);
                    if(film != null){
                        boolean booked = false;
                        while(!booked) {
                            System.out.println("Доступні сидіння:");
                            film.ShowPlaces();
                            System.out.println("Виберіть ряд:");
                            int rowInput = in.nextInt();
                            System.out.println("Виберіть сидіння:");
                            int seatInput = in.nextInt();
                            if (film.ReserveSeat(rowInput, seatInput)) {
                                System.out.println("Місце заброньовано " + rowInput + seatInput);
                                booked = true;
                            } else {
                                System.out.println("Місце зайнято. Вибрати інакше місце? Y/N");
                                String s = in.nextLine();
                                s = in.nextLine();
                                if(s.equals("N") || s.equals("n"))
                                    break;
                            }
                        }
                    }
                    else{
                        System.out.println("Фільма " + UserInput + " не знадено. Може ви помилку зробили?");
                    }
                    break;
            }
        }
    }

}

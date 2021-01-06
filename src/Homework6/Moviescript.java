package Homework6;

import java.io.Console;
import java.util.logging.XMLFormatter;

public class Moviescript {

    String name;
    boolean [] [] seats;
    int row;
    int seat;

    Moviescript(String moviename, int row, int seat){
    this.name = moviename;
    this.row = row;
    this.seat = seat;
    seats = new boolean[row][seat];
        for(int i=0; i<row; i++){
            for (int j = 0; j < seat; j++) {
                seats[i][j] = true;
            }
        }
    }
    public String getName(){
        return name;
    }
    public boolean ReserveSeat(int row, int seat){
        if(row >= this.row || seat >= this.seat){
            System.out.println("Row or seat is too big");
            return false;
        }
        if(seats[row-1][seat-1]) {
            seats[row-1][seat-1] = false;
            return true;
        }
        return false;
    }

    public boolean IsFree(int row, int seat){
        return seats[row-1][seat-1];
    }

    public void ShowPlaces(){
        System.out.println("======Екран======");
        for (int i = 0; i < row; i++) {
            System.out.print((i+1) + ": ");
            for (int j = 0; j < seat; j++) {
                System.out.print("[");
                if(seats[i][j])
                    System.out.print(j+1);
                else System.out.print("X");
                System.out.print("] ");
            }
            System.out.println("");
        }
    }
}

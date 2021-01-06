package Homework6;

import java.util.*;

public class Cinema {
    ArrayList<Moviescript> movieList;
    Cinema(){
        movieList = new ArrayList<Moviescript>();
    }
    void AddMovie(Moviescript movie){
        movieList.add(movie);
    }

    Moviescript FindMovie(String title){
        for (int i = 0; i < movieList.size(); i++) {
            if(movieList.get(i).getName().equals(title))
                return movieList.get(i);
        }
        return null;
    }

    void ListMovie(){
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println(movieList.get(i).getName());
        }
    }
}

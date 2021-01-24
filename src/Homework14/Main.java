package Homework14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
tasks.add(new Task("Harry Potter Sorcerer Stone", 1997, Type.Done, Arrays.asList("Book")));
tasks.add(new Task("Shrek", 2001, Type.Done, Arrays.asList("Movie")));
tasks.add(new Task("Marvel Endgame", 2019, Type.New, Arrays.asList("Movie")));
tasks.add(new Task("Mario Kart 8", 2014, Type.Playing, Arrays.asList("Game")));
tasks.add(new Task("Shrek", 1990, Type.New, Arrays.asList("Book")));
tasks.add(new Task("Don Quixote", 1612, Type.Reading, Arrays.asList("Book")));
tasks.add(new Task("The Simpsons", 1989, Type.Watching, Arrays.asList("Cartoon")));
tasks.add(new Task("Катерина", 1840, Type.Done, Arrays.asList("Book")));
tasks.add(new Task("Indiana Jones", 1981, Type.Done, Arrays.asList("Movie")));
tasks.add(new Task("Persona 4 Golden", 2012, Type.Done, Arrays.asList("Game")));
tasks.add(new Task("Family Guy", 1999, Type.New, Arrays.asList("Cartoon")));
tasks.add(new Task("Sonic The Hedgehog 2", 1992, Type.Done, Arrays.asList("Game")));
        tasks.stream()
        .map(e -> e.getTags())
        .flatMap(e -> e.stream)
        .forEach(System.out.println(e));
    }
}

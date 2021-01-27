package Homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
Task one = new Task("Harry Potter Sorcerer Stone", "1997", Type.Done, Arrays.asList("Book"));
Task two = new Task("Shrek", "2001", Type.Done, Arrays.asList("Movie"));
Task three = new Task("Marvel Endgame", "2019", Type.New, Arrays.asList("Movie"));
Task four = new Task("Mario Kart 8", "2014", Type.Playing, Arrays.asList("Game"));
Task five = new Task("Shrek", "1990", Type.New, Arrays.asList("Book"));
Task six = new Task("Don Quixote", "1612", Type.Reading, Arrays.asList("Book"));
Task seven = new Task("The Simpsons", "1989", Type.Watching, Arrays.asList("Cartoon"));
Task eight = new Task("Катерина", "1840", Type.Done, Arrays.asList("Book"));
Task nine = new Task("Indiana Jones", "1981", Type.Done, Arrays.asList("Movie"));
Task ten = new Task("Persona 4 Golden", "2012", Type.Done, Arrays.asList("Game"));
Task eleven = new Task("Family Guy", "1999", Type.New, Arrays.asList("Cartoon"));
Task twelve = new Task("Sonic The Hedgehog 2", "1992", Type.Done, Arrays.asList("Game"));
Task thirteen = new Task("Final Fantasy VII", "1997", Type.Done, Arrays.asList("Game"));
Task fourteen = new Task("Super Meat Boy", "2010", Type.Done, Arrays.asList("Game"));
Task fifteen = new Task("The Matrix", "1999", Type.Done, Arrays.asList("Movie"));
Task sixteen = new Task("Like A Dragon", "2007", Type.New, Arrays.asList("Movie"));
Task seventeen = new Task("item 17", "1985", Type.New, Arrays.asList("Book"));
Task eighteen = new Task("Dragon Ball", "1986", Type.Watching, Arrays.asList("Anime"));
Task nineteen = new Task("item 19", "2012", Type.New, Arrays.asList("Book"));
Task twenty = new Task("item 20", "1837", Type.Reading, Arrays.asList("Book"));
Task twentyone = new Task ("item 21", "2013", Type.Done, Arrays.asList("Game"));
Task twentytwo = new Task ("item 22", "2000", Type.Done, Arrays.asList("Movie"));
Task twentythree = new Task ("item 23", "1972", Type.Playing, Arrays.asList("Game"));
Task twentyfour = new Task ("item 24", "2020", Type.New, Arrays.asList("Movie"));
Task twentyfive = new Task ("item 25", "2015", Type.Watching, Arrays.asList("Cartoon"));
Task twentysix = new Task ("item 26", "1987", Type.Done, Arrays.asList("Game"));
Task twentyseven = new Task ("item 27", "2000", Type.Done, Arrays.asList("Movie"));
Task twentyeight = new Task ("item 28", "2016", Type.Done, Arrays.asList("Cartoon"));
Task twentynine = new Task ("item 29", "2019", Type.New, Arrays.asList("Movie"));
Task thirty = new Task ("item 30", "1990", Type.Reading, Arrays.asList("Book"));
Task thirtyone = new Task ("item 31", "2002", Type.New, Arrays.asList("Game"));
Task thirtytwo = new Task ("item 32", "1995", Type.Done, Arrays.asList("Cartoon"));
Task thirtythree = new Task ("item 33", "2000", Type.Reading, Arrays.asList("Book"));
Task thirtyfour = new Task ("item 34", "2009", Type.New, Arrays.asList("Book"));
Task thirtyfive = new Task ("item 35", "1996", Type.Done, Arrays.asList("Game"));
Task thirtysix = new Task ("item 36", "2014", Type.Done, Arrays.asList("Game"));
Task thirtyseven = new Task ("Star Wars Episode IV", "1977", Type.Done, Arrays.asList("Movie"));
Task thirtyeight = new Task ("item 38", "1978", Type.Reading, Arrays.asList("Book"));
Task thirtynine = new Task ("item 39", "2003", Type.New, Arrays.asList("Cartoon"));
Task fourty = new Task ("item 40", "2020", Type.Done, Arrays.asList("Game"));

tasks.add(one);
tasks.add(two);
tasks.add(three);
tasks.add(four);
tasks.add(five);
tasks.add(six);
tasks.add(seven);
tasks.add(eight);
tasks.add(nine);
tasks.add(ten);
tasks.add(eleven);
tasks.add(twelve);
tasks.add(thirteen);
tasks.add(fourteen);
tasks.add(fifteen);
tasks.add(sixteen);
tasks.add(seventeen);
tasks.add(eighteen);
tasks.add(nineteen);
tasks.add(twenty);
tasks.add(twentyone);
tasks.add(twentytwo);
tasks.add(twentythree);
tasks.add(twentyfour);
tasks.add(twentyfive);
tasks.add(twentysix);
tasks.add(twentyseven);
tasks.add(twentyeight);
tasks.add(twentynine);
tasks.add(thirty);
tasks.add(thirtyone);
tasks.add(thirtytwo);
tasks.add(thirtythree);
tasks.add(thirtyfour);
tasks.add(thirtyfive);
tasks.add(thirtysix);
tasks.add(thirtyseven);
tasks.add(thirtyeight);
tasks.add(thirtynine);
tasks.add(fourty);

 Long t = tasks.stream()
         .count();
        System.out.println(t);

        System.out.println("4. Знайти всі унікальні title");
        System.out.println("5. Знайти усі таски з унікальним title");
        tasks.stream()
                .map(task -> task.getTitle())
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("6. Знайти топ 10 тасків відсортованих за датою створення");
        tasks.stream()
                .sorted((i1, i2) -> i1.creationDate.compareTo(i2.creationDate))
                .limit(10)
                .forEach(e -> System.out.println(e.creationDate));

        System.out.println("8. Знайти всі унікальні tags у всіх тасках");
        tasks.stream()
                .map(e -> e.getTags())
                .flatMap(e -> e.stream())
                .distinct()
                .forEach(e -> System.out.println(e));

        System.out.println("9. Знайти всі прочитані (DONE) таски які мають tag 'Book'");
        long a = tasks.stream()
                .filter(task -> task.type.equals(Type.Done))
                .map(e -> e.getTags())
                .flatMap(e -> e.stream())
                .filter(tags -> tags.equals("Book"))
                .count();
        System.out.println(a);

        System.out.println("10. Сторити Саммарі з тайтлом для свіх тасків");
        tasks.stream()
                .forEach(e -> System.out.println(e.getTitle()));
    }
}

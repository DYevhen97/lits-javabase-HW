package Homework8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegulator {
    public static void main(String[] args){
    Pattern pattern = Pattern.compile("(\\D{19})(\\+{1}\\d+)");
    Matcher matcher = pattern.matcher("zenulche@gmail.com +380950708146");
    while (matcher.find()) {
      System.out.println(matcher.group(1));
      System.out.println(matcher.group(2));
    }
    }
}

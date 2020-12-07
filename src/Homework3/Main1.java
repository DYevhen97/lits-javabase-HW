package Homework3;

public class Main1 {
    public static void main(String[] word){
        String s = "noon";
        int length = s.length();
        int j = length/2;
        boolean flag = true;

        for (int i = 0; i < j; i++){
            int k = length - 1 - i;
            if (s.charAt(i) != s.charAt(k)){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}

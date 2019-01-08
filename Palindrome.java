package BasicQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine().replace(" ","");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        System.out.println(enter);
        stringBuilder.append(enter);
        stringBuilder1.append(enter);
        stringBuilder1.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder.toString().equals(stringBuilder1.toString()));

    }
}

package BasicQuestions;

import java.util.Scanner;

public class FactorialArmstrong {

    public static void main(String[] args){
        factorial();
        armstrong();
    }

    private static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x =n;
        for(int i = n;i>=1;i--){
            x = x-1;
            if(x==0){
                break;
            }
            n = n*x;
        }
        System.out.println(n);
    }
    private static void armstrong() {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();
        System.out.println(enter);
        int sum  = 0;
        for(int i =0;i<enter.length();i++){
            int n = Character.getNumericValue(enter.charAt(i));
            int cube = n*n*n;
            sum = sum + cube;
        }
        System.out.println(sum);
        if(Integer.toString(sum).equals(enter)){
            System.out.println("The given number is Armstrong Number");
        }else{
            System.out.println("The given number is not an Armstrong Number");
        }
    }
}

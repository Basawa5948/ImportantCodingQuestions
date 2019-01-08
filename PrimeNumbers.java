package BasicQuestions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int flag = 0;
        int M = N/2;
        for(int i =2;i<=M;i++){
            if(N%i==0)
                flag = 1;
        }
        if(flag == 0){
            System.out.println("The given number is prime");
        }else{
            System.out.println("The given number is not prime");
        }

        System.out.println("Enter the Number you want to print the prime numbers");
        int enter = scanner.nextInt();
        for(int i = 1;i<enter;i++){
            int prime = 0;
            int x = i / 2;
            for(int j = 2;j<=x;j++){
                if(i%j==0)
                    prime = 1;
            }
            if(prime == 0){
                System.out.println(i+" = prime");
            }else
                System.out.println(i+" = not prime");
        }
    }
}

package DataStructures;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        int search = scanner.nextInt();
        int flag = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]==search) {
                System.out.println("found you");
                flag = 1;
            }
        }
        if(flag!=1){
            System.out.println("sorry brah!!");
        }
    }
}

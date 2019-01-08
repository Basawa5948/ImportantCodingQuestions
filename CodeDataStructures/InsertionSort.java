package DataStructures;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i =1;i<a.length;i++){
            int j =i;
            while (j>0 && a[j-1]>a[j]){
                int key = a[j];
                a[j]=a[j-1];
                a[j-1] = key;
                j--;
            }
        }

        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

package DataStructures;

import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n+1];

        for(int i =0;i<n;i++)
            a[i] = scanner.nextInt();

        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+" ");

        int x = scanner.nextInt();
        int pos = scanner.nextInt();

        for(int i = (n-1);i>=(pos-1);i--)
            a[i+1] = a[i];

        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+" ");

        a[pos-1] = x;

        for(int i =0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}

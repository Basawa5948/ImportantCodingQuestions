package DataStructures;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args){
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i =0;i<N;i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0;i<a.length;i++){
            for(int j =0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }

        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}

package DataStructures;

import java.util.Scanner;

public class QucikSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        sortt(a,0,a.length-1);

        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void sortt(int[] a, int low, int high) {
        if(low<high){
            int p = partition(a,low,high);

            sortt(a,low,p-1);
            sortt(a,p+1,high);
        }
    }

    private static int partition(int[] a, int low, int high) {

        int pivot = a[high];
        int i = (low-1);
        for(int j = low;j<high;j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] =  temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }
}

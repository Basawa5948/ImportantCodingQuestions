package DataStructures;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }

        sortt(a);

        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void sortt(int[] a) {
        int n = a.length;

        for(int i = n/2-1;i>=0;i--)
            heapify(a,n,i);

        for(int i =n-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a,i,0);
        }
    }

    private static void heapify(int[] a, int n, int i) {

        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && a[l] > a[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && a[r] > a[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(a, n, largest);
        }
    }
}

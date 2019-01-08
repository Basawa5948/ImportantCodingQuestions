package DataStructures;

import java.util.Scanner;

public class CircularQueueDS {
    private  static int N;
    private  static int head = -1;
    private  static int tail = -1;
    private  static  int[] a;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        N = scanner.nextInt();
        a = new int[N];
        for(int i =0;i<N;i++){
            int enqueue_value = scanner.nextInt();
            circular_enqueue(enqueue_value);
        }
        for(int i =0;i<N;i++){
            int circular_dequeued_value = circular_dequeue();
            System.out.println("The value dequeued from the circular queue is :"+circular_dequeued_value);
        }
        for(int i =0;i<a.length;i++)
            System.out.println(a[i]);
        System.out.println(head+" "+tail);
        for(int i =0;i<N;i++){
            int enqueue_value = scanner.nextInt();
            circular_enqueue(enqueue_value);
        }
        for(int i =0;i<a.length;i++)
            System.out.println(a[i]);
        for(int i =0;i<N;i++){
            int circular_dequeued_value = circular_dequeue();
            System.out.println("The value dequeued from the circular queue is :"+circular_dequeued_value);
        }
        for(int i =0;i<a.length;i++)
            System.out.println(a[i]);
        int enqueue_value = scanner.nextInt();
        circular_enqueue(enqueue_value);
        for(int i =0;i<a.length;i++)
            System.out.println(a[i]);
    }

    private static int circular_dequeue() {
        if(head==-1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return a[head++];
    }

    private static void circular_enqueue(int enqueue_value) {
        if(head==N && tail==N-1){
            System.out.println("I AM IN");
            head=tail=-1;
        }
        if((tail==N-1 && head==0) || (tail == (head-1)%(N-1)))
            System.out.println("Circular Queue is full");
        else{
            if(head==-1)
                head++;
            a[++tail] = enqueue_value;
            System.out.println("The value entered in the circular queue is :"+ enqueue_value);
        }
    }
}

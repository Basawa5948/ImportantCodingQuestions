package DataStructures;

import java.util.Scanner;

public class QueueDS {
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
            enqueue(enqueue_value);
        }
        for(int i =0;i<N;i++){
            int dequeued_value = dequeue();
            System.out.println("The value removed from the queue is :"+ dequeued_value);
        }
        System.out.println(head+" "+tail);
    }

    private static int dequeue() {
        if(head==-1)
            System.out.println("Queue is empty");
        return a[head++];

    }

    private static void enqueue(int enqueue_value) {
        if(head==-1) {
            head++;
        }
        if(tail==N-1){
            System.out.println("Queue is Full");
        }else{
            a[++tail] = enqueue_value;
            System.out.println("The value added in the queue is :"+ enqueue_value);
        }
    }
}

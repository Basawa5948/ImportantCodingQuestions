package DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    private  static int N;
    private  static int head = -1;
    private  static int tail = -1;
    static Scanner scanner = new Scanner(System.in);
    private static Stack<Integer> s1 = new Stack<>();
    private static Stack<Integer> s2 = new Stack<>();

    public static void main(String[] args){
        N = scanner.nextInt();
        for(int i =0;i<N;i++) {
            int enqueue_value = scanner.nextInt();
            enqueue(enqueue_value);
        }
        for(int i =0;i<N;i++){
            int dequeued_value = dequeue();
            System.out.println("The value removed from the queue is :"+ dequeued_value);
        }

    }

    private static int dequeue() {
        int x,y;
        while(!s1.isEmpty())
        {
            x = s1.pop();
            s2.push(x);
        }
        y = s2.pop();
        while(!s2.isEmpty())
        {
            x = s2.pop();
            s1.push(x);
        }
        return y;
    }

    private static void enqueue(int enqueue_value) {
        if(head==-1) {
            head++;
        }
        if(tail==N-1){
            System.out.println("Queue is Full");
        }else{
            s1.push(enqueue_value);
            System.out.println("The value added in the queue is :"+ enqueue_value);
        }
    }
}

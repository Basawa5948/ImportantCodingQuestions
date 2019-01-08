package DataStructures;

import java.util.Scanner;

public class StackDS {

    static int tos = -1;
    static int N;
    static  int[] a;
    static int value;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new int[N];
        for(int i =0;i<N;i++){
            int push_num = scanner.nextInt();
            pushStack(push_num);
        }

        for(int i =0;i<N;i++){
            int result = popStack();
            System.out.print("The popped value is: "+result);
            System.out.println();
        }

    }

    public static int popStack() {
        if(tos<0)
            System.out.println("Stack UnderFlow");
        else {
            value = a[tos--];
        }
        return value;
    }

    public static void pushStack(int push_num) {
        if(tos>=a.length)
            System.out.println("Stack OverFlow");
        else {
            a[++tos] = push_num;
            System.out.println("The Pushed value is: "+push_num);
        }
    }
}

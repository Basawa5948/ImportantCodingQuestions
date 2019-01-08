package BasicQuestions;

public class FibonacciSeries {

    public static void main(String[] args){
        System.out.println("Printing the Fibonacci serires from 0 to n");
        printfib(8);
        System.out.println("");
        System.out.print("The nth term of the Fibonaccie series using recursive functions :"+" ");
        System.out.println(fib(8));
    }

    private static void printfib(int n) {
        int x =0;
        int y =1;
        int z = 0;
        System.out.print(x+" "+y+" ");
        for(int i =1;i<n;i++){
            z = x+y;
            System.out.print(z+" ");
            x = y;
            y = z;
        }
        System.out.println();
        System.out.println("The nth term of the given fibonaccie series without recursive function is : "+ z);
    }

    public static int fib(int n){
        int x =0;
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
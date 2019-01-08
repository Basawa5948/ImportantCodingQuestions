package BasicQuestions;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DiagonalMatrix {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] array1 = new int[N][N];

        for(int i =0;i<N;i++)
            for(int j =0;j<N;j++)
                array1[i][j] = scanner.nextInt();

        for(int i =0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int sum1 =0;
        for(int i =0;i<array1.length;i++){
            sum = sum + array1[i][i];
        }

        for(int i=0;i<array1.length;i++){
            sum1 = sum1 + array1[i][array1.length-i-1];
        }
        System.out.println(sum);
        System.out.println(sum1);

        int result = abs(sum-sum1);
        System.out.println(result);
    }
}

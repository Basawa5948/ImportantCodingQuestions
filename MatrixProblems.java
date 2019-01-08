package BasicQuestions;

import InterviewQuestions.Azuga_one;

import java.util.Scanner;

public class MatrixProblems {

    public static void main(String[] args){
        //AddMatrix();
        MultiplyMatrix();
        //TransposeMatrix();
    }

    private static void TransposeMatrix() {

    }

    private static void MultiplyMatrix() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];
        int[][] array3 = new int[N][M];

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                array1[i][j] = scanner.nextInt();

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                array2[i][j] = scanner.nextInt();

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                for(int k=0;k<N;k++)
                    array3[i][j] = array1[i][k]*array2[k][j];

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                System.out.print(array3[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void AddMatrix() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];
        int[][] array3 = new int[N][M];

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                array1[i][j] = scanner.nextInt();

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                array2[i][j] = scanner.nextInt();

        for(int i =0;i<N;i++)
            for(int j =0;j<M;j++)
                array3[i][j] = array1[i][j]+array2[i][j];

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                System.out.print(array3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

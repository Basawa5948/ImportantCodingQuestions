package AmazonQuestions;

import java.util.Scanner;

public class RotateMatrix90 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];
        for(int i =0;i<N;i++){
            for(int j =0;j<N;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0;i<N/2;i++){

            for(int j=i;j<N-i-1;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][N-1-i];
                matrix[j][N-1-i] = matrix[N-1-i][N-1-j];
                matrix[N-1-i][N-1-j] = matrix[N-1-j][i];
                matrix[N-1-j][i] = temp;

            }
        }

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

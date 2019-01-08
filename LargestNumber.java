package AmazonQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<N;i++){
            arrayList.add(scanner.nextInt());
        }
        int max = 0;
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<K;i++){
           for(int j =0;j<arrayList.size();j++){
               if(arrayList.get(j)>max) {
                   max = arrayList.get(j);
                   index = j;
               }
           }
            result.add(max);
            arrayList.set(index,0);
            max = 0;
        }
        System.out.println(result);
    }
}

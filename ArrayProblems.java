package BasicQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayProblems {

    public static void main(String[] args){
        ThirdLargestNumber();
        SecondLargestNumber();
        RemoveDuplicate();
    }

    private static void RemoveDuplicate() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);
        for(int i =0;i<arrayList.size();i++){
            int n = arrayList.get(i);
            for(int j =1;j<arrayList.size();j++){
                if(arrayList.get(j).equals(n))
                    arrayList.remove(arrayList.get(j));
            }
        }
        System.out.println(arrayList);
    }


    private static void SecondLargestNumber() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("The Second Largest Number in the given array is");
        System.out.println(arrayList.get(arrayList.size()-2));
    }

    private static void ThirdLargestNumber() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < N; i++) {
            arrayList.add(scanner.nextInt());
        }
        System.out.println(arrayList);
        for (int k = 0; k < 3; k++) {
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max)
                max = arrayList.get(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(max))
                arrayList.remove(arrayList.get(i));
        }
        result = max;
        }

        System.out.println("The Third Biggest element in the given array is");
        System.out.println(result);
    }
}

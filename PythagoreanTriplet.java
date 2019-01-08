package AmazonQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<N;i++){
            arrayList.add(scanner.nextInt());
        }

        for(int i =0;i<arrayList.size();i++){
            for(int j =i+1;j<arrayList.size();j++){
                for(int k = j+1;k<arrayList.size();k++){
                    int x = arrayList.get(i)*arrayList.get(i);
                    int y = arrayList.get(j)*arrayList.get(j);
                    int z = arrayList.get(k)*arrayList.get(k);
                    if(x==y+z || y==z+x || z==x+y){
                        System.out.println("These are the triplets which are Pythagorean in nature");
                        System.out.print(x+" "+y+" "+z);
                        System.out.println();
                    }else{
                        System.out.println("These are no triplets which are Pythagorean in nature");
                    }
                }
            }
        }
    }
}

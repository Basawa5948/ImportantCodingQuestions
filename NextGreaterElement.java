package AmazonQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class NextGreaterElement {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<N;i++){
            arrayList.add(scanner.nextInt());
        }
        int max = 0;
        for(int i =0;i<arrayList.size();i++){
            int a = arrayList.get(i);
            for(int j = i+1;j<arrayList.size();j++){
                if(arrayList.get(j)>a) {
                    max = arrayList.get(j);
                    break;
                }
            }
            if(max==0){
                System.out.println(a+" -> "+"-1");
            }
            else if(i==arrayList.size()-1){
                System.out.println(a+" -> "+"-1");
            }else {
                System.out.println(a + " -> " + max);
            }
        }
    }
}

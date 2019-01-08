package BasicQuestions;

import java.util.Scanner;

public class Lexography {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int n = in.nextInt();
        String smallest = "";
        String largest = "";
        for(int i =0;i<S.length()-n+1;i++){
            String sub = S.substring(i,i+n);
            System.out.print(sub+" ");

            if(i==0)
                smallest = sub;
            if(sub.compareTo(largest)>0)
                largest = sub;
            else if(sub.compareTo(smallest)<0)
                smallest = sub;
        }
        System.out.println();
        System.out.println(smallest);
        System.out.println(largest);
    }
}

package Assignments.Lesson12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int score = 0;
        try {
            System.out.println("Enter valid score");
            score = ob.nextInt();
            if(score>=0 && score <=100);
            System.out.println(score);
        }catch (UnsupportedOperationException e){
            System.out.println(e.toString());
        }catch (InputMismatchException e){
            System.out.println(e.toString());
        }

    }

}

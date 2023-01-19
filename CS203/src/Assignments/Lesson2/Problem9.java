package Assignments.Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem9 {
    public static void codonExtract(String s) {
        s = s.toUpperCase();
        ArrayList<String> codon = new ArrayList<>();
        int n = s.length();
        n = n - (n % 3);
        for (int i = 0; i < n; i += 3) {
            codon.add(s.substring(i, i + 3));
        }
        for (String cod : codon)
            System.out.print(" | " + cod + " | ");
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String ans = "";
        System.out.println("Enter DNA sequence");
        String cod = ob.nextLine();
        codonExtract(cod);
        do{
            System.out.println("");
            System.out.println("Do you want to continue (Y/N)?");
            ans = ob.nextLine();
            if (ans.equalsIgnoreCase("y")) {
                System.out.println("Enter another DNA sequence");
                cod = ob.nextLine();
                codonExtract(cod);
            }
        }while(!ans.equalsIgnoreCase("n"));
    }
}

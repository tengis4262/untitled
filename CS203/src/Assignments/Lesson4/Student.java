package Assignments.Lesson4;

import java.util.Scanner;

public class Student {
    private double q1,q2,q3;
    private double midTerm;
    private double finalExam;

    public Student(double q1,double q2, double q3, double midTerm ,double finalExam){
        this.q1 =q1;
        this.q2 =q2;
        this.q3 =q3;
        this.midTerm =midTerm;
        this.finalExam = finalExam;
    }
    public int quizFinal(){
        int qFin =(int)((q1+q2+q3)*25)/30;
        return qFin;
    }
    public int midTermFinal(){
        int mFin =(int)(midTerm*35)/100;
        return mFin;
    }
    public int finExamPercentage(){
        int finScore =(int)(finalExam*40)/100;
        return finScore;
    }
    public void FinalScore(){
        String gradeLetter = "";
        int finScore = quizFinal() + midTermFinal() + finExamPercentage();
        if(finScore>=90)
            gradeLetter = "A";
        else if (finScore>=80)
            gradeLetter = "B";
        else if (finScore>=70)
            gradeLetter = "C";
        else if (finScore>=60)
            gradeLetter = "D";
        else
            gradeLetter = "F";
        System.out.println("Student quiz 1: " + q1 + "\nStudent quiz 2: " + q2 + "\nStudent quiz 3: " + q3
         + "\nStudent midterm Score : " + midTerm + "\nStudent final exam score : " + finalExam + "\nStudent entire course score : " +
                finScore + " " + gradeLetter);

    }

    public static void main(String[] args) {
        double[] quizScore = new double[3];
        double mid;
        double fin;
        System.out.println("Provide your quiz scores one by one");
        Scanner ob = new Scanner(System.in);
        for (int i = 0; i < quizScore.length; i++) {
            quizScore[i]=ob.nextDouble();
        }
        System.out.println("Provide your midterm score");
        do{
            mid  = ob.nextDouble();
            if(mid>100 || mid<0)
                System.out.println("Please provide valid score (1-100)");
        }while(mid>100 || mid<0);
        System.out.println("Provide your final exam score");
        do{
            fin  = ob.nextDouble();
            if(fin>100 || fin<0)
                System.out.println("Please provide valid score (1-100)");
        }while(fin>100 || fin<0);
        Student std = new Student(quizScore[0],quizScore[1],quizScore[2],mid,fin);
        std.FinalScore();
    }
}

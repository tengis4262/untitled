package Assignments.Lesson2;

import java.util.Random;

public class Problem7 {
    static Random ran = new Random();
    static double[] days = new double[365];

    public static void generateTemps(){
        for (int i = 0; i < days.length; i++) {
            days[i] = -30 + ran.nextDouble(71);
        }
    }
    public static void hotAndCold(double[] days){
        int max = 0;
        int min = 0;
        for (int i = 0; i < days.length; i++) {
            if(days[i]>days[max])
                max = i;
            else if (days[i]<days[min]) {
                min =i;

            }
        }
        System.out.println("The Maximum temperature of the year is : " + days[max]);
        System.out.println("The Minimum temperature of the year is : " + days[min]);
    }

    public static void main(String[] args) {
        generateTemps();
        hotAndCold(days);
    }
}

package Assignments.Lesson2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Problem8 {
    static Random ran = new Random();
    static Scanner ob = new Scanner(System.in);
    public static ArrayList<String> fortune = new ArrayList<>();
    public static void generateFortunes(){
        fortune.add("Delight the world with compassion, kindness and grace");
        fortune.add("The early bird gets the worm, but the second mouse gets the cheese.");
        fortune.add("Some days you are pigeon, some days you are statue. Today, bring umbrella.");
        fortune.add("The fortune you seek is in another cookie.");
        fortune.add("Be on the alert to recognize your prime at whatever time of your life it may occur.");
        fortune.add("Your reality check about to bounce.");
        fortune.add("Tension is who you think you should be. Relaxation is who you are.");
        fortune.add("When blind leading the blind……..get out of the way.");
        fortune.add("Everyone seems normal until you get to know them.");
        fortune.add("Only difference between rut and a grave is depth.");
        fortune.add("Experience is what you have left when everything else gone.");
        fortune.add("A closed mouth gathers no feet.");
        fortune.add("A conclusion is simply the place where you got tired of thinking.");
        fortune.add("A cynic is only a frustrated optimist.");
        fortune.add("A foolish man listens to his heart. A wise man listens to cookies.");
        fortune.add("Your road to glory will be rocky but fulfilling.");
        fortune.add("Courage is not simply one of the virtues, but the form of every virtue at the testing point.");
        fortune.add("Patience is your alley at the moment. Don’t worry!");
        fortune.add("Nothing is impossible to a willing heart.");
    }
    public static void fortuneTeller(){
        int i = ran.nextInt(fortune.size());
        System.out.println(fortune.get(i));
    }

    public static void main(String[] args) {
        generateFortunes();
        System.out.println("Want to know your fortune\nY/N?");
        Scanner ob = new Scanner(System.in);
        String ans ="";
        while(!ans.equalsIgnoreCase("n")) {
            ans = ob.next();
            if (ans.equalsIgnoreCase("y"))
                fortuneTeller();
            System.out.println("Continue?\nY/N?");
        }
    }
}

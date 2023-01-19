package Assignments.Polymorphism;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PetsMain {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String aName = "";
        ArrayList<Pets> pet = new ArrayList<>();
        System.out.println("Enter your animal name and type followed(d/c)");
        while(true){
            aName= ob.nextLine();
            if (aName.equalsIgnoreCase("stop"))
                break;
            String[] values = aName.split(" ");
            String name = values[0];
            String type = values[1];
            System.out.println("Next animal or 'Stop' to quit");
            if (type.toLowerCase().startsWith("c"))
                pet.add(new Cat(name));
            if (type.toLowerCase().startsWith("d"))
                pet.add(new Dog(name));
        }


        for (Pets p :pet) {
            if(p instanceof Dog)
                System.out.println(p.getName() + " is a dog");
            else if(p instanceof Cat)
                System.out.println(p.getName() + " is a cat");
        }

    }


}

package Assignments.Lesson3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exponential {

//    public static void main(String[] args) {
//        Scanner ob = new Scanner(System.in);
//        System.out.println("Enter base number");
//        double base = ob.nextDouble();
//        System.out.println("Enter exponential of base number");
//        int exp = ob.nextInt();
//        System.out.println(pow(base,exp));
//        double expectedAnswer = 16.0;
//        double returnedAnswer = pow(2.0,4);
//        System.out.println("Expected 16, Returned: " + pow(2.0,4));
//    }


    public double pow(double base, int exp){
        if(exp==0)
            return 1;
        return base * pow(base,exp-1);
    }
//    class ExponentialTest{
//        @Test
//        void Exponential(){
//            assertEquals(8,pow(2,3));
//        }
//
//
//    }

}

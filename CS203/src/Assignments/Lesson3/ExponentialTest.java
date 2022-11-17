package Assignments.Lesson3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentialTest {
    @Test
    void Exponential(){
    Exponential problem = new Exponential();
    assertEquals(8 , problem.pow(2,3));

    }

}
package Assignments.Lesson3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MinCharTest {
    @Test
    void MinChar(){
        MinChar test = new MinChar();
        assertEquals('A', test.minChar("HelloA",0));
    }
}

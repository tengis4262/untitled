package Assignments.Lesson4;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordCountTest {
    @Test
    void WordCount(){
        WordCount test = new WordCount();
        assertEquals(3,test.wordCount("Haskaa"));
    }

}
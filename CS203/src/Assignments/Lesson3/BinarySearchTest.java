package Assignments.Lesson3;
import Assignments.Lesson3.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BinarySearchTest {
    @Test
    void BinarySearch(){
        BinarySearch test = new BinarySearch();
        int[] arr = {1, 2, 5, 1, 4, 7, 8};
        assertEquals(4,test.binarySearch(arr,0,arr.length,4));
    }
}
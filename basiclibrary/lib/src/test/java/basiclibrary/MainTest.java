package basiclibrary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("the array lenth should be as the parameter we inter for how many flips")
    void someCheckforRollMethode() {
        Main classUnderTest = new Main();
        int[] array=classUnderTest.roll(5);
        assertEquals(5, array.length);
    }
    @Test
    @DisplayName("the methode sould return true if any dublicate numbers")
    void someCheckforcontainsDuplicatesMethode() {
        int[] test_Dublicate={1,2,9,6,7};
        Main classUnderTest = new Main();
        boolean result=classUnderTest.containsDuplicates(test_Dublicate);
        assertEquals(false, result);
    }
    @Test
    @DisplayName("the methode sould return the average of array")
    void someCheckforaverageMethode() {
        int[] test_Dublicate={1,2,9,6,7};
        Main classUnderTest = new Main();
        double result=classUnderTest.average(test_Dublicate);
        assertEquals(5.0, result);
    }
    @Test
    @DisplayName("the methode sould return true if any dublicate numbers")
    void someCheckforaverageOfArraysMethode() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Main classUnderTest = new Main();
        double result=classUnderTest.averageOfArrays(weeklyMonthTemperatures);
        assertEquals(57.0, result);
    }

}

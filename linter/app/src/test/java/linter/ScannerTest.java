package linter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
 class ScannerTest {

        @Test
        @DisplayName("Test the linter on a file that contains no errors.")
        void someCheckforScannerRead1Methode() {

            ScannerRead classUnderTest = new ScannerRead();
             String x=classUnderTest.Scan("linter/app/src/test/resources/gates.js");

            assertEquals(false, x.contains("semicolon"));
            System.out.println("----------------------------------------------------------------");
        }
     @Test
     @DisplayName("Test the linter on a file that contains one error.")
     void someCheckforScannerRead2Methode() {

         ScannerRead classUnderTest = new ScannerRead();
         String x=classUnderTest.Scan("./app/src/test/resources/gates-1.js");
         assertEquals(true, x.contains("semicolon"));
         System.out.println("----------------------------------------------------------------");
     }
     @Test
     @DisplayName("Test the linter on a file that contains few errors.")
     void someCheckforScannerRead3Methode() {

         ScannerRead classUnderTest = new ScannerRead();
         String x=classUnderTest.Scan("./app/src/test/resources/gates-2.js");
         assertEquals(true, x.contains("semicolon"));
         System.out.println("----------------------------------------------------------------");
     }
     @Test
     @DisplayName("Test the linter on a file that contains many errors.")
     void someCheckforScannerRead4Methode() {

         ScannerRead classUnderTest = new ScannerRead();
         String x=classUnderTest.Scan("./app/src/test/resources/gates-3.js");
         assertEquals(true, x.contains("semicolon"));
         System.out.println("----------------------------------------------------------------");
     }
     @Test
     @DisplayName("Test the linter on an empty file.")
     void someCheckforScannerRead5Methode() {

         ScannerRead classUnderTest = new ScannerRead();
         String x=classUnderTest.Scan("./app/src/test/resources/gates-4.js");
         assertEquals(false, x.contains("semicolon"));
         System.out.println("----------------------------------------------------------------");
     }
}

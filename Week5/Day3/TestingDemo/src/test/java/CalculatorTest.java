import com.SpringSiraj.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    Calculator c1;
    @BeforeEach
    void  setup(){
        c1 = new Calculator();
    }
    @Test
    @DisplayName("Sould add two nums.. ")
    void  shouldAddNums(){
//        Calculator c;
//        @BeforeEach
//        void setup(){
//            c= new Calculator();
//        }
//        Calculator c = new Calculator();
        assertEquals(5, c1.add(2,3));

    }

    @Test
    @DisplayName("Checks if age > 18")
    void chekout(){
        assertTrue(22>=18);
    }

    @Test
    @DisplayName("Checking divide by Zero")
    void chechDivider(){
        assertThrows(
                IllegalArgumentException.class,
                ()->c1.divide(5,0)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    @DisplayName("Checking the evens")
    public void check(int n){
        assertTrue(n%2==0);
    }

    @ParameterizedTest
//    @ValueSource(ints = {2,4,6,8,10})
    @CsvSource({
            "2,3,5",
            "5,3,8",
            "8,12,20"
    })
    @DisplayName("Checking the addings")
    public void checkEquals(int a, int b, int e){
//        assertTrue(n%2==0);
        assertEquals(a+b,  e);
    }


}

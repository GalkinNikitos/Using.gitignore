import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void additional(){
        assertEquals(2, calculator.addition(1, 1));
    }
    @Test
    void difference(){
        assertEquals(1, calculator.subtraction(3, 2));
    }
    @Test
    void composition(){
        assertEquals(10, calculator.multiplication(2, 5));
    }
    @Test
    void theMeaningOfThePrivate(){
        assertEquals(4, calculator.division(100, 25));
    }
}

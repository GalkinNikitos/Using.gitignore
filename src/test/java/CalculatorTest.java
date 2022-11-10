import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void additional(){
        assertEquals(3, calculator.addition(1, 1));
    }
}

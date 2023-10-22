import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.gbhw.Calculator;

public class CalculatorTest {

    @Test
    public void testCalculatingDiscount(){
        Calculator calculator = new Calculator();

        double result1 = calculator.calculatingDiscount(100, 10);
        assertThat(result1).isEqualTo(90);

        double result2 = calculator.calculatingDiscount(0, 20);
        assertThat(result2);

        assertThatThrownBy(() -> calculator.calculatingDiscount(-100, 15))
        .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");

        assertThatThrownBy(() -> calculator.calculatingDiscount(100, -15))
        .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");

        assertThatThrownBy(() -> calculator.calculatingDiscount(100, 120))
        .isInstanceOf(ArithmeticException.class).hasMessage("Invalid arguments");
    }
}

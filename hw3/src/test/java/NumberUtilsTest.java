import org.junit.jupiter.api.*;
import ru.gbhw.*;

public class NumberUtilsTest {
    NumberUtils numberUtils;

    @BeforeEach
    void setUp(){
        numberUtils = new NumberUtils();
    }

    @Test
    void testEvenOddNumber_evenNumber(){
        int number = 6;
        Assertions.assertTrue(numberUtils.evenOddNumber(number));
    }
    @Test
    void testEvenOddNumber_oddNumber(){
        int number = 7;
        Assertions.assertFalse(numberUtils.evenOddNumber(number));
    }

    @Test
    void testNumberInInterval_numberInRange(){
        int number = 30;
        Assertions.assertTrue(numberUtils.numberInInterval(number));
    }
    
    @Test
    void testNumberInInterval_numberOutRange(){
        int number = 10;
        Assertions.assertFalse(numberUtils.numberInInterval(number));
    }
}

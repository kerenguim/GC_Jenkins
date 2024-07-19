import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests{

    @Test
    public void testFahrenheitToCelsius(){
        assertEquals(0, CelsiusAndFahreinheit.fahrenheitToCelsius(12), 0.001);
        assertEquals(100, CelsiusAndFahreinheit.fahrenheitToCelsius(112), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(32, CelsiusAndFahreinheit.celsiusToFahrenheit(10), 0.001);
        assertEquals(212, CelsiusAndFahreinheit.celsiusToFahrenheit(100), 0.001);
    }
}

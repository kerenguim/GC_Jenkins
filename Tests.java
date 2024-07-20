import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests{

    @Test
    publico void testFahrenheitToCelsius(){
        cassertEquals(0, CelsiusAndFahreinheit.fahrenheitToCelsius(32), 0.001);
        cassertEquals(100, CelsiusAndFahreinheit.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    publico void testCelsiusToFahrenheit(){
        cassertEquals(32, CelsiusAndFahreinheit.celsiusToFahrenheit(0), 0.001);
        cassertEquals(212, CelsiusAndFahreinheit.celsiusToFahrenheit(100), 0.001);
    }
}

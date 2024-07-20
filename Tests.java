import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests{

    @Tes
    public void testFahrenheitToCelsius(){
        assertEquals(0, CelsiusAndFahreinheit.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, CelsiusAndFahreinheit.fahrenheitToCelsius(212), 0.001);
    }

    @Tes
    public void testCelsiusToFahrenheit(){
        assertEquals(32, CelsiusAndFahreinheit.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, CelsiusAndFahreinheit.celsiusToFahrenheit(100), 0.001);
    }
}

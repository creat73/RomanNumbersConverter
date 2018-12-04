import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersConverterTest {
    RomanNumbersConverter converter = new RomanNumbersConverter();

    @Test
    public void convertingNumberOutsideLimitShouldReturnNull() {
        int numberBelowLimit = converter.getCONVERSION_MIN() -1;
        int numberOverLimit = converter.getConversionUpperLimit() +1;

        Assert.assertNull(converter.Convert(numberBelowLimit));
        Assert.assertNull(converter.Convert(numberOverLimit));
    }
}
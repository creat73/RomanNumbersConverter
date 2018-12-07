import org.junit.Assert;
import org.junit.Test;

public class RomanNumbersConverterTest {
    RomanNumbersConverter converter = new RomanNumbersConverter();

    @Test
    public void convertingNumberOutsideLimitShouldReturnNull() {
        int numberBelowLimit = converter.getCONVERSION_MIN() -1;
        int numberOverLimit = converter.getCONVERSION_MAX() +1;

        Assert.assertNull(converter.Convert(numberBelowLimit));
        Assert.assertNull(converter.Convert(numberOverLimit));
    }

    @Test
    public void convertingLowestNumberShouldReturnI(){
        Assert.assertEquals("I", converter.Convert(converter.getCONVERSION_MIN()));
    }

    @Test
    public void convertingHighestNumberShouldReturnMMMMCMXCIX(){
        Assert.assertEquals("MMMMCMXCIX", converter.Convert(converter.getCONVERSION_MAX()));
    }



}
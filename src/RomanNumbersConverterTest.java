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
    public void converting4ShouldReturnIV(){
        Assert.assertEquals("IV",converter.Convert(4));
    }

    @Test
    public void converting9ShouldReturnIX(){
        Assert.assertEquals("IX",converter.Convert(9));
    }

    @Test
    public void converting49ShouldReturnXLIX(){
        Assert.assertEquals("XLIX",converter.Convert(49));
    }

    @Test
    public void converting99ShouldReturnXCIX(){
        Assert.assertEquals("XCIX",converter.Convert(99));
    }

    @Test
    public void converting499ShouldReturnCDXCIX(){
        Assert.assertEquals("CDXCIX",converter.Convert(499));
    }

    @Test
    public void converting999ShouldReturnCMXCIX(){
        Assert.assertEquals("CMXCIX",converter.Convert(999));
    }

    @Test
    public void convertingHighestNumberShouldReturnMMMMCMXCIX(){
        Assert.assertEquals("MMMMCMXCIX", converter.Convert(converter.getCONVERSION_MAX()));
    }



}
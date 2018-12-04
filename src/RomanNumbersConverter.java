
public class RomanNumbersConverter {
    private final String[] ROMAN_VALUES = new String[] {"I", "V", "X", "L", "C", "D", "M"};
    // Conversion limitation due to lack of higher roman symbols
    private final int conversionUpperLimit = 4999;
    private final int conversionLowerLimit = 1;


    public String Convert(int number){

        if(number < conversionLowerLimit || number > conversionUpperLimit){
            return null;
        }

        String romanNumber = "";
        return romanNumber;
    }

}

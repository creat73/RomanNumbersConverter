
public class RomanNumbersConverter {
    private final String[] ROMAN_VALUES = new String[] {"I", "V", "X", "L", "C", "D", "M"};
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


public class RomanNumbersConverter {
    private final String[] ROMAN_VALUES = new String[] {"I", "V", "X", "L", "C", "D", "M"};
    // Conversion limitation due to lack of higher roman symbols
    private final int CONVERSION_MAX = 4999;
    private final int CONVERSION_MIN = 1;
    private final int MAX_INDEX_VALUE = ROMAN_VALUES.length -1;

    // Converts integer to its representation as roman numeral (String)
    public String Convert(int number){

        if(number < CONVERSION_MIN || number > CONVERSION_MAX){
            return null;
        }

        String romanNumber = "";
        String numberAsString = String.valueOf(number);
        // Index of the base symbol from list
        int symbolIndex =  numberAsString.length() * 2 - 2;

        // Iterates through every digit in number
        for(int i=0; i<numberAsString.length(); i++){
            // Current digit converted back from String to int
            int digit = Character.getNumericValue(numberAsString.charAt(i));

            if(digit==9){
                romanNumber += ROMAN_VALUES[symbolIndex] + ROMAN_VALUES[symbolIndex+2];
                digit = 0;
            }
            else if(digit>=5){
                romanNumber += ROMAN_VALUES[symbolIndex+1];
                digit -= 5;
            }
            else if(digit==4 && symbolIndex != MAX_INDEX_VALUE){
                romanNumber += ROMAN_VALUES[symbolIndex] + ROMAN_VALUES[symbolIndex +1];
                digit = 0;
            }

            romanNumber += new String(new char[digit]).replace("\0", ROMAN_VALUES[symbolIndex]);
            symbolIndex -=2;
        }
        return romanNumber;
    }

    // Getters for testing
    public int getConversionUpperLimit() {
        return CONVERSION_MAX;
    }

    public int getCONVERSION_MIN() {
        return CONVERSION_MIN;
    }

}

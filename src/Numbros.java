import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Numbros {
    public static void main(String[] args) {

// STRING to INT PARSE, DOUBLE PARSING HAS OTHER PARSING METHODS AVAILABLE
// INFERRED DATA TYPING --> VAR

        String numberString = "174";

        Double parsedDouble = Double.parseDouble(numberString);
        System.out.println(parsedDouble);

//      Byte parsedByte = Byte.parseByte(numberString);//NumberFormatException:Value out of range.
        Byte parsedByte = parsedDouble.byteValue();
        System.out.println(parsedByte);//-82

//        var parsedInt = Integer.parseInt(numberString);//NumberFormatException:Value out of range.
        var parsedInt = parsedDouble.intValue();
        System.out.println(parsedInt);

        var parseFloat = Float.parseFloat(numberString);
        System.out.println(parseFloat);

        var toStringedParsing = parsedDouble.toString();
        System.out.println(toStringedParsing);


// UNSIGNED INTEGER; NOT positive or negative
        var unsigned = Integer.parseUnsignedInt("30000000");
        System.out.println("unsigne value: " + unsigned);
        var divideUnsigned = unsigned / 2;
        System.out.println("divideUnsigned : " + divideUnsigned);

//bigdecimal unless "" is very big!!!
        BigDecimal bigDecimaaaaal=new BigDecimal(1234.5678);
        System.out.println(bigDecimaaaaal);//1234.567800000000033833202905952930450439453125
        BigDecimal bigDecimuul=new BigDecimal("1234.5678");
        System.out.println(bigDecimuul);
        

        // BIG DECIMALS, BIG INTIGERS
        double value = .012;
        double primitiveSum = value + value + value;
        System.out.println("primitiveSum " + primitiveSum);//sum should be 0.036, but not
//        thats why (ESPECIALLY)bigdecimal and biginteger is usefull to fix

//        BIGDECIMAL FROM STRING
        String toStringValue = Double.toString(value);
        BigDecimal bigDecimal = new BigDecimal(toStringValue);
        var bigSum = bigDecimal.add(bigDecimal).add(bigDecimal);
        System.out.println("bigSum " + bigSum);

//        BIG DECIMAL FROM DOUBLE
//        var bigDecim= new BigDecimal(value);
//        System.out.println(bigDecim);//0.0120000000000000002498001805406602215953171253204345703125
//        var bigDecSum = bigDecim.add(bigDecim).add(bigDecim);
//        System.out.println(bigDecSum);//0.0360000000000000007494005416219806647859513759613037109375

// BIGINTEGER
        var intVal = (int) value;
        System.out.println(intVal);//double casted as int = 0

// WIDENING : TO PUT MORE PRECISE VALUE TO LESS PRECISE (VS NARROWING)
        short short1 = 100;
        int int1 = short1;
        System.out.println(short1);
        System.out.println(int1);

//  NARROWING COMES WITH FORCING(CASTING IS ABOUT INSTANCES OF CLASSES, THIS IS CONVERSION)
//        short short2= int1;//java: incompatible types: possible lossy conversion from int to short
        short short2 = (short) int1;
        System.out.println(short2);


        //NUMBERs in a FORMAT... and there is string.format also!!!
        var someDouble = 123_494_834_859_950.89752;
        var numberFormat= NumberFormat.getNumberInstance();
        var intFormat = NumberFormat.getIntegerInstance();

        System.out.println(numberFormat.format(someDouble));//123,494,834,859,950.89

        System.out.println(intFormat.format(someDouble));//123,494,834,859,951
        intFormat.setGroupingUsed(false);
        System.out.println(intFormat.format(someDouble));//123494834859951

//   ENABLING LOCALIZED NUMBER SYSTEMS AND GET CURRENCY
//        1-lokal object created
        var anyCountry = new Locale("tr","TR");
//        2-lokalformat object created
        var anyCountryFormat=NumberFormat.getInstance(anyCountry);
//        3-lokalformat implemented to someDouble
        System.out.println(anyCountryFormat.format(someDouble));//123.494.834.859.950,89
//        4-lokalCurrency object created (for anyCountry)
       var anyCountryCurrency = NumberFormat.getCurrencyInstance(anyCountry);
//       5-lokalCurrency implemented to someDouble
        System.out.println(anyCountryCurrency.format(someDouble));//₺123.494.834.859.950,89

// DECIMAL FORMAT
 var decimalFormat = new DecimalFormat("NOK.00");
        System.out.println(decimalFormat.format(1));//NOK1.00
    }
}

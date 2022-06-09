import java.math.BigDecimal;
import java.math.BigInteger;

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

    }
}

public class Wrapper {
    public static void main(String[] args) {
        /*
        a usage example for wrappers
         */
        String stringDouble = "165.9";
        Double realDouble = Double.parseDouble(stringDouble);
        var doubleValue = Double.parseDouble(stringDouble);
        var byteValue = realDouble.byteValue();
        var intValue = realDouble.intValue();
        var floatValue = realDouble.floatValue();
        var stringValue = realDouble.toString();
        System.out.println("stringDouble "+stringDouble);
        System.out.println("realDouble "+realDouble);
        System.out.println("doubleValue "+doubleValue);
        System.out.println("byteValue "+byteValue);
        System.out.println("intValue "+intValue);
        System.out.println("floatValue "+floatValue);
        System.out.println("stringValue "+stringValue);

        /*
        primitive values are always signed
        unsigned integers
        long and integer support unsigned
         */
        var unsigned = Integer.parseUnsignedInt("300000000");
        System.out.println("unsigned value is " + unsigned);
        var result = Integer.divideUnsigned(unsigned,2);
        System.out.println("result is "+result);

    }
}

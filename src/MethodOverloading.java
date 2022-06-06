public class MethodOverloading {
    private static int propogateGivenNumber (int givenNumber){
        int propagation = givenNumber * givenNumber;
        System.out.println("propagated result: "+propagation);
        return propagation;
    }

    //    Overloading by changing the number of parameters
    private static int propogateGivenNumber (int firstNumber, int secondNumber){
        int propagation = firstNumber * secondNumber;
        System.out.println("propagated result: "+propagation);
        return propagation;
    }
    // Overloading by changing the data type of parameters
    private static double propogateGivenNumber (double firstNumber, double secondNumber){
        double propagation = firstNumber + secondNumber;
        System.out.println("propagated result: "+propagation);
        return propagation;
    }


    //        java: non-static method propogateGivenNumber(double,double)
//        cannot be referenced from a static context
    public static void main(String[] args) {
        MethodOverloading.propogateGivenNumber(7);
        MethodOverloading.propogateGivenNumber(3,87);
        MethodOverloading.propogateGivenNumber(5.6,7.9);
        propogateGivenNumber(7);
        propogateGivenNumber(4,6);
        propogateGivenNumber(4.3,3.6);
    }
}

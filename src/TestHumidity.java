public class TestHumidity {
    //option + enter: create test

    public double getHumidity(double temprature, double heigt){
        double humidity=(((temprature*temprature)/heigt)*10);
        System.out.println(humidity);
        return humidity;
    }

    public static void main(String[] args) {
        TestHumidity california = new TestHumidity();
//       var result= california.getHumidity(2,2);
//        System.out.println(result);
//        System.out.println(california.getHumidity(3,3));
    }
}
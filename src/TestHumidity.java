public class TestHumidity {
    //option + enter: create test

    public double getHumidity(double temprature, double heigt){
        double humidity=(((temprature*temprature)/heigt)*10);
        System.out.println(humidity);
        return humidity;
    }

    public static void main(String[] args) {
        TestHumidity california = new TestHumidity();
        california.getHumidity(2,2);
    }
}
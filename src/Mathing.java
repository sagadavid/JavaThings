public class Mathing {
    public static void main(String[] args) {
        double doubleValue = 2.09999999;
        long roundedLong = Math.round(doubleValue);
        System.out.println(roundedLong);//2
        var absolutValue = Math.abs(doubleValue);
        System.out.println(absolutValue);
    }
}

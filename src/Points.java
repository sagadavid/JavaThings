import java.awt.*;

public class Points {

    public Points(int i, int i1) {
    }

    public static void main(String[] args) {
        Point nokta = new Point (3,4);
        nokta.x = 5;
        int x = nokta.x;
        x = 9;
        System.out.println("x: "+x);
        System.out.println("nokta.x: "+nokta.x);
        Point p1=new Point(7,8);
        Point p2=new Point(2,3);
        double dist = p1.distance(p2);
        System.out.print("p1.distance is : ");
        System.out.printf("%.4f",dist);
        System.out.print("nokta: ");
        System.out.println(nokta);
        System.out.println("p1: "+p1);
        System.out.println("p1.toString: "+p1.toString());

    }
}
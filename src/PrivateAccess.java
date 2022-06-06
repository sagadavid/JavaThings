public class PrivateAccess {
    private String color;
    private Integer grade;

    public PrivateAccess(String color, Integer grade) {
        this.grade = grade;
        this.color = color;
    }

    protected String getColor() {
        System.out.println("color: " + color);
        return color;
    }

    private Integer getGrade() {
        System.out.println("grade: " + grade);
        return grade;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("new color: " + color);
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
        System.out.println("new grade: " + grade);
    }

    public static void main(String[] args) {
        PrivateAccess pa1 = new PrivateAccess("green", 45);
        pa1.getColor();
        pa1.getGrade();
        pa1.setColor("purple");
        pa1.setGrade(345);
    }
}

class Trivago extends PrivateAccess {
    public Trivago(String color, Integer grade) {
        super(color, grade);
    }

    public static void main(String[] args) {
//          CAN'T CAST
//        Trivago triv = new PrivateAccess("sdf", 345);
        Trivago triv = new Trivago("sdf", 345);
        triv.getColor();
//        DO CAST
        PrivateAccess trim = new Trivago("ldkf", 234);
//        trim.getGrade();//method private, cant access
        trim.setGrade(2341);//method protected, can access

    }
}

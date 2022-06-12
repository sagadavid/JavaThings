
//MODUL-3

public class BrannMann {
    private int brannNo;

    public BrannMann() {
        brannNo = 110;
    }
    public void ringBrannMan() {
        System.out.println("du ringer på " + brannNo);
    }

    public static void main(String[] args)
    {
        Secretary Elisa = new Secretary();
        Elisa.urgentCall();
        Elisa.ringLastCall();
        BrannMann Henrik = new BrannMann();
        Henrik.ringBrannMan();
    }
}

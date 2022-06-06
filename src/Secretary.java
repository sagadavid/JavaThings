//MODUL-3
public class Secretary {
    private BrannMann brannNo;

    public Secretary() {
        brannNo = new BrannMann();
    }

    public void urgentCall() {
        brannNo.ringBrannMan();
    }

    public void ringLastCall() {
        urgentCall();
    }
}

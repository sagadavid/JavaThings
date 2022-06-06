public class Main2FourModules {
    public static void main(String[] args) {


        boolean finished = false;
        while (!finished) {
            System.out.println("hei");
            finished = true;
        }
//modul4
        Biblio vagsbygd = new Biblio();
        vagsbygd.addBook("hello new book");
        vagsbygd.checkNReport();

//modul3
        Secretary Elisa = new Secretary();
        Elisa.urgentCall();
        Elisa.ringLastCall();
        BrannMan Henrik = new BrannMan();
        Henrik.ringBrannMan();
//modul 7???
        Budget myBudget = new Budget();
        myBudget.erJegGod(45, 56);

    }
}

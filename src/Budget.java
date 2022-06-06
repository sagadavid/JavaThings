//modul 7???
public class Budget {
    private int income;
    private int expanses;

    public Budget (){
        int intekt = income;
        int utgift = expanses;
    }

    public void erJegGod(int intekt, int utgift){
        if (intekt>utgift) {
            System.out.println("yes you are good");
        }else{
            System.out.println("you need some more income");
        }
    }
}

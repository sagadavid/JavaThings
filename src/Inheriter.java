import org.jetbrains.annotations.NotNull;

public class Inheriter extends StringPlayer {
//public class Inheriter {

    /**
     * method overriding
     */
    @Override
    public String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i)+",";
        }
        System.out.printf(r,'\n');
        return r;
    }

    public static void main(String[] args) {
        String job = "eksampel";
//        super.reverse(job);
        Inheriter inheriter = new Inheriter();
        StringPlayer stringPlayer = new StringPlayer();

        System.out.println();
        System.out.println("OVERRIDING version : ");
        inheriter.reverse(job);

        System.out.println();
        System.out.println("OVERRIDEN version : ");
        stringPlayer.reverse(job);

        System.out.println();
        System.out.println(" ** DYNAMIC TYPE -overriding at run time- : ");
        StringPlayer inher = new Inheriter();
        inher.reverse(job);

//        System.out.println();
//        System.out.print(inher);
//        System.out.println();
//        System.out.print(inheriter);
//        System.out.println();
//        System.out.print(stringPlayer);
    }


}


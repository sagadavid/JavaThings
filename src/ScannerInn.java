import java.util.Scanner;

class ScannerInn {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Play again? ");
        String answer = in.nextLine();
        if(answer.contains("yes"))
        //(answer == "yes")//cannot comparison string
        {
            System.out.println("Let's go!"); } else {

            System.out.println("Goodbye!"); }
    }
}
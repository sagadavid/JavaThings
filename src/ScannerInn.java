import java.util.Scanner;

class ScannerInn {


    public static void main(String[] args) {

// GET USER INPUT 1
        Scanner skaninn = new Scanner(System.in);
        System.out.print("Play again? ");
        String userAnswer = skaninn.nextLine();
        System.out.println("you answer is "+userAnswer);
        if(userAnswer.contains("yes"))
        //(userAnswer == "yes")//cannot comparison string
        {
            System.out.println("Let's go!");

            // SCANNER 2
            Scanner in = new Scanner(System.in);
            System.out.println("age :");
            int age = in.nextInt();
            //At this point, nextInt returns the value 45. The program then displays the prompt "What is your name? " and runs nextLine, which reads characters until it gets to a newline. But since the next character is already a newline, nextLine returns the empty string "".
            //To solve this problem, you need an extra nextLine after nextInt:
            in.nextLine();
            System.out.println("name :");
            String name = in.nextLine();
            System.out.printf("Hello %s, age %d", name, age);

        } else {

            System.out.println("Goodbye!"); }


    }
}
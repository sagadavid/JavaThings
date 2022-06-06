import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("age :");
        int age = in.nextInt();
        //At this point, nextInt returns the value 45. The program then displays the prompt "What is your name? " and runs nextLine, which reads characters until it gets to a newline. But since the next character is already a newline, nextLine returns the empty string "".
        //To solve this problem, you need an extra nextLine after nextInt:
        in.nextLine();
        System.out.println("name :");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d", name, age);

    }
}
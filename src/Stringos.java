public class Stringos {
    public static void main(String[] args) {

        String name = "Alan Turing";
        String upName= name.toUpperCase();
        System.out.println(name);
        System.out.println(upName);

        System.out.println("*******");
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(upName);


        System.out.println("*******");
        String lowName = name.toLowerCase();
        System.out.println(lowName);

        System.out.println("*******");
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);


    }

}

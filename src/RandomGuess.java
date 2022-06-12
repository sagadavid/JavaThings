import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * in this app
 * i need a guess..
 * i need to save this guess, as an element in a collection
 * i need to communicate with user
 * i need to take in user answers, and save it as respective match to guess
 * i need to check if user answer is correct or wrong (compared to pre-saved collection element)
 * i need to limit guesses and give a result, "2 successful guesses out of 8 attempt"
 * i need to give feedback, "you guessed for 2, guessing came as 3" etc.
 * quit game
 *
 * @author David Saga
 * @version V1 modul6 is110
 */
public class RandomGuess {
    private HashMap<Integer, String> logMap;
    private Random oracle;
    private Integer consoleGuess;
    private String userGuess;
    private Scanner scanner;

    public RandomGuess() {//constructors
        scanner = new Scanner(System.in);
        logMap = new HashMap<>();
        oracle = new Random();
        consoleGuess = oracleGuessing();
        userGuess = userInteraction();
    }

    public static void main(String[] args) {
        RandomGuess guess = new RandomGuess();
        guess.turnTheWheel();
//        guess.logMap();
//        guess.userInteraction();
//        guess.consoleResponse();
    }

    /**
     * @return a random Integer
     */
    private Integer oracleGuessing() {
        Integer oracleGuess = oracle.nextInt(10);
        return oracleGuess;
    }

    /**
     * @return user guess as a string
     * @method using scanner package
     */
    public String userInteraction() {
        String inputLine = scanner.nextLine().trim().toLowerCase();
        userGuess = inputLine;
        return userGuess;
    }

    public HashMap<Integer, String> logMap() {
        logMap.put(consoleGuess, userGuess);
        return logMap;
    }

    /**
     * @method starting execution
     */
    public void turnTheWheel() {
        presentGame();
        boolean finished = false;
        while (!finished) {
            if (userGuess.contains("exit")) {
                finished = true;
//                scanner.close();
                System.out.println("got it .. bye bye");
            }
            oracleGuessing();
            userInteraction();
            consoleResponse();
        }
    }

    /**
     * gives results picked from HashMap
     */
    public void consoleResponse() {
        System.out.println(logMap());
        System.out.println("my nuymber was " + consoleGuess + "\n" + "your guess is " + userGuess);

    }

    private void presentGame() {
        System.out.println("this is a game called\n GUESS THE NUMBER IN MY HEAD");
        System.out.println("now.. \n i keep a number\n in my head");
        System.out.println("it is btw 1 and 10");
        System.out.println("type your guess..");
        System.out.println("or say exit");
        System.out.print("-->" +
                         " ");
    }
}


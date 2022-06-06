import java.sql.Date;
import java.util.Random;
import java.util.Timer;

public class RandomPhraser {
    static String[] subjects = {"i", "you", "he", "she", "we", "they"};
    static String[] verbs = {"like", "dislike", "go", "drink", "read", "run", "quit"};
    static String[] objects = {"tree", "school", "book", "table", "garden", "house", "room"};
    static Random random = new Random();

    public static void gibberSome() {
        int gib1len = subjects.length;
        int gib2len = verbs.length;
        int gib3len = objects.length;

//math.random is a double between 0 and 1. so always it is 0 if you convert to int.
//        int subRand = (int) Math.random()*gib1len;
//        int verbRand = (int) Math.random()*gib2len;
//        int objRand = (int) Math.random()*gib3len;
//
        int subRand = random.nextInt(subjects.length);
        int verbRand = random.nextInt(verbs.length);
        int objRand = random.nextInt(objects.length);

        System.out.println(subjects[subRand] + " " + verbs[verbRand] + " " + objects[objRand]);
    }

    public static void main(String[] args) {
        gibberSome();
        var mathRandom = Math.random();
        System.out.println(mathRandom);
    }
}

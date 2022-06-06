import java.util.Random;

public class Randomizer {
    Random randomizer;

    /**
     * do you really need a self created randomizer???
     */
    public Randomizer() {
        this.randomizer = new Random();
    }

    public int guessTo10() {
        int rNum = randomizer.nextInt(10);
        System.out.println("random no "+rNum);
        return rNum;
    }


    public static void main(String[] args) {
        Randomizer doRandom = new Randomizer();
        doRandom.guessTo10();
//        STANDARD LIBRARY, RANDOM
        Random random =new Random();
        System.out.println(random.nextInt(2));
    }
}


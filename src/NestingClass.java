import java.lang.reflect.Type;

/**
 * examples of nested-nesting class accessing
 */
public class NestingClass {
    int type;
    int volume;
    int deck;

    NestingClass() {
        this.volume = volume;
        this.deck = deck;
        this.type = type;

    }

    public String ytreOuter(String say) {
//        System.out.println("what do you mean "+say);
        String ytring = String.format("what do you mean %s", say);
        return ytring;
    }

    protected class CPU {
        double price;

        // nested class
        class Processor {

            // members of nested class
            double cores;
            String manufacturer;

            double getCache() {
                return 4.3;
            }

        }

        // nested protected class
        protected class RAM {
            // members of protected nested class
            double memory;
            String manufacturer;

            double getClockSpeed() {
                return 5.5;
            }

            protected class FAM {
                // access nesting-outer class fields.
                double famPrice = CPU.this.price;
                int famDeck = NestingClass.this.deck;
                int famType = NestingClass.this.type;

//                FAM(int famType, int famDeck, double famPrice){
//                    famType = this.famType;
//                    famDeck=this.famDeck;
//                    famPrice= this.famPrice;
//                }

                // access nesting-outer method via this
                double famClockSpeed() {
                    return RAM.this.getClockSpeed();
                }

                String ytring(String sagt) {
                    String uttale = NestingClass.this.ytreOuter(sagt);
                    return uttale;
                }

                protected double evalFrequency() {
                    double frequency;
                    // access outer-nesting class members via this.
                    if (RAM.this.memory > 5) {
                        frequency = RAM.this.memory * RAM.this.memory;
                    } else {
                        frequency = 2.2;
                    }
                    return frequency;
                }
            }
        }
    }

    // STATIC CLASS - CAN ONLY BE A NESTED CLASS
    static class SLOTTS {
        int s1 = 34;
        int s2 = 76;

        //        NestingClass.this.deck // cannot access from static class
        int getSlotts() {
            int slotts = s1 + s2;
            return slotts;
        }
    }
}

class Mein {
    public static void main(String[] args) {
//        static nested class object creation and method usage
//        To access the static nested class, we don’t need objects of the outer class.
        NestingClass.SLOTTS slottene = new NestingClass.SLOTTS();
        System.out.println("slottene: " + slottene.getSlotts());
//        nested class object creation needs nesting class object
        NestingClass outer = new NestingClass();
        NestingClass.CPU cpu = outer.new CPU();
        NestingClass.CPU.Processor processor = cpu.new Processor();
        NestingClass.CPU.RAM ram = cpu.new RAM();
//        NestingClass.CPU.RAM.FAM fam = ram.new FAM(45,23,56.34);
        NestingClass.CPU.RAM.FAM fam = ram.new FAM();


        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
        System.out.println("fam is: " + fam.toString());

        var famEval = fam.evalFrequency();
        var ramClock = ram.getClockSpeed();
        var proCache = processor.getCache();
        System.out.println("famEval= " + famEval);
        System.out.println("ramClock= " + ramClock);
        System.out.println("proCache= " + proCache);
        var famCSpeed = fam.famClockSpeed();
        System.out.println("famCSpeed: " + famCSpeed);

//        var keyword cannot infer type when method returns void
//        var ytring = fam.ytring("stav ut");
//        fam.ytring("stav ut!!!");//sout print commented

//       output declared as a String in the method
        System.out.println(fam.ytring("stav ut!!"));

        var yytre = fam.ytring("let me down slowly");
        System.out.println(yytre);

        System.out.println("outerVol= " + outer.volume);

        //        NO INHERITENCE RELATIONSHIP, JUST ACCESS ENABLED????
        outer.type = 34;
        outer.deck = 98;
        cpu.price = 34.98;
        fam.famPrice = 4.6;
        fam.famDeck = 98;
        fam.famType = 4;

        System.out.println("fam.famDeck: " + fam.famDeck + " -- outer.deck" + outer.deck);
        System.out.println("fam.famType: " + fam.famType + "-- outer.type" + outer.type);
        System.out.println("fam.famPrice: " + fam.famPrice + "-- outer.price" + cpu.price);

        /**
         * Anonymous classes usually extend subclasses or implement interfaces.
         * In anonymous classes, objects are created whenever they are required.
         * That is, objects are created to perform some specific tasks.
         */
        NestingClass.SLOTTS anonymousClass = new NestingClass.SLOTTS() {
        };
        anonymousClass.getSlotts();
        NestingClass anonim2 = new NestingClass();
        anonim2.ytreOuter("adsfs");

    }
}

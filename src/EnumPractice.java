import java.util.Arrays;

enum Opprinnelse {
    //        enum constants will call enum constructor
    LOCAL("you are a local"){
        //        overriding local tostring.. look --- imp 8
        public String toString(){
            return "Local enum is overriden toString";
        }
    },
    STRANGER("you are non-eu"),
    ALIEN("you are non-earthal"),
    UFO("where are you from");
    //    a field variable for constructor
//    we'll construct it with a string variable
    private final String homeland;

    //    enum constructor
//    a constructor for a mehtod, actually
//    enum is allready constructed when called ! without this constructor
    private Opprinnelse(String homeland) {
        this.homeland = homeland;
    }

    // usage of constructor in a method
    public String getHomeland() {
        System.out.println(homeland + " hey " + Opprinnelse.this);// attention this !!
//        method called in line 64: Opprinnelse.UFO.getHomeland();
//        thats how the method locates this as UFO
        return homeland;
    }

    //         enum can take methods
//    there are some predefined methods as well
    public void enumMayHaveAMethod() {
        System.out.println("this enum has a method as well");
    }

}

class EnumPractice {
    //    enum inside
    enum Colors {
        blue, red, green;
    }

    Colors farge;
    Opprinnelse stamning;

    EnumPractice(Opprinnelse origin) {
        this.stamning = origin;
    }

    EnumPractice(Colors color) {
        this.farge = color;
    }

    public static void main(String[] args) {
//        IMPLEMENTATION 1
        System.out.println(Opprinnelse.ALIEN);

//        IMPLEMENTATION 2
        EnumPractice eT = new EnumPractice(Opprinnelse.ALIEN);
        System.out.println(eT.stamning);
//        imp 3 -- enum sitt method
        Opprinnelse.LOCAL.enumMayHaveAMethod();
//        imp 4
        System.out.println(Colors.red);
//        imp 5
        EnumPractice et2 = new EnumPractice(Colors.green);
        System.out.println(et2.farge);
//        imp 6
        Opprinnelse[] enumArray = Opprinnelse.values();
        System.out.println(Arrays.toString(enumArray));
//        imp 7
        Opprinnelse.UFO.getHomeland();
//        imp 8
        System.out.println(Opprinnelse.LOCAL+"***");
        System.out.println(Opprinnelse.LOCAL.toString());


    }
}

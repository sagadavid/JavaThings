import java.util.Arrays;

// ENUM; A GOOD ALTERNATICE TO USE;
// MULTIPLE CONSTANTS AS PRESENTING OPTIONS

enum ORIGIN {
    STRANGER("you are non-eu"),
    ALIEN("you are non-earthal"),
    UFO("where are you from"),
    LOCAL("you are a local");

    //CONSTRUCTOR
    private ORIGIN(String enumDescription) {
        this.enumDescription = enumDescription;
    }

    private String enumDescription;

    public void setEnumDescription(String enumDescription) {
        this.enumDescription = enumDescription;
    }
    public String getEnumDescription() {
        System.out.println(enumDescription + " hey " + ORIGIN.this);
        return enumDescription;
    }

    @Override
    public String toString() {
        return  enumDescription;
    }

    public void enumMethod() {
        System.out.println("this enum has a method as well");
    }
}

class AddressHomeland {
    //enum2 inside
    enum RENKLER {
        blue,
        red,
        green;
    }
    RENKLER colors;
    ORIGIN roots;

    public AddressHomeland() {
    }

    AddressHomeland(ORIGIN enumOrigin) {
        this.roots = enumOrigin;
    }

    AddressHomeland(RENKLER enumRenkler) {
        this.colors = enumRenkler;
    }

    public static void main(String[] args) {
        var instans1 = new AddressHomeland(ORIGIN.valueOf("STRANGER"));
        System.out.println(instans1.roots);//ORIGIN{enumDescription='you are non-eu'}
        instans1.roots.enumMethod();//this enum has a method as well
        instans1.roots.getEnumDescription();//you are non-eu hey ORIGIN{enumDescription='you are non-eu'}
//        instans1.colors.name();//Cannot invoke "AddressHomeland$RENKLER.name()" because "instans1.colors" is null

        AddressHomeland instans2 = new AddressHomeland(ORIGIN.ALIEN);
        System.out.println(instans2.roots);//ORIGIN{enumDescription='you are non-earthal'}
        System.out.println(instans2.toString());//AddressHomeland@5305068a

        AddressHomeland instans3 = new AddressHomeland(RENKLER.green);
        System.out.println(instans3.colors);//green

        ORIGIN[] enumOriginArray = ORIGIN.values();
        System.out.println(Arrays.toString(enumOriginArray));
        //[ORIGIN{enumDescription='you are non-eu'},
        // ORIGIN{enumDescription='you are non-earthal'},
        // ORIGIN{enumDescription='where are you from'},
        // ORIGIN{enumDescription='you are a local'}]
        ORIGIN.UFO.getEnumDescription();//where are you from hey ORIGIN{enumDescription='where are you
        // from'}
        ORIGIN.LOCAL.enumMethod();//this enum has a method as well

        System.out.println(RENKLER.red);//red
    }

}

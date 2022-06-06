public class Likhet {
    String farge;
    int antall;

    Likhet(String farge, int antall) {
        this.antall = antall;
        this.farge = farge;
    }

    @Override
    public boolean equals(Object obj) {
        //equal operator check
        if (obj == this) {
            System.out.println("obj is compared to itself -> ");
            return true;
        }
        //type check
        if (!(obj instanceof Likhet)) {
            System.out.println("type checked -> ");
            return false;
        }
        //content check
        Likhet that = (Likhet) obj;
        System.out.println("content checked -> ");
        return farge.equals(that.farge) &&
                antall == that.antall;

    }
    @Override
    public int hashCode(){
        int result = 39;
        result= result*farge.hashCode();
        return result;
    }

    public static void main(String[] args) {
//== operator er brukt for primitive type data
// == operator checks wether reference is same or not. REFERENCE EQUALITY
// equals () er brukt for nonprimitive type data
// equals () should check value-content: CONTENT EQUALITY

        //new objects created by new keyword
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1 == s2);       // false
        System.out.println(s1.equals(s2)); //true

        //string literals are stored in string pool and
        // share same reference because of memory management
        String s3 = "heiSann";
        String s4 = "heiSann";

        System.out.println(s3 == s4);//true
        System.out.println(s3.equals(s4));//true

        Likhet likhet1 = new Likhet("blå", 45);
        Likhet likhet2 = new Likhet("blå", 45);

        System.out.println("*****************");

        System.out.println(likhet1 == likhet2);//false
        System.out.println(likhet1.equals(likhet2)); //true
        System.out.println(likhet1.equals(likhet1));
        System.out.println(likhet1.hashCode());
        System.out.println(likhet2.hashCode());

    }
}

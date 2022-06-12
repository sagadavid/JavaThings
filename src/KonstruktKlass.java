public class KonstruktKlass
{

//    constructor via menu/code/generate/constructor!!
//    constructor is a mehtod too, but always creates instances of class,
//    they dont return any other .. mostly they are declared public

    int anInt;
    boolean aBoolean;

    public KonstruktKlass(int someInt, boolean someBool)
    {
        //if done this way; argument cant become actual parameter
//       anInt=this.anInt;
//       aBoolean=this.aBoolean;

        //now; argument becomes actual parameter
        this.anInt = someInt;
        this.aBoolean = someBool;
    }

    public KonstruktKlass()
    {
        this.anInt = 999;
    }

    public KonstruktKlass(int a, int b, int c, String z, String x)
    {
//        if construct is not assigned to fields,
//        cannot be called with dot notation
    }

    public static void main(String[] args)
    {
//INFERRED (TYPING) CONSTRUCTOR
        var instance1 = new KonstruktKlass(45, true);
        System.out.println("instance1-constructor: " + instance1.anInt);
        System.out.println("instance1-constructor: " + instance1.aBoolean);
        instance1.setInt(345);
        instance1.getInt();

        System.out.println("*****");

        KonstruktKlass instance2 = new KonstruktKlass(45, true);
        System.out.println(instance2.aBoolean);
        System.out.println(instance2.anInt);
        System.out.println(instance2);

        //if it is not automatically null created type,
        //then you must create with null!!


        KonstruktKlass instance3 = null;
        //Cannot assign field "anInt" because "instance3" is null
//        instance3.anInt = 23;
//        instance3.aBoolean = true;
//        System.out.println(instance3);

        KonstruktKlass instance4 = new KonstruktKlass(11, true);
        System.out.println(instance4.anInt);
        instance4.aBoolean = true;
        System.out.println(instance4);

        var instance5 = new KonstruktKlass(4, 3, 5, "sdkln", "sdøg");
        System.out.println(instance5);

        KonstruktKlass instance6 = new KonstruktKlass();
        System.out.println(instance6.anInt);
        System.out.println(instance6.aBoolean);

        KonstruktKlass instance7 = new KonstruktKlass();
        System.out.println("insatance7.anInt "+instance7.anInt);
    }

    public int getInt()
    {
        System.out.println("getted int: " + anInt);
        return anInt;
    }

    public void setInt(int setInt)
    {
        this.anInt = setInt;
        System.out.println("insetted int: " + anInt);
    }
}

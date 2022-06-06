public class Constructor {
    int anInt;
    boolean aBoolean;
    public Constructor(int someInt, boolean someBool){
        //if done this way; argument cant become actual parameter
//       anInt=this.anInt;
//       aBoolean=this.aBoolean;
        //now; argument becomes actual parameter
        this.aBoolean=someBool;
        this.anInt=someInt;

    }

    public Constructor(){
        this.anInt=999;
    }
    public Constructor(int a, int b, int c, String z, String x){
//        if construct is not assigned to fields,
//        cannot be called with dot notation
    };

    public static void main(String[] args) {
        Constructor constructor1 = new Constructor(45,true);
        System.out.println(constructor1.aBoolean);
        System.out.println(constructor1.anInt);
        System.out.println(constructor1);
        //if it is not automatically null created type,
        //then you must create with null!!
//        Constructor constructor2 = null;
        //HOWEVER, you cant assign to null value fields
//        constructor2.anInt=23;
//        constructor2.aBoolean=true;
//        System.out.println(constructor2);
        Constructor constructor2 = new Constructor(11,true);
        constructor2.aBoolean=true;
        System.out.println(constructor2);
//Constructor constructor3 = new Constructor(4,3,5,"sdkln","sdøg");
//        System.out.println(constructor3.z);
        Constructor constructor4 = new Constructor();
        System.out.println(constructor4.anInt);
        System.out.println(constructor4.aBoolean);
        Constructor constructor5= new Constructor();
        System.out.println(constructor5.anInt);
    }
}

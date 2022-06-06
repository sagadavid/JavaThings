import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionClass {
    //    private static Class a;
    public String salute;
    ReflectionClass(String salute){
        this.salute= salute;
    }

    public static void main(String[] args) {
        ReflectionClass rC = new ReflectionClass("selam");
        /**
         * reflection is using Class class,
         * and getting info-meta data about objects class
         */
        Class a;
        a = rC.getClass();
        System.out.println(a);
        System.out.println(rC.getClass());
        System.out.println("name: "+ a.getName());
        System.out.println("modifier: "+ a.getModifiers());
        System.out.println("simpleName: "+ a.getSimpleName());
        System.out.println(a.getModule());
        System.out.println(a.getConstructors());
        System.out.println("superClass: "+ a.getSuperclass());
        System.out.println(a.getDeclaredMethods());
        System.out.println(a.getDeclaredFields());
        Field[] field1 = a.getDeclaredFields();
        System.out.println(Arrays.toString(field1));
        try
        {
            Field field1field= a.getField("salute");
            field1field.set(rC,"greetings");
//            not set ???
            System.out.println(Arrays.toString(a.getFields()));
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

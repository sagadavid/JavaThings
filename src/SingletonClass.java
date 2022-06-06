/**
 * To create a singleton class, a class must implement the following properties:
 * Create a private constructor of the class to restrict object creation outside of the class.
 * Create a private attribute of the class type that refers to the single object.
 * Create a public static method that allows us to create and access the object we created.
 * Inside the method, we will create a condition that restricts us from creating more than one object.
 */
public class SingletonClass {
    private SingletonClass singObj;
    private SingletonClass(){};
    public static SingletonClass singletonMethod(SingletonClass singObj){
        if (singObj == null){
            SingletonClass sinObj = new SingletonClass();
        }
        return singObj;
    }
    public void sinGoalMethod(){
        System.out.println("goal method accessed");
    };
}
class Mainn {
    public static void main(String[] args) {
//        https://www.programiz.com/java-programming/singleton
        SingletonClass s1;
//       s1 = SingletonClass.singletonMethod();
//       s1.sinGoalMethod();
    }
}

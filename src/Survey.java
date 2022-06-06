abstract class Survey {
    //abstract class properties
    static boolean surveyorPaid;
    static boolean surveyApproved;

    //abstract class constructor will be called in subclass constructor
    Survey() {
        surveyApproved = this.surveyorPaid;
    }

    //regular method
    protected void idQuestions() {
        System.out.println("***** identification Questions are : ");
        System.out.println("what is your name and surname");
        System.out.println("what is your gender");
        System.out.println("what is your nationality");

    }

    //regular method
    protected void professionQuestions() {
        System.out.println("***** profession Questions are : ");
        System.out.println("what is your job");
        System.out.println("what is your job title");
        System.out.println("what kind of education did you have for this job");

    }

    //regular method
    protected void surveyQuestions() {
        System.out.println("**** survey Questiones are (maybe 100s) : ");
        System.out.println("Do you enjoy travelling abroad");
        System.out.println("Do you enjoy cruise trips");
        System.out.println("Do you buy safety products for you trips");

    }

    //abstract method will have body in subclass, all subclasses may implement it differently
    abstract void surveyorsNotes(int surveyeeAttitude);
}


interface Regulations {

    //static method of interface
    static void iso45 () {
        System.out.println("*** interface method iso45 invoked by implementing class");
        System.out.println("iso45 standart is certified");
    }
    //default method of interface
    default void stamping () {
        System.out.println(" #####  approved with official stamp ##### ");
    }

    void distribute();
}


class Surveyor extends Survey implements Regulations {
    //attributes
    String name;
    String agentService;
    Integer bankaccount;

    Surveyor() {
        //abstract class constructor called
        super();
        //attributes called
        name = this.name;
        agentService = this.agentService;
        bankaccount = this.bankaccount;

    }

    void introQuestions() {
        //super method calls
        super.idQuestions();
        super.professionQuestions();
        super.surveyQuestions();
    }

    //override abstract method
    @Override
    void surveyorsNotes(int surveyeeAttitude) {
        System.out.println("**** abstract mehtod surveyeeAttitude is called by subclass ");
        System.out.println(" **** surveyee attitude is : ");
        if (surveyeeAttitude == 1) {
            System.out.println("surveyee is fully devoted");
        } else if (surveyeeAttitude == 0) {
            System.out.println("surveyee abstains from some questions");
        } else {
            System.out.println("invalid or no surveyeeAtttitude observation");
        }
//        System.out.println("introduction questions are listed below:");
    }

    // attributes are called in a method
    void surveyEvaluation() {
        System.out.println("***** survey Evaluation *** ");
        //abstract class attribute is called
        System.out.println("surveyApproved&Paid : " + surveyApproved);
        //class attributes are called
        System.out.println("bankaccount : " + bankaccount + '\n' +
                "agentService : " + agentService
                + '\n' + "surveyor name : " + name);

        //interface static method is called !
        Regulations.iso45();
    }

    //interface method is implemented
    @Override
    public void distribute(){
        System.out.println("***** interface method distribute is now being implemented");
        System.out.println(" UPS cargo distributes packets");
    };

}

class Main {
    public static void main(String[] args) {
        Surveyor surveyor1 = new Surveyor();

//attribute values are assigned
        surveyor1.bankaccount = 1235235235;
        surveyor1.agentService = "Accurate and Easy Ltd.";
        surveyor1.name = "Eric Clapton";

        //static attribute of abstract class is accessed !
//        Survey.surveyApproved = false;
        //attribute is re-accessed via super consttructor of subclass !!
        surveyor1.surveyApproved = true;

        //overriding method invoked
        surveyor1.surveyorsNotes(1);

        //method which contains super method, invoked
        surveyor1.introQuestions();

        //subclass object implements abstract method !!
        surveyor1.professionQuestions();

        //subclass and abstract superclass attributes called in a subclass mehtod
        surveyor1.surveyEvaluation();

    }
}
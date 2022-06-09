public class Stringos {
    public static void main(String[] args) {
/*
//STRING MATCH
String a = "fad";
        String b ="fad";
        var result = a.matches(b);
        System.out.println(".matches: "+result);

// STRINGS SUBSTRING, CONTAINS, MATCHES
        String someString = "ich habe zeit";
        if (someString.matches("ich habe zeit")) {
            System.out.println(".matches regex: a complete sentence");
        }
        if (someString.contains("habe")) {
            System.out.println(".contains \"habe\"");
        }
        var subString2til8 = someString.substring(2, 8);
        System.out.println(".substring 2-8" + subString2til8);
        System.out.println("****");
        String name = "Alan Turing";
        String upName= name.toUpperCase();
        System.out.println(name);
        System.out.println(upName);
        System.out.println(".touppercase *******");
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(upName);
        System.out.println(".tolowercase *******");
        String lowName = name.toLowerCase();
        System.out.println(lowName);
        System.out.println(".replace ****");
        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");
        System.out.println(text);
        System.out.println(".substring *****");

// STRING TO BOOLEAN

            var stringo= "true";
            var stringi = "is it true";

            var parseBool= Boolean.parseBoolean(stringo);
            System.out.println(parseBool);//true

            var parsiBool= Boolean.parseBoolean(stringi);
            System.out.println(parsiBool);//false


// UNICODE USAGE OF CHARACTER
            var dollor = '\u0024';
            System.out.println(dollor);
            var unicodex= '\u0046';
            System.out.println(unicodex);
            var lowerChar= Character.toLowerCase(unicodex);
            System.out.println(lowerChar);

// STRING TO CHAR
            var hei = "hello";
            var charStr = new String(hei);
            System.out.println(charStr);
            var toCharArray= hei.toCharArray();
            System.out.println(toCharArray);
            System.out.print("charArray=");
            System.out.print("{");
            for (char elment : toCharArray){
                    System.out.print(elment+"-");
            }
            System.out.print("}");
            System.out.println();
            System.out.println(toCharArray.toString());

// EQUALS CHECK
            var saluting = "hello";
            var greeting = "hello";
            System.out.println(saluting.equals(greeting));//true

//TERNARY CHECK
            var i=2;
            var oneCheck = (i == 1)
                    ?"1 exists"
                    :"not 1, but exist "+i;
            System.out.println(oneCheck);
            var comparison = (3>5)
                    ? "3 is bigger"
                    : "5 is bigger";
            System.out.println(comparison);
            var rightAnswer = "c";
            var myAnswer = "d";
            var pass = (rightAnswer == myAnswer)
                    ? "you pass"
                    :"you fail";
            System.out.println(pass);
 */
//  STRING BUILDER
            var anyString = new StringBuilder("starting building a string");
            anyString.append(" just now")
                    .append(34)
                    .append(true);
            System.out.println(anyString);
            System.out.println(anyString.toString());
            var builtString = anyString;
            System.out.println(builtString);
    }
}

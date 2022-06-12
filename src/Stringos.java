public class Stringos {
    public static void main(String[] args) {

String s1 = "Hello!";
        var s2 = "Hello!";
//INTERNING.. JAVA PLACES SAME LOCATION, so they match
        if (s1 == s2) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }
//NEW CREATION, NEW LOCATION.. so == says theydont match
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");
        if (s3 == s4) {
            System.out.println("they match!");
        } else {
            System.out.println("they don't match!");
        }

//  PROPER EQUALS CHECK FOR STRING
        if (s3.equals(s4)) {
            System.out.println("they do match!");
        } else {
            System.out.println("they don't match!");
        }

// EQUALS IGNORE
        var s5 = "HELLO!";
        if (s3.equalsIgnoreCase(s5)) {
            System.out.println("they match, ignored!");
        } else {
            System.out.println("they don't match!");
        }

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

//  STRING BUILDER
            var anyString = new StringBuilder("starting building a string");
            anyString.append(" just now")
                    .append(34)
                    .append(true);
            System.out.println(anyString);
            System.out.println(anyString.toString());
            var builtString = anyString;
            System.out.println(builtString);


int sphere = 02;
        var country = "sweden";
        var alliance = "eu";
        var currency = "euro";
        var season = "sumer";
        var military = "Nato";
        var match = "match";

//STRING INTERPOLATION
        var template = "ulke %s, ittifak %s, døviz %s, " +
                "mevsim %s, askeri %s, kure %s, match %s, cevabim %s";

//STRING FORMAT AS A DESIGNED OUTPUT
        var templateFormat = String.format(template, country,
                alliance, currency, season, military,
                sphere, match.matches(match),
                myAnswer);
        //ulke sweden, ittifak eu, døviz euro,
        // mevsim sumer, askeri Nato, kure 2, match true, cevabim d

//        sourcecode daki herhangi bir variable a
//        refereans verilebiliyor, bool ise %s kullanilmiyor

        System.out.println(templateFormat);

// FIND POSITION IN A STRING
        var welcoming = "welcome to california of usa";
        System.out.println(welcoming.indexOf("of"));

//        TRIM
        var city = "stavanger      ";
        System.out.println(city+" "+city.length());
        System.out.println(city.trim()+" "+city.trim().length());
    }
}

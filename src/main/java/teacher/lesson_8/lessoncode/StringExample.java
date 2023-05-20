package teacher.lesson_8.lessoncode;

public class StringExample {

    public static void main(String[] args) {

        char[] charArray = {'J','a','v','a','G','u','r','u'};
        String ourString = new String(charArray);
        System.out.println(ourString);

        String string1 = "Ferrari";
        int stringLength = string1.length();
        System.out.println("string1 length is " + stringLength);

        System.out.println("String ".concat("Another String"));

        float myFloat = 3.14f;
        int myInt = 10;
        String myText = "text";

        System.out.printf("MyFloat value = %f, myInt value = %d and myString value = %s", myFloat, myInt, myText);

        String string1UpperCase = string1.toUpperCase();
        String string1LowerCase = string1.toLowerCase();
        System.out.println();
        System.out.println(string1UpperCase);
        System.out.println(string1LowerCase);

        char myChar = string1.charAt(4);
        System.out.println(myChar);

        String newFerrari = string1.replace("r", "g");
        System.out.println(newFerrari);

        String stringWithSpaces = " Username ";
        String stringWithoutSpaces = stringWithSpaces.trim();
        System.out.println(stringWithSpaces);
        System.out.println(stringWithoutSpaces);

        String stringToSplit = "1234-5678-91011-12345";
        String[] splitArray = stringToSplit.split("-");

        System.out.println(splitArray[0]);
        System.out.println(splitArray[1]);
        System.out.println(splitArray[2]);
        System.out.println(splitArray[3]);
    }

}

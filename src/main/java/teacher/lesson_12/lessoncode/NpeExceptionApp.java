package teacher.lesson_12.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class NpeExceptionApp {

//    NPE = NullPointerException

    public static void main(String[] args) {

        NpeExceptionApp app = new NpeExceptionApp();

        List<String> stringList = new ArrayList<>();
        stringList.add("Liepaja");
        stringList.add(null);
        stringList.add("Riga");
        stringList.add("Daugavpils");
        stringList.add("Ludza");

        for (String element : stringList) {
//            app.printText(element);
            try {
                app.printText(element);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Exception was caught and processed! Program continues...");
                e.printStackTrace();
            } finally {
                System.out.println("Inside finally block");
            }
            System.out.println("-----------");
        }

    }

    public void printText(String text) {
        if (text == null) {
            throw new NullPointerException("NPE thrown! Text is null!");
        }
        System.out.println("Inside of printText method! Text is: " + text);
    }
}

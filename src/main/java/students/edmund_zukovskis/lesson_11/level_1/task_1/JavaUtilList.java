package students.edmund_zukovskis.lesson_11.level_1.task_1;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class JavaUtilList {
    public static void main(String[] args) {

        List<String> humanRace = new ArrayList<>();

        humanRace.add("Orcs");
        humanRace.add("Human");
        humanRace.add("Elf");
        humanRace.add("Barbarians");

        System.out.println("All human races are: " + humanRace);
        /*
         ArrayList - Stores the elements in a list in a dynamic array.
         Elements are accessed by index. You can quickly access any element,
         but adding and removing elements can be slow.
         */

        List<Integer> randomNumbers = new LinkedList<>();
        randomNumbers.add(8);
        randomNumbers.add(7);
        randomNumbers.add(9);
        randomNumbers.add(10);
        randomNumbers.add(15);
        randomNumbers.add(17);
        System.out.println("All random numbers are: " + randomNumbers);

        /*
        LinkedList - Stores elements in a linked list. Elements are accessed by
        moving through the list from the beginning or end. Adding and removing
        elements is faster than in ArrayList, but element access is slower.
         */
    }

}

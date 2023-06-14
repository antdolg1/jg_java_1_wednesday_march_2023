package teacher.lesson_11.lessoncode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        //set does not allow duplicates
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Riga");
        hashSet.add("Jelgava");
        hashSet.add("Ventspils");
        hashSet.add("Liepaja");
        hashSet.add("Liepaja");
        hashSet.add("Liepaja");
        hashSet.add("Daugavpils");
        System.out.println("HashSet content: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Riga");
        linkedHashSet.add("Jelgava");
        linkedHashSet.add("Ventspils");
        linkedHashSet.add("Liepaja");
        linkedHashSet.add("Liepaja");
        linkedHashSet.add("Liepaja");
        linkedHashSet.add("Daugavpils");
        System.out.println("LinkedHashSet content: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Riga");
        treeSet.add("Jelgava");
        treeSet.add("Ventspils");
        treeSet.add("Liepaja");
        treeSet.add("Liepaja");
        treeSet.add("Liepaja");
        treeSet.add("Daugavpils");
        System.out.println("TreeSet content: " + treeSet);
    }
}

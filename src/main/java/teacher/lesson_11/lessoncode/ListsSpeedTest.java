package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsSpeedTest {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }

    public static void doTimings(String listType, List<Integer> list) {

        for (int i = 0; i < 100_000_000; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            list.add(50000, i);
        }

//        list.add(50_000, 12);
//        list.remove(99999000);
//        list.set(50_000_000, 121212);

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken " + (endTime - startTime) + " ms for list type " + listType);

    }
}

package students.edmund_zukovskis.lesson_5.level_5_6;

import java.util.Scanner;
public class ArrayUtil {
        public int[] createArray ( int createArrayLength){
            int[] createArray = new int[createArrayLength];
            return createArray;
        }

        public void printArrayToConsole ( int[] array){
            int[] createArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                System.out.println(createArray[i]);
            }
        }

        public void fillArrayWithNumbers ( int[] array){
            Scanner scanner = new Scanner(System.in);
            int[] arrayNew = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = scanner.nextInt();
            }
        }


        public int findMaxNumber ( int[] createArray){
            int maxNumber = createArray[0];
            for (int i = 0; i < createArray.length; i++) {
                if (maxNumber < createArray[i]) {
                    maxNumber = createArray[i];
                }
            }
            return maxNumber;
        }

        public int findMinNumber ( int[] createArray){
            int minNumber = createArray[0];
            for (int i = 0; i < createArray.length; i++) {
                if (minNumber > createArray[i]) {
                    minNumber = createArray[i];
                }
            }
            return minNumber;

        }
    }
}



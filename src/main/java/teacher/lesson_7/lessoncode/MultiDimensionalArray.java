package teacher.lesson_7.lessoncode;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //standard one dimensional array
        int[] standardArray = {1, 2, 3, 4, 5};
        int[] arrayOne = new int[5];

        //two dimensional array sample
        int[][] twoDimensionalArray = new int[2][2];
        int[][] table = {
                {1, 2, 3},
                {4, 5, 6, 12, 12, 0, 2},
                {7, 8, 9, 6, 7},
                {0, 1},
                {1}
        };

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }

//        System.out.println(table[0][0]);
//        System.out.println(table[0][2]);
//        System.out.println(table[2][1]);
//
//        String[][] stringArray = new String[3][3];
//        stringArray[0][0] = "Sample text";
//
//        System.out.println(stringArray[0][0]);
//        System.out.println(stringArray[0][1]);
    }
}

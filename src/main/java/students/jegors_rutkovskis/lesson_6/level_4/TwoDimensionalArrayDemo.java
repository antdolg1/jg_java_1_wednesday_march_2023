package students.jegors_rutkovskis.lesson_6.level_4;

class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        TwoDimensionalArray demo = new TwoDimensionalArray();
        int[][] matrix = demo.createTwoDimArray(3, 3);
        demo.fillTwoDimArrayWithRandomNumbers(matrix);
        demo.printMatrix(matrix);
        System.out.println("Sum of numbers in array = " + demo.countSum(matrix));
    }
}

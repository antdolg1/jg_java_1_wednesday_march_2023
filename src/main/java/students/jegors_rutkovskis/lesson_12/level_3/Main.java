package students.jegors_rutkovskis.lesson_12.level_3;

class Main {
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
//            System.exit(0); блок finally не выполнится
        } finally {
            System.out.println("Inside finally block ");
        }
    }
//    /** Мы получим:
//     * 1. Got the Test Exception
//     *    Inside finally block
//
//     *   Мы отловили ошибку,
//     *   а блок finally всегда выполняется, кроме случая, если
//     *   перед ним написать System.exit(0);
//     */
}

package students.jegors_rutkovskis.lesson_12.level_3;

class MultiCatchExample {
    public static void main(String[] args) {
        try {
            String str = null;
            int b = str.length();
        } catch (ArithmeticException a) { // более конкретный тип исключения. Если произошло другое исключение,
                                            // то мы переходим к другому блоку catch
            System.out.println(a.getMessage());
        } catch (Exception e) {         // Exception является предком.
                                        // Таким образом мы можем отловить всех его наследников
            System.out.println(e.getMessage());
        }

        try {
            getException();
        } catch (ArithmeticException a) { // Если блоки catch поменять местами, будет ошибка компиляции,
                                        // т.к. тип исключения Exception уже отловит все исключения,
                                        // то в блоке catch (ArithmeticException a) не будет смысла.
            System.out.println(a.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    static void getException() {
        throw new RuntimeException("Thrown exception");
    }
}

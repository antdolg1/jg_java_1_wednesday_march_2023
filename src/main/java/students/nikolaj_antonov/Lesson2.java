package students.nikolaj_antonov;

public class Lesson2 {

    public static void main(String[] args) {

        int A = 10;
        int B = 20;
        int C = 30;

        float D = 1.1f;
        float F = 2.0f;

        double G = 4.0;

        int sum = A + B + C;
        int sub = C - B;
        int div = C / A;
        int mul = A * B * C;

        float Div = D / F;

        double DIV = G / B;

        double SUm = ((B + G) / A) * C;


        System.out.println("Result of sum A and B and C is " + sum);
        System.out.println("Result of sub C and B is " + sub);
        System.out.println("Result of div C and A is " + div);
        System.out.println("Result of mul A and B and C is " + mul);

        System.out.println("Result of Div D and F is " + Div);

        System.out.println("RESULT G and B is " + DIV);
        System.out.println("RESULT of B-G-A is " + SUm);




    }
}

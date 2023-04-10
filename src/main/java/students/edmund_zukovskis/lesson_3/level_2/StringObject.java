package students.edmund_zukovskis.lesson_3.level_2;

class StringObject {
    public static void main(String[] args) {
        String s1 = "Edmunds";
        String s2 = "Edmunds";
        String s3 = new String("Edmunds");

        boolean nameMatch = s1 == s2;
        System.out.println(nameMatch);

        boolean nameDoNotMatch = s1 == s3;
        System.out.println(nameDoNotMatch);

        boolean nameMatch2 = s1.equals(s3);
        System.out.println(nameMatch2);






    }
}

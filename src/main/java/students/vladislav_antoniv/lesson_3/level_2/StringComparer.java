package students.vladislav_antoniv.lesson_3.level_2;

public class StringComparer {
    public static void main(String[] args) {
        String s1 = "Hello Java";
        String s2 = new String ("Hello J");
        String str1 = s1.concat(s2);
        String str2 = s1+s2;
        String str3 = "Java"+11;
        boolean b = str1.equals(str2);
        System.out.println(b);
    }
}

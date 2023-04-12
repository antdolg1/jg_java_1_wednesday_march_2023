package teacher.lesson_4.lessoncode;

public class AgeClassifier {

    public String classify(int age) {
        if (age > 0 && age <= 10) {
            return "Baby";
        } else if (age > 10 && age <= 17) {
            return "Teenager";
        } else if (age > 17 && age <= 30) {
            return "Student";
        } else if (age > 30 && age <= 60) {
            return "Adult";
        } else if (age > 60 && age <= 100) {
            return "Senior";
        } else {
            return "Undead";
        }
    }
}

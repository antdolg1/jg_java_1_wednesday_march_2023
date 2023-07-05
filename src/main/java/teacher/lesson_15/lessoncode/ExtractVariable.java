package teacher.lesson_15.lessoncode;

public class ExtractVariable {

    String rateA = "ASDAS";
    String coeficient = "SDSD";
    int amount = 100;

    boolean calculateRate() {
        boolean isMinimalSalary = amount > 200;
        boolean isPensionIndexApplied = rateA.toUpperCase().indexOf("ASD") > -1;
        boolean isSocialIndexApplies = coeficient.toLowerCase().indexOf("SD") < 1;
        if (isPensionIndexApplied && isSocialIndexApplies && isMinimalSalary && multiplySelection()) {
            return false;
        }
        return true;
    }



    boolean multiplySelection() {
        //doing something
        return false;
    }

}

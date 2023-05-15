package students.vladislav_antoniv.lesson_6.level_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test=new DayOfTheWeekDetectorTest();
        test.ShouldReturnMonday();
        test.ShouldReturnTuesday();
        test.ShouldReturnWednesday();
        test.ShouldReturnThursday();
        test.ShouldReturnFriday();
        test.ShouldReturnSaturday();
        test.ShouldReturnSunday();
        test.ShouldReturnNotCorrect();
    }
    void ShouldReturnMonday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=1;
        String expectedResult="Monday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnMonday PASSED!");
        } else{
            System.out.println("Test ShouldReturnMonday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnTuesday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=2;
        String expectedResult="Tuesday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnTuesday PASSED!");
        } else{
            System.out.println("Test ShouldReturnTuesday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnWednesday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=3;
        String expectedResult="Wednesday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnWednesday PASSED!");
        } else{
            System.out.println("Test ShouldReturnWednesday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnThursday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=4;
        String expectedResult="Thursday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnThursday PASSED!");
        } else{
            System.out.println("Test ShouldReturnThursday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnFriday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=5;
        String expectedResult="Friday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnFriday PASSED!");
        } else{
            System.out.println("Test ShouldReturnFriday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnSaturday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=6;
        String expectedResult="Saturday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnSaturday PASSED!");
        } else{
            System.out.println("Test ShouldReturnSaturday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnSunday(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=7;
        String expectedResult="Sunday";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnSunday PASSED!");
        } else{
            System.out.println("Test ShouldReturnSunday FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
    void ShouldReturnNotCorrect(){
        DayOfTheWeekDetector test1=new DayOfTheWeekDetector();
        int dayNumber=8;
        String expectedResult="not correct day number";
        String actualResult=test1.findDayOfTheWeek(dayNumber);
        if (actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnNonCorrect PASSED!");
        } else{
            System.out.println("Test ShouldReturnNonCorrect FAILED!");
            System.out.println("Expected output: "+expectedResult+" Actual output: "+actualResult);
        }
    }
}

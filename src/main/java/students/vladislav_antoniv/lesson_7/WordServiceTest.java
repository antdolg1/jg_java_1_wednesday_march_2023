package students.vladislav_antoniv.lesson_7;

import static students.vladislav_antoniv.lesson_7.WordService.findMostFrequentWord;

public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test=new WordServiceTest();
        test.ShouldReturnText3();
    }
    void ShouldReturnText3(){
        WordService test1=new WordService();
        String text="text text text not no no yes yes yes";
        String expectedResult="text;3";
        String actualResult=findMostFrequentWord(text);
        if(actualResult.equals(expectedResult)){
            System.out.println("Test ShouldReturnText3 PASSED");
        }
        else {
            System.out.println("Test ShouldReturnText3 FAILED");
        }
    }
}
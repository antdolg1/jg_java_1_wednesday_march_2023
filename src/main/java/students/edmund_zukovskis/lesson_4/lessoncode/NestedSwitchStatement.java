package students.edmund_zukovskis.lesson_4.lessoncode;

import java.util.Scanner;

public class NestedSwitchStatement {
    public static void main(String[] args) {

        System.out.println("Please choose your meal. Available meal: Chicken, Beef or Vegetarian");

        Scanner scanner = new Scanner(System.in);
        String userChosenMeal = scanner.nextLine();
        userChosenMeal = userChosenMeal.toUpperCase();

        switch (userChosenMeal) {
            case "CHICKEN":
                System.out.println("Please choose your combo. 1 - Nuggets combo, 2 - Chicken burger combo, 3 - Whole chicken combo");
                int userChosenComboChicken = scanner.nextInt();
                switch (userChosenComboChicken) {
                    case 1:
                        System.out.println("You Chose Nuggets combo!");
                        break;
                    case 2:
                        System.out.println("You Chose Chicken burger combo!");
                        break;
                    case 3:
                        System.out.println("You Chose Whole chicken combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please order from the front desk!");
                }
                break;
            case "BEEF":
                System.out.println("Please choose your combo. 1 - Beef combo, 2 - Beef burger combo, 3 - Whole Beef combo");
                int userChosenComboBeef = scanner.nextInt();
                switch (userChosenComboBeef) {
                    case 1:
                        System.out.println("You Chose Beef combo!");
                        break;
                    case 2:
                        System.out.println("You Chose Beef burger combo!");
                        break;
                    case 3:
                        System.out.println("You Chose Whole Beef combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please order from the front desk!");
                }
                break;
            case "VEGITERIAN":
                System.out.println("Please choose your combo. 1 - Beef combo, 2 - Beef burger combo, 3 - Whole Beef combo");
                int userChosenComboVegetarian = scanner.nextInt();
                switch (userChosenComboVegetarian) {
                    case 1:
                        System.out.println("You Chose Vegetarian combo!");
                        break;
                    case 2:
                        System.out.println("You Chose Vegetarian burger combo!");
                        break;
                    case 3:
                        System.out.println("You Chose Whole Vegetarian combo!");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please ask information desk!");
                        break;
                }

        }
    }
}

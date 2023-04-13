package teacher.lesson_4.lessoncode;

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
                        System.out.println("You chose Nuggets combo!");
                        break;
                    case 2:
                        System.out.println("You chose Chicken burger combo");
                        break;
                    case 3:
                        System.out.println("You chose Whole chicken combo");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please order at the cashier");
                        break;
                }
                break;
            case "BEEF":
                System.out.println("Please choose your combo. 1 - Beef burger combo, 2 - Beef salad combo, 3 - Whole beef combo");
                int userChosenComboBeef = scanner.nextInt();
                switch (userChosenComboBeef) {
                    case 1:
                        System.out.println("You chose Beef burger combo!");
                        break;
                    case 2:
                        System.out.println("You chose Beef salad combo");
                        break;
                    case 3:
                        System.out.println("You chose Whole beef combo");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please order at the cashier");
                        break;
                }
                break;
            case "VEGETARIAN":
                System.out.println("Please choose your combo. 1 - Salad combo, 2 - Falafel burger combo, 3 - Fruit combo");
                int userChosenComboVeg = scanner.nextInt();
                switch (userChosenComboVeg) {
                    case 1:
                        System.out.println("You chose Salad combo!");
                        break;
                    case 2:
                        System.out.println("You chose Falafel burger combo");
                        break;
                    case 3:
                        System.out.println("You chose Fruit combo");
                        break;
                    default:
                        System.out.println("You entered wrong combo number, please order at the cashier");
                        break;
                }
                break;
            default:
                System.out.println("Sorry we don't have such a meal, please ask info");
                break;
        }

    }
}

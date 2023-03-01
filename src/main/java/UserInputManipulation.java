import org.apache.commons.lang3.StringUtils;


import java.util.Scanner;
public class UserInputManipulation {
        public static void main(String[] args) {
            //Gets user input
            Scanner scanner = new Scanner(System.in);
            String askAgain;

            do{
                // Prompt the user for input
                System.out.println("Welcome to the String Manipulator Program!");
                System.out.print("Enter a string: ");
                String userInput = scanner.nextLine();

                System.out.println("You entered: " + userInput);

                // Check if the input is a number
                boolean isNumber = StringUtils.isNumeric(userInput);
                if (isNumber) {
                    System.out.println(userInput + " is a number.");
                } else {
                    System.out.println(userInput + " is not a number.");
                }

                // Flip the case of the string
                String flipped = StringUtils.swapCase(userInput);
                System.out.println("Flipped case: " + flipped);

                // Reverse the string
                String reversed = StringUtils.reverse(userInput);
                System.out.println("Reversed string: " + reversed);

                //Asks user if they want to continue
                System.out.println("Do you want to enter another string? (yes/no): ");
                askAgain = scanner.nextLine();

            } while(askAgain.equalsIgnoreCase("yes"));
            System.out.println("Thanks for using this program. Goodbye!");
            }
}

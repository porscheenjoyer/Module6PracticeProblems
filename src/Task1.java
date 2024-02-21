import java.io.PushbackReader;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int userNum = 0;
        boolean done = false;
        String trash;

        //loop
        do {

            System.out.println("Please enter a number.");

            if (in.hasNextInt()) {

                userNum = in.nextInt();
                done = true;

            }

            else {

                trash = in.nextLine();
                System.out.println("You gave an invalid value: " + trash);

            }

        } while (!done);


        if (userNum < 0) {

            userNum = userNum * -1;

        }

        if (userNum <= 9) {

            System.out.println("Your number only has one digit.");

        }

        else if (userNum >= 1000000){

            System.out.println("Your number has seven or more digits");

        }

        else if (userNum >= 100000) {

            System.out.println("Your number has six digits.");

        }

        else if (userNum >= 10000) {

            System.out.println("Your number has five digits.");

        }

        else if (userNum >= 1000) {

            System.out.println("Your number has four digits.");

        }

        else if (userNum >= 100) {

            System.out.println("Your number has three digits.");

        }

        else {

            System.out.println("Your number has two digits.");

        }


    }
}

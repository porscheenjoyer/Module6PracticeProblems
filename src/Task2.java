import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int numOne = 0;
        int numTwo = 0;
        int numThree = 0;
        boolean done = false;
        String trash;

        //loop
        do {

            System.out.println("Enter the first number.");

            if (in.hasNextInt()) {

                numOne = in.nextInt();
                System.out.println("Enter your second number.");

                if (in.hasNextInt()) {

                    numTwo = in.nextInt();
                    System.out.println("What is the third number?");

                    if (in.hasNextInt()) {

                        numThree = in.nextInt();
                        done = true;

                    }

                }

            }

            else {

                trash = in.nextLine();
                System.out.println("Your input was invalid: " + trash);

            }

        } while (!done);

        if (numOne == numTwo) {

            if (numTwo == numThree) {

                System.out.println("Equal");

            }

        }

        else if (numOne != numTwo) {

            if (numTwo != numThree) {

                if (numOne != numThree) {

                    System.out.println("Different");

                }

            }

        }

        else {

            System.out.println("Neither");

        }

    }
}

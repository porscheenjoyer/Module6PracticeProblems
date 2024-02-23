import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        int month = 0;
        boolean done = false;
        String trash;

        do {

            System.out.println("Enter the month(number)");

            if (in.hasNextInt()) {

                    month = in.nextInt();
                    done = true;


            }

            else {

                trash = in.nextLine();
                System.out.println("Your input was invalid: " + trash);

            }

        } while (!done);

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Your month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Your month has 30 days");
                break;
            case 2:
                System.out.println("Your month has 28 days");
                break;
            default:
                System.out.println("Your number was not between 1 and 12");
                break;

        }

    }
}

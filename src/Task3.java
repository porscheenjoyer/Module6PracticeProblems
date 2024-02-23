import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Variables
        Scanner in = new Scanner(System.in);
        String userLetter = " ";
        boolean done = false;
        double number = 0;

       do {

           System.out.println("Enter a letter");

           if (in.hasNextDouble()) {

               number = in.nextDouble();
               System.out.println("Need a letter, you gave : " + number);
               in.nextLine();

           }

           else {

               userLetter = in.nextLine();
               if (userLetter.length() == 1) {

                   done = true;

               }

               else {

                   System.out.println("Need a single letter");
                   in.nextLine();

               }

           }

       } while (!done);

       userLetter = userLetter.toLowerCase();

       switch (userLetter) {

           case "a":
           case "e":
           case "i":
           case "o":
           case "u":
               System.out.println("Your letter is a vowel");
               break;
           default:
               System.out.println("Your letter is a constant");
               break;

       }

    }
}

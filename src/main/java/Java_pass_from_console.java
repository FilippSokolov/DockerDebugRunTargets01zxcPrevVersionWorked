

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Java_pass_from_console {

    public static void main (String args[]) throws IOException {

        Console c1 = System.console();

        Scanner c = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = c.nextLine();
        System.out.println("Enter your old password: ");
        char [] oldPassword = c.nextLine().toCharArray();

        if (verify(login, oldPassword)) {
            boolean noMatch;
            do {
                System.out.println(System.getenv("aaa"));
                System.out.println("Enter your new password: ");
                char [] newPassword1 = c.nextLine().toCharArray();
                System.out.println("Enter new password again: ");
                char [] newPassword2 = c.nextLine().toCharArray() ;
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                if (noMatch) {
                    System.out.println("Passwords don't match. Try again.%n");
                } else {
                    change(login, newPassword1);
                    System.out.println("Password for "+login+" changed." );

                }
                Arrays.fill(newPassword1, ' ');
                Arrays.fill(newPassword2, ' ');
            } while (noMatch);
        }

        Arrays.fill(oldPassword, ' ');
    }

    // Dummy change method.
    static boolean verify(String login, char[] password) {
        return true;
    }

    // Dummy change method.
    static void change(String login, char[] password) {
    }

}

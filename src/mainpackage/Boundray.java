package mainpackage;

import java.io.IOException;
import java.util.Scanner;

public class Boundray {

	public static void main(String [] args) throws IOException {
                Scanner s = new Scanner(System.in);
		System.out.println("\t\tWelcome To ILostIt!\n");
        int choice = 1;

		while (choice != 0) {
            System.out.println("Select the function u want: ");
            System.out.println("(1) Login\n(2) Sign up");
            choice = s.nextInt();

            switch (choice) {
                case 1: {
                    if (User.SignIn() != null) {
                        System.out.println("Logged in successfully!");
                        travese();
                    }else{
                        System.out.println("Wrong Credentials");
                    }
                        break;
                }
                case 2: {
                    if (User.SignUp()) {
                        System.out.println("User info has been saved!");
                        travese();
                    }else{
                        System.out.println("there seems to be an error");
                    }
                        break;
                }
            }
        }

                /*
		**********
		**********
		**********
		*/
	}

        private static void travese() {
            /**********
             * ***********
             * *********
             */
        }
}

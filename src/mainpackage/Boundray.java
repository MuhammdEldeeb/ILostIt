package mainpackage;

import java.util.Scanner;

public class Boundray {
	
	public static void main(String [] args) {
                Scanner s = new Scanner(System.in);
		System.out.println("\t\tWelcome To ILostIt!\n");
		System.out.println("Select the function u want: ");
                System.out.println("(1) Login\n(2) Sign up");
                int choice = s.nextInt();
                switch(choice){
                    case 1:
                    {
                        User user = new User();
                        if(user.SignIn())
                            travese();
                        else
                            break;
                    }
                    case 2:
                    {
                        User user = new User();
                        if(user.SignUp())
                            travese();
                        else
                            break;
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

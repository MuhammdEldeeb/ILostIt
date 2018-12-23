package mainpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Boundray {
        public static Scanner s = new Scanner(System.in);
        public static User user = new User();
        public static boolean loggedin = false;
        
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

//                
//		System.out.println("\t\tWelcome To ILostIt!\n");
//		System.out.println("Select the function u want: ");
//                System.out.println("(1) Login\n(2) Sign up\nPress Other key to Exit");
//                
//                while(true){
//                    int choice = s.nextInt();
//                    switch(choice){
//                        case 1:
//                        {
//                            if(user.SignIn()){
//                                System.out.println("u logged in successfully");
//                                loggedin = true;
//                                travese();
//                            }
//                            else{
//                                break;
//                            }
//                        }
//                        case 2:
//                        {
//                            if(user.SignUp())
//                                System.out.println("now u have an account");
//                            else
//                                break;
//                        }
//                        default:
//                        {
//                            return;
//                        }
//                    }
//                }
            

user.set_username("Eldeeb");
//            Item item1 = new Item(1, "A", "Apple bla bla bla ", "Red", "Giza", "Apple" , "AppleImage");
//            
//            Item item2 = new Item(2, "b", "Apple bla bla bla ", "green", "Giza", "Apple" , "AppleImage");
//            
//            Item item3 = new Item(3, "v", "Apple bla bla bla ", "Red", "dokki", "Apple" , "AppleImage");
//            
//            Item item4 = new Item(4, "v", "Apple bla bla bla ", "Red", "dokki", "Apple" , "AppleImage");
//      
            Post post1 = new Post("title1" , user , new Item(1, "A", "Apple bla bla bla ", "Red", "Giza", "Apple" , "AppleImage"));
            Post post2 = new Post("title2" , user , new Item(3, "v", "Apple bla bla bla ", "Red", "dokki", "Apple" , "AppleImage"));
            //Post post3 = new Post("title3" , user , new Item(2, "b", "Apple bla bla bla ", "green", "Giza", "Apple" , "AppleImage"));
            
            Post_DataBase.retreave();
            System.out.println("**********************************************");
            Post_DataBase.udate(post1);
            
            Post_DataBase.retreave();
//            Item_DataBase.retreave();
            System.out.println("**********************************************");
//
            

//            Item_DataBase.delete(item4);
//            
//            Item_DataBase.retreave();
//            System.out.println("**********************************************");
//            
//            System.out.print("new name : ");
//        String name = s.nextLine();
//        item2.set_name(name);
//        System.out.print("new description : ");
//        String description = s.nextLine();
//        item2.set_description(description);
//        System.out.print("new color : ");
//        String color = s.nextLine();
//        item2.set_color(color);
//        System.out.print("new area : ");
//        String area = s.nextLine();
//        item2.set_area(area);
//        System.out.print("new type : ");
//        String type = s.nextLine();
//        item2.set_type(type);
//        System.out.print("new image : ");
//        String image = s.nextLine();
//        item2.set_image(image);
//        
//        Item_DataBase.update(item2);
//            
//Item_DataBase.retreave();
//            System.out.println("**********************************************");            
//            
//
//	}

//        private static void travese() {
//            System.out.println("now u r in the app");
//            while(loggedin){
//                ArrayList<Post> posts = Post_DataBase.retreave();
//            for(Post p : posts){
//                System.out.println(p.get_owner());
//                System.out.println( p.get_title() + "\n" + p.get_item().get_id() );
//                System.out.println(p.getit);
//                System.out.println( p.get_description() + " "  + p.get_photo() );
//                System.out.println("--------------------------------------------------------------");
//            }
//            System.out.println("Select the process u want to do:");
//            System.out.println("(1)LogOut\n(2)Post\n(3)Delete\n(4)Update(5)Claim\n(6)Search");
//            int choice = s.nextInt();
//            switch(choice){
//                case 1:{
//                    User user = new User();
//                    user.LogOut();
//                    break;
//                }
//                case 2:{
//                    Post post = new Post();
//                    post.insert();
//                }
//            }
//            
//            System.out.println();
//        }
            }
            
            
}

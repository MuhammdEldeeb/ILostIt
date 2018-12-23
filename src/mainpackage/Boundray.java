package mainpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Boundray {
        public static Scanner s = new Scanner(System.in);
        public static User user ;
        public static boolean loggedin = false;
        
	public static void main(String [] args) throws IOException {

            Scanner s = new Scanner(System.in);
            System.out.println("\t\tWelcome To ILostIt!\n");
            int choice = 1;

            while (choice != 0) {
                System.out.println("Select the function u want: ");
                System.out.println("(1) Login\n(2) Sign up\n(0) Exit");
                choice = s.nextInt();

                switch (choice) {
                    case 1: {
                        user = User.SignIn(); 
                        if (user != null) {
                            System.out.println("Logged in successfully!");
                            loggedin = true;
                            travese();
                        }else{
                            System.out.println("Wrong Credentials");
                        }
                        break;
                    }
                    case 2: {
                        if (User.SignUp()) {
                            System.out.println("User info has been saved!");
                        }else{
                            System.out.println("there seems to be an error");
                        }
                        break;
                    }
                }
            }

        }
            
        
            private static void travese() {
                System.out.println("now u r in the app");
                while(loggedin){
                    Post_DataBase.retreave();
                    
                    System.out.println("Select the process u want to do:");
                    System.out.println("(1)LogOut\n(2)Post\n(3)Delete\n(4)Update(5)Claim\n(6)Search");
                    int choice = s.nextInt();
                    switch(choice){
                        case 1:{ // logout process
                            loggedin = false;
                            break;
                        }
                        case 2:{ // post process
                            
                            Post post = new Post();
                            post.set_owner(user);
                            if(post.insert())
                                System.out.println("ur post is successfully created");
                            else{
                                System.out.println("somthing went wrong with creating the post");
                            }
                            break;
                        }
                        case 3:{ // delete post 
                            Post post = new Post();
                            System.out.println("Enter the id of the post u want to delete :");
                            int id = s.nextInt();
                            post.set_id_item(id);
                            if(Post_DataBase.delete(post)){
                                System.out.println("post is successfully deleted");
                            }else{
                                System.out.println("somthing went wrong with deleting the post");
                            }
                            break;
                        }
                        case 4:{ // update post
                            Post post = new Post();
                            System.out.println("Enter the id of the post u want to update :");
                            int id = s.nextInt();
                            post.set_id_item(id);
                            if(Post_DataBase.udate(post)){
                                System.out.println("post is successfully udated");
                            }else{
                                System.out.println("somthing went wrong with updating the post");
                            }
                            break;
                        }
                        case 5:{ // claim
                            
                            break;
                        }
                        case 6:{ // search
                            System.out.println("enter the datails u want to search");
                            System.out.println("description");
                            String desc = s.next();
                            System.out.println("color");
                            String co = s.next();
                            System.out.println("area");
                            String ar = s.next();
                            System.out.println("type");
                            String ty = s.next();
                            System.out.println("image");
                            String ima = s.next();
                            
                            Item item = new Item();
                            item.set_area(ar);
                            item.set_color(co);
                            item.set_description(desc);
                            item.set_image(ima);
                            item.set_type(ty);
                            
                            Post post = new Post();
                            post.set_item(item);
                            
                            ArrayList<Post> found = Post_DataBase.search(post);
                            
                            for(Post i : found){
                                i.display();
                            }
                            
                            
                            break;
                        }
                        default:{
                            break;
                        }
                        
                    }

                    System.out.println("\n");
                }
        }
        
            
}

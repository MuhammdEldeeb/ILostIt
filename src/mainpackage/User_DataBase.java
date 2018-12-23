package mainpackage;


import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User_DataBase {
	private static ArrayList<User> users = new ArrayList<User>();
        
	public static boolean insert(User user) throws IOException {
        users.add(user);
        return true;
        }
        
        public static boolean delete(User user){
            for(User i : users){
                if(i.get_id() == user.get_id()){
                    users.remove(i);
                    return true;
                }
            }
            return false;
        }
        
        public static boolean Update(User user){
            for(User i : users){
                if(i.get_id() == user.get_id()){
                    i = user;
                    return true;
                }
            }
            return false;
        }
        
        public static User searchByUsername_Password(String username , String password){
            for(User user : users){
                if(user.get_username().equals(username) && user.get_password().equals(password)){
                    return user;
                }
            }
            return null;
        }
}
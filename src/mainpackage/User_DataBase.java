package mainpackage;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User_DataBase {
	private static ArrayList<User> users;
        private static FileOutputStream fos;
        private static ObjectOutputStream out;
        private static FileInputStream fis;
        private static ObjectInputStream in;
	private static String filePath = "userDatabase.txt";
        
        public static boolean writeonFile(){
            try {
                fos = new FileOutputStream(new File(filePath));
                out = new ObjectOutputStream(fos);
                out.writeObject(users);
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        
        public static boolean readFromFile(){
            try {
                fis = new FileInputStream(new File(filePath));
                in = new ObjectInputStream(fis);
                users = (ArrayList<User>) in.readObject();
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        
	public static boolean insert(User user) {
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
            for(User i : users){
                if(i.get_username().equals(username) && i.get_password().equals(password)){
                    return i;
                }
            }
            return null;
        }
}
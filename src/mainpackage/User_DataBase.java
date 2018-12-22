package mainpackage;


import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User_DataBase {
	private static ArrayList<User> users = new ArrayList<User>();
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
                out.close();
                fos.close();
                return true;
            } catch (Exception ex) {
                return false;
            }
        }
        
        public static boolean readFromFile() throws IOException {
            try {
                fis = new FileInputStream(new File(filePath));
                in = new ObjectInputStream(fis);
                users = (ArrayList<User>) in.readObject();
                in.close();
                fis.close();
                return true;
            } catch (Exception ex) {
                return false;
            }

        }
        
	public static boolean insert(User user) throws IOException {
		users.add(user);
		writeonFile();
        readFromFile();
		for (User user1 : users) {
            System.out.println(user1.get_username());
        }


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
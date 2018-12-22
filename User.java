//package mainpackage;

import java.util.Scanner;

public class User {
	private int id;
	private String username;
	private String password;
	private String gender;
	private User_DataBase obj;
	
    public User () {}
	public User (int i, String un, String ps, String g) {
		id = i;
		username = un;
		password = ps;
		gender = g;
		insert(this);
	}
	
	public boolean Change_Password() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the new password: ");
		String password = in.nextLine(); // read the new password
		
		while(password.isEmpty()) {
			System.out.println("Enter a Valid  username: ");
			password = in.nextLine(); // read the new password
		}
		
		this.password = password;
		return true;
		
	}
	
	public boolean Change_Username() {
		@SuppressWarnings("resource")
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the new username: ");
		String un = in.nextLine(); // read the new username
		
		while(un.isEmpty()) {
			System.out.println("Enter a Valid username: ");
			un = in.nextLine(); // read the new username
		}
		username = un;
		return true;
	}
	
	public void LogOut() {
		/*
		**********
		**********
		**********
		*/
	}
	
	public boolean SignIn() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Username: ");
		String un = in.nextLine(); // read the new username
		
		while(un.isEmpty()) {
			System.out.println("Enter a Valid Username: ");
			un = in.nextLine(); // read the new username
		}
		
		System.out.println("Password: ");
		String password = in.nextLine(); // read the new password
		
		while(password.isEmpty()) {
			System.out.println("Enter a Valid Password: ");
			password = in.nextLine(); // read the new password
		}
		
		if(obj.searchByUsername_Password(un, password) != null)
			return true;
		 else{
				return false;
			}
			
	}
	
	public boolean SignUp() {
		Scanner in = new Scanner(System.in);
                
        System.out.println("ID : ");
		int id = in.nextInt(); // read the new id
        in.nextLine();
        
		System.out.println("Username: ");
		String un = in.nextLine(); // read the new username
		
		while(un.isEmpty()) {
			System.out.println("Enter a Valid Username: ");
			un = in.nextLine(); // read the new username
		}
		
		System.out.println("Password: ");
		String pass = in.nextLine(); // read the new password
		
		while(pass.isEmpty()) {
			System.out.println("Enter a Valid Password: ");
			password = in.nextLine(); // read the new password
		}
		
		System.out.println("Gender: ");
		String g = in.nextLine(); // read the new gender
		
		while(g.isEmpty()) {
			System.out.println("Enter a Valid Gender: ");
			gender = in.nextLine(); // read the new gender
		}
		
        if(insert(new User(id , un , pass ,g )))
             return true;
        else 
             return false;
	}
	
	public boolean Delete(User user) {
		if(User_DataBase.delete(user))
                    return true;
                else
                    return false;
	}
	
	public boolean insert(User user) {
		if(User_DataBase.insert(user))
                    return true;
                else
                    return false;
	}
	
	public boolean Update(User user) {
		if(User_DataBase.Update(user))
                    return true;
                else 
                    return false;
	}
	
	
	
	private boolean validate(Item item) {
		/*
		**********
		**********
		**********
		*/
		return true;
	}
	
	public boolean claim(Item item) {
		/*
		**********
		**********
		**********
		*/
		validate(item);
		return true;
	}
	
	
	
		//////////////////
	
			//setters
	public void set_id(int id) {
		this.id = id;
	}
	public void set_username(String username) {
		this.username = username;
	}
	public void set_password(String password) {
		this.password = password;
	}
	public void set_gender(String gender) {
		this.gender = gender;
	}
		///////////////////
	
			//getters
	public int get_id() {
		return id;
	}
	public String get_username() {
		return username;
	}
	public String get_password() {
		return password;
	}
	public String get_gender() {
		return gender;
	}
		///////////////////
}
package mainpackage;


import java.io.IOException;
import java.util.Scanner;

public class User {
	private int id;
	private String username;
	private String password;
	private String gender;
	private User_DataBase user_dataBase;

	public User () {}
	public User (int i, String un, String ps, String g) throws IOException {
		id = i;
		username = un;
		password = ps;
		gender = g;
//		insert(this);
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

	public static boolean SignIn() {
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

		return User_DataBase.searchByUsername_Password(un, password) != null;

	}

	public static boolean SignUp() throws IOException {
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
			pass = in.nextLine(); // read the new password
		}

		System.out.println("Gender: ");
		String g = in.nextLine(); // read the new gender

		while(g.isEmpty()) {
			System.out.println("Enter a Valid Gender: ");
			g = in.nextLine(); // read the new gender
		}

		return insert(new User(id, un, pass, g));
	}

	public boolean Delete(User user) {
		return User_DataBase.delete(user);
	}

	public static boolean insert(User user) throws IOException {
		return User_DataBase.insert(user);
	}

	public boolean Update(User user) {
		return User_DataBase.Update(user);
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
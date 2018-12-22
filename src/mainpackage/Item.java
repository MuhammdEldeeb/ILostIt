package mainpackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {
	private int id;
	private String name;
	private String description;
	private String color;
	private String area;
	private String type;
	private Item_DataBase items;
	
	public Item() {}
	public Item(int i, String n, String d, String c, String a, String t) {
		id = i;
		description = d;
		color = c;
		area = a;
		type = t;
		items.insert(this);
	}
	
	public ArrayList<Item> Search() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Item get = new Item();
		ArrayList<Item> found = new ArrayList<Item>();
		
		System.out.println("Enter the name: ");
		get.set_name(in.nextLine());
		
		System.out.println("Enter the description: ");
		get.set_description(in.nextLine());
		
		System.out.println("Enter the color: ");
		get.set_color(in.nextLine());
		
		System.out.println("Enter the area: ");
		get.set_area(in.nextLine());
		
		System.out.println("Enter the type: ");
		get.set_type(in.nextLine());
		
		// Call the DB and fill the  found array
		/*
		**********
		**********
		**********
		*/
		
		return found;
	}
	
	
	public boolean SoftDelete() {
		// Call the DB and Delete the Item 
		/*
		**********
		**********
		**********
		*/
		return true;
		
		/* else{
				return false;
			}
		 */
	}
	
	
	public boolean Insert() {
		// Call the DB and insert the Item 
		/*
		**********
		**********
		**********
		*/
		return true;
		
		/* else{
				return false;
			}
		 */
	}
	
	public boolean Update() {
		// Call the DB and Update the Item 
		/*
		**********
		**********
		**********
		*/
		return true;
		
		/* else{
				return false;
			}
		 */
	}
	
	public void MarkPost() {
		/*
		**********
		**********
		**********
		*/
	}
	
	
	
		//////////////////
			//setters
	public void set_id(int id) {
		this.id = id;
	}
	public void set_name(String name) {
		this.name = name;
	}
	public void set_description(String description) {
		this.description = description;
	}
	public void set_type(String type) {
		this.type = type;
	}
	public void set_color(String color) {
		this.color = color;
	}
	public void set_area(String area) {
		this.area = area;
	}
	
		///////////////////

			//getters
	public int get_id() {
		return id;
	}
	public String get_name() {
		return name;
	}
	public String get_description() {
		return description;
	}
	public String get_color() {
		return color;
	}
	public String get_area() {
		return area;
	}
	public String get_type() {
		return type;
	}
	
		///////////////////

}

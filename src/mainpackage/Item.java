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
    private String image;
    private Scanner s;
    
    public Item() {
    }

    public Item(int i, String n, String d, String c, String a, String t , String img) {
        name = n;
        id = i;
        description = d;
        color = c;
        area = a;
        type = t;
        image = img;
        insert();
    }

    /**
     *
     */
    public void display(){
        System.out.println(id + " " + image);
        System.out.println(description);
    }
    
    public ArrayList<Item> Search() {
        Scanner in = new Scanner(System.in);
        Item get = new Item();
        
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
        

        ArrayList<Item> found = Item_DataBase.search(get);
        
        return found;
    }

    public boolean insert() {
        if (Item_DataBase.insert(this)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Update() {
        
        System.out.print("new name : ");
        name = s.nextLine();
        System.out.print("new description : ");
        description = s.nextLine();
        System.out.print("new color : ");
        color = s.nextLine();
        System.out.print("new area : ");
        area = s.nextLine();
        System.out.print("new type : ");
        type = s.nextLine();
        System.out.print("new image : ");
        image = s.nextLine();
        
        if (Item_DataBase.update(this)) {
            return true;
        } else {
            return false;
        }
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

    public void set_image(String img) {
        this.image = img;
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

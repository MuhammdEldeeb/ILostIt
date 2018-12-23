package mainpackage;

import java.util.Scanner;

public class Post {

    private String title;
    private User owner;
    private Item item;
    
    
    public Post() {
    }

    public Post(String t, User u, Item it) {
        title = t;
        owner = u;
        item = it;
        insert();
    }

    public boolean insert() {
        Scanner s = new Scanner(System.in);
        System.out.print("ID : ");
        int i = s.nextInt();
        System.out.print("name : ");
        String n = s.next();
        System.out.print("desc : ");
        String des = s.next();
        System.out.print("Color : ");
        String col = s.next();
        System.out.print("Area : ");
        String ar = s.next();
        System.out.print("Type : ");
        String ty = s.next();
        System.out.print("image : ");
        String img = s.next();
        
        this.item = new Item( i ,n , des , col , ar , ty , img );
        
        System.out.print("title : ");
        this.title = s.next();
        
        if (Post_DataBase.insert(this)) {
            return true;
        } else {
            return false;
        }
    }


    public void display(){
        System.out.println(owner.get_username() + " " + title);
        this.item.display();
        System.out.println("-----------------------------------------");
    }
    
    //////////////////
    //setters	
    
    public void set_title(String title) {
        this.title = title;
    }

    public void set_owner(User o) {
        owner = o;
    }

    public void set_item(Item i) {
        item = i;
    }

    ///////////////////
    //getters
    
    public String get_title() {
        return title;
    }


    public User get_owner() {
        return owner;
    }

    public Item get_item() {
        return item;
    }

    ///////////////////
}

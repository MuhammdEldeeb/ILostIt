package mainpackage;

import java.util.Scanner;

public class Post {

    private int id;
    private String description;
    private String title;
    private String photo;
    private User owner;
    private Item item;
    private Scanner s;
    
    public Post() {
    }

    public Post(int i, String d, String t, String p, User u, Item it) {
        Scanner s = new Scanner(System.in);
        title = t;
        photo = p;
        owner = u;
        item = it;
        insert(this.owner.get_username());
    }

    public boolean Delete(Post post) {

        if (Post_DataBase.delete(post)) {
            return true;
        } else {
            return false;

        }
    }

    public boolean insert(String newOwner) {
        Item item = new Item();
        item.insert();
        System.out.print("ID : ");
        int i = s.nextInt();
        System.out.print("title : ");
        String t = s.nextLine();
        System.out.print("Image : ");
        String ph = s.nextLine();
        System.out.print("Descriptio : ");
        String d = s.nextLine();
        System.out.print("Item : ");
        String it = s.nextLine();
        
        Post post = new Post();
        post.id = i;
        post.description = d;
        post.title = t;
        post.photo = ph;
        
        
        if (Post_DataBase.insert(post)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Update(Post post) {
        if (Post_DataBase.udate(post)) {
            return true;
        } else {
            return false;
        }
    }

    //////////////////
    //setters	
    public void set_id(int id) {
        this.id = id;
    }

    public void set_title(String title) {
        this.title = title;
    }

    public void set_description(String description) {
        this.description = description;
    }

    public void set_type(String photo) {
        this.photo = photo;
    }

    public void set_owner(User o) {
        owner = o;
    }

    public void set_item(Item i) {
        item = i;
    }

    ///////////////////
    //getters
    public int get_id() {
        return id;
    }

    public String get_description() {
        return description;
    }

    public String get_title() {
        return title;
    }

    public String get_photo() {
        return photo;
    }

    public User get_owner() {
        return owner;
    }

    public Item get_item() {
        return item;
    }

    ///////////////////
}

package mainpackage;

public class Post {

	private int id;
	private String description;
	private String title;
	private String photo;
	private User owner;
	private Item item;
	private Post_DataBase posts;
	
	
	public Post() {}
	
	public Post(int i, String d, String t, String p, User u, Item it) {
		id = i;
		description = d;
		title = t;
		photo = p;
		owner = u;
		item = it;
		
		posts.insert(this);
	}
	
	
	public boolean Delete() {
		// Call the DB and Delete the post 
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
		// Call the DB and insert the post 
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
		// Call the DB and Update the post 
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
		return photo ;
	}
	public User get_owner() {
		return owner;
	}
	public Item get_item() {
		return item;
	}
	

		///////////////////
}

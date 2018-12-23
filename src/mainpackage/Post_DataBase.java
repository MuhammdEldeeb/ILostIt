package mainpackage;

import java.util.ArrayList;
import static mainpackage.Item_DataBase.items;

public class Post_DataBase {
	public static ArrayList<Post> posts = new ArrayList<>();
	
	public static boolean insert(Post post) {
		posts.add(post);
		return true;
	}
        
        public static boolean delete(Post post){
            for(Post i : posts){
                if(post.get_item().get_id() == i.get_item().get_id()){
                    posts.remove(i);
                    return true;
                }
            }
            return false;
        }
        
        public static boolean udate(Post post){
            for(Post i : posts){
                if(post.get_item().get_id() == i.get_item().get_id()){
                    i = post;
                    return true;
                }
            }
            return false;
        }
	
        public static ArrayList<Post> search(Post post) {
        ArrayList<Post> found = new ArrayList<>();
        for (Post i : posts) {
            if (post.get_item().get_area().equals(i.get_item().get_area()) || post.get_item().get_color().equals(i.get_item().get_color()) || post.get_item().get_description().equals(i.get_item().get_description()) || post.get_item().get_name().equals(i.get_item().get_name()) || post.get_item().get_type().equals(i.get_item().get_type())) {
                found.add(i);
            }
        }
        return found;
    }
        
        public static void retreave(){
            ArrayList<Post> temp = new ArrayList<>();
            for(Post i : posts){
                i.display();
            }
        }
}
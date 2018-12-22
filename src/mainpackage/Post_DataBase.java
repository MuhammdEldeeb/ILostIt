package mainpackage;

import java.util.ArrayList;

public class Post_DataBase {
	public static ArrayList<Post> posts;
	
	public static boolean insert(Post post) {
		posts.add(post);
		return true;
	}
        
        public static boolean delete(Post post){
            for(Post i : posts){
                if(post.get_id() == i.get_id()){
                    posts.remove(i);
                    return true;
                }
            }
            return false;
        }
        
        public static boolean udate(Post post){
            for(Post i : posts){
                if(post.get_id() == i.get_id()){
                    i = post;
                    return true;
                }
            }
            return false;
        }
	
        public static Post search(Post post){
            for(Post i : posts){
                if(post.get_id() == i.get_id()){
                    return i;
                }
            }
            return null;
        }
}
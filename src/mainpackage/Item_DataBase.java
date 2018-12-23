package mainpackage;

import java.util.ArrayList;
import static mainpackage.Post_DataBase.posts;

public class Item_DataBase {

    public static ArrayList<Item> items = new ArrayList<>();

    public static boolean insert(Item item) {
        items.add(item);
        return true;
    }

    public static boolean delete(Item item) {
        for (Item i : items) {
            if (item.get_id() == i.get_id()) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean update(Item item) {
        for (Item i : items) {
            if (item.get_id() == i.get_id()) {
                i = item;
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Item> search(Item item) {
        ArrayList<Item> found = new ArrayList<>();
        for (Item i : items) {
            if (item.get_area().equals(i.get_area()) || item.get_color().equals(i.get_color()) || item.get_description().equals(i.get_description()) || item.get_name().equals(i.get_name()) || item.get_type().equals(i.get_type())) {
                found.add(i);
            }
        }
        return found;
    }

    public static void retreave(){
            ArrayList<Item> temp = new ArrayList<>();
            for(Item i : items){
                i.display();
            }
        }
}

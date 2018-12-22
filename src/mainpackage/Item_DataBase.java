package mainpackage;

import java.util.ArrayList;

public class Item_DataBase {

    public static ArrayList<Item> items;

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

    public static Item search(Item item) {
        for (Item i : items) {
            if (item.get_id() == i.get_id()) {
                return i;
            }
        }
        return null;
    }

}

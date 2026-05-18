package com.sk.LLD.Lab;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class RecentlyViewedItems {
    public static int MAX_SIZE=3;
    private LinkedList<Items> items=new LinkedList<>();

    public void view(Items item) {
        items.remove(item);
        items.addFirst(item);
        if(items.size()>MAX_SIZE){
            items.removeLast();
        }
    }
    public List<Items> getRecentItems() {
        return items;
    }
}

package com.example.recyclerviewprogram;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Users implements Serializable {
    private static final Users INST = new Users();

    private final List<Item> items = new ArrayList<>();

    private Users(){}

    public static Users getUsers(){return INST;}

    public void add(Item item){this.items.add(item);}
    public List<Item>getAll(){return this.items;}
    public int size(){return this.items.size(); }
    public Item get (int index){
        return this.items.get(index);
    }

}

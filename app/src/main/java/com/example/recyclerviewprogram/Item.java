package com.example.recyclerviewprogram;



import java.util.Objects;

public class Item{
    private String name;
    private String address;
    private String age;

    public Item(String name, String address, String age){
        this.name=name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){return address;}

    public String getAge(){return age;}
    
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){this.address = address;}
    public void setAge(String age){this.age = age;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getAge().equals(item.getAge()) &&
                getName().equals(item.getName()) &&
                getAddress().equals(item.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getAge());
    }
}

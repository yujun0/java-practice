package com.sample;

public class Book extends Object {

    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

//    @Override
//    public String toString(){
//        return "[" + name + ", " + price + "]";
//    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + '}';
    }

}

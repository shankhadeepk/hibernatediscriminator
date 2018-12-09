package com.sample.beans;

public class Socks extends Product{

    private String size;

    public Socks() {
    }

    public Socks(String size) {
        this.size = size;
    }

    public Socks(int id, String name, String size) {
        super(id, name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

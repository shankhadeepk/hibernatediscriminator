package com.sample.beans;

public class Hat extends Product{

    private String size;

    public Hat() {
    }

    public Hat(String size) {
        this.size = size;
    }

    public Hat(int id, String name, String size) {
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

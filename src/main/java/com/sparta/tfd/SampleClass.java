package com.sparta.tfd;

public class SampleClass {

    private int quantity;

    private String name;

    public SampleClass(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public boolean setQuantity(int quantity) {
        this.quantity = quantity;
        return true;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean setName(String name) {
        this.name = name;
        return true;
    }

}

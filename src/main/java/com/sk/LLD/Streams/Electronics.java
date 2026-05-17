package com.sk.LLD.Streams;

public class Electronics extends Item {
    private int warrantyMonths;

    public Electronics(String id, String name, double price, int quantity, int warrantyMonths) {
        super(id, name, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() { return warrantyMonths; }

    @Override
    public String toString() {
        return "Electronics{" + super.toString() + ", Warranty=" + warrantyMonths + " months}";
    }
}
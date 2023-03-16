package com.example.project_assignment;

public class Register
{
    private String stockName;
    private int quantity;
    private double price;
    private double priceAtFull;
    private String inDate;
    private String outDate;
    // Add constructor and getter/setter methods for each instance variable
    public Register(String stockName, int quantity, double price, double priceAtFull, String inDate, String outDate) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
        this.priceAtFull = priceAtFull;
        this.inDate = inDate;
        this.outDate = outDate;
}
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName){
        this.stockName = stockName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceAtFull() {
        return priceAtFull;
    }

    public String getInDate() {
        return inDate;
    }
    public void setPriceAtFull(){
        this.inDate = inDate;
    }
    public String getOutDate(){
        return outDate;
    }
    public void setOutDate(){
        this.outDate = outDate;
    }
}

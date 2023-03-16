package com.example.project_assignment;

public class ReadFunction {
    Integer productID,quantityTotal,quantityRemain;
    String brand;
    String nameProduct;
    Integer date;
    public ReadFunction(Integer productID, String quantityTotal, String quantityRemain, String brand, Integer nameProduct, Integer date){
        this.productID=productID;
        this.brand=brand;
//        this.nameProduct= nameProduct;
//        this.date=date;
//        this.quantityTotal=quantityTotal;
//        this.quantityRemain=quantityRemain;
    }

    public Integer getProductID() {
        return productID;
    }

    public Integer getQuantityTotal() {
        return quantityTotal;
    }

    public Integer getQuantityRemain() {
        return quantityRemain;
    }

    public String getBrand() {
        return brand;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public Integer getDate() {
        return date;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public void setQuantityTotal(Integer quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    public void setQuantityRemain(Integer quantityRemain) {
        this.quantityRemain = quantityRemain;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setDate(Integer date) {
        this.date = date;
    }
}

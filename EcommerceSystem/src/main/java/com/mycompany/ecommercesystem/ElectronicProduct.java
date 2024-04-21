/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;


public class ElectronicProduct extends product {
     private String brand ;
    private int warrantyPeriod ;

    public ElectronicProduct () {}
    public ElectronicProduct (int productId , String name , float price , String brand , int warrantyPeriod) {
        super(productId, name, price) ;
        this.brand = brand ;
        this.warrantyPeriod = warrantyPeriod ;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
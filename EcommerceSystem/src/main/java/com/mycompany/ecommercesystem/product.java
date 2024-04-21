/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ecommercesystem;


public class product {
     protected int productId ;
    protected String name ;
    protected float price ;
    
    public product () {}
    public product (int productId , String name , float price) {
        this.productId = productId ;
        this.name = name ;
        this.price = price ;
    }
    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
       this.price = Math.abs(price);
    }

    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
} 



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;


public class cart {
    private int customerId ;
    private int nProduct  ;
    private product [] products ; 

    public cart () {} 
    public cart (Customer c , int nProduct) {
        this.customerId = c.getCustomerId();
        this.nProduct = Math.abs(nProduct);
        this.products= new product [this.nProduct];
    }
    
    public void setProduct (int i , product obj) {
        products[i] = obj ;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public void setnProduct(int nProduct) {
        this.nProduct = Math.abs(nProduct);
    }

    public int getCustomerId() {
        return customerId;
    }
    public int getnProduct() {
        return nProduct;
    }
    public product[] getProducts() {
        return products;
    }
    
    public product[] addProduct (int numProductAdd , product obj) {
         product [] new_Products = new product[this.nProduct + numProductAdd];
         
       for ( int i = 0 ; i < this.nProduct; i++) {
           new_Products[i] = this.products[i];
       }
       for (int i = this.nProduct ; i < (this.nProduct + numProductAdd) ; i++) {
           new_Products[i] = obj;
       }
       return new_Products;
    }

    private product[] removeProducts ( product[] products , int remove ) {
        product [] new_Products = new product[products.length -1];

        if (0 <= remove && remove <= products.length) {
            for (int i = 0 , j = 0 ; i < products.length ; i++ ) {
                if (i != (remove-1)) {
                    new_Products[j] = products[i];
                    j++ ;
                }
            }
            return new_Products ;
        }
        else {
            return products ;
        }
    }

    public float calculatePrice ( ) {
        float totalPrice = 0f ;
        for (int i =0 ; i < products.length ; i++) {
            totalPrice += products[i].getPrice() ;
        }
        return totalPrice ;
    }

    public void placeOrder () {
        System.out.print( "total price is : $" + calculatePrice());
    }
    
    
}


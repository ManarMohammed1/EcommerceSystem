/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommercesystem;


public class order {
    private int customerId ;
    private static int orderId = 1 ;
    private product[] products ;
    private float totalPrice;

    public order () {}
    public order (cart c) {
        this.customerId = c.getCustomerId();
        this.products = c.getProducts();
        this.totalPrice = c.calculatePrice();
    }

    public void printOrderInfo () {
        System.out.println("Here's your order's summary :");
        System.out.print("order ID : " + orderId);
        System.out.print("\ncustomer ID : " + customerId);
        System.out.println("\nproducts :");
        for (int i =0 ; i < products.length ; i++) {
            System.out.println(products[i].getName() + " - " + products[i].getPrice());
        }
        System.out.println ("total price : $" + totalPrice);
        orderId ++;
    }
}


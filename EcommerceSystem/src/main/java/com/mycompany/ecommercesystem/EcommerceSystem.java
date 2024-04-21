/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommercesystem;
import java.util.Scanner;


public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        product e1 = new ElectronicProduct(1, "Smartphone", 599.9f, "Samsung", 1);
        product c1 = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        product b1 = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X publication");

        System.out.println("welcome to the E-Commerce system!");
        System.out.println("enter your id :");
        int id = input.nextInt();
        System.out.println("enter your name :");
        String name = input.nextLine();
        input.nextLine();
        System.out.println("enter your address:");
        String address = input.nextLine();
        Customer customer = new Customer (id , name , address );

        System.out.println("how many products you want to add to your cart ?");
        int n = input.nextInt();
        cart cart = new cart(customer , n);
      
        for (int i =0 ; i < cart.getnProduct() ; i++) {
            System.out.println("which product would you like to add ? 1- smartphone , 2- T-shirt , 3-oop");
            int product = input.nextInt();
            switch (product) {
                case 1:
                    cart.setProduct(i ,e1);
                    break;
                case 2:
                    cart.setProduct(i ,c1);
                    break;
                case 3:
                    cart.setProduct(i ,b1);
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
        order order = new order(cart);
        cart.placeOrder();
        System.out.println(" .would you like to place the order ? 1-YES , 2- NO");
        int f = input.nextInt();
        if (f == 1){
        order.printOrderInfo();
        }
    }
}

    


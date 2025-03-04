package com.mycompany.ecommerce;

//Parent Class
class Product {
    protected String name;
    protected double price;
    protected int quantity;

    //Constructor
    public Product (String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Display info
    public void displayInfo() {
        System.out.println("Product name: " +name);
        System.out.printf("Product price: %.2f\n" ,price);
        System.out.println("Quantity: " +quantity);
    }
    
    public void calculateTotalPrice(){
        System.out.printf("Total Price: %.2f\n",price * quantity);
    }
}

//Derived Class
class Electronics extends Product{
    private int warrantyMonths;
    
    //Constructor
    public Electronics(String name, double price, int quantity, int warrantyMonths) {
        super(name, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }
@Override
    //TotalPrice
    public void calculateTotalPrice(){
        super.calculateTotalPrice();
    }
    //Warranty Extend
    public void extendWarranty(int extraMonths){
        warrantyMonths = warrantyMonths + extraMonths;
        System.out.println("Warranty extended by " +extraMonths +" months.");
        System.out.println("New warranty period: " +warrantyMonths +" months");
    }
}
//Derived Class "Books"
class Books extends Product{
    private String author;
    
    // Constructor
    public Books(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

@Override
    //TotalPrice
    public void calculateTotalPrice(){
        super.calculateTotalPrice();
    }
    //Read preview
    public void readPreview(){
        System.out.println("Reading a preview of "+ "by: " +author);
    }
}

//Derived Class "Clothing"
class Clothing extends Product{
    private String size;
    
    //Constructor
    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }
    
@Override
    //TotalPrice
    public void calculateTotalPrice(){
        super.calculateTotalPrice();
    }
    //Try on
    public void tryOn(){
        System.out.println("Trying on "+name +" in size: " +size);
    }
}

//main method
public class Ecommerce{
    public static void main (String[] args){
        System.out.println("E-COMMERECE SYSTEM");
        
        Electronics laptop = new Electronics("Laptop", 50000, 2, 24);
        laptop.displayInfo();
        laptop.calculateTotalPrice();
        laptop.extendWarranty(6);
        System.out.println("-----------------");
        
        Books book = new Books("The Notebook", 1000, 10, "Nicholas Sparks");
        book.displayInfo();
        book.calculateTotalPrice();
        book.readPreview();
        System.out.println("-----------------");
        
        Clothing tShirt = new Clothing("DBTK", 700, 12, "Small");
        tShirt.displayInfo();
        tShirt.calculateTotalPrice();
        tShirt.tryOn();
    }
}

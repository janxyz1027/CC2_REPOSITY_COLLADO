package ecommerce;

// Parent Class
class Product {
    protected String name;
    protected double price;
    protected int quantity;

    //Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    //methods
    // Display info
    public void displayInfo() {
        System.out.printf("Product: %s, Price: $%.2f, Quantity: %d\n", name, price, quantity);
    }

    public void calculateTotalPrice() {
        System.out.printf("Total Price: $%.2f\n", price * quantity);
    }
}

//Derived Class Electronics
class Electronics extends Product {
    private int warrantyMonths;

    //constructor
    public Electronics(String name, double price, int quantity, int warrantyMonths) {
        super(name, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    //methods
    public void displayInfo() {
        System.out.printf("Electronics: %s, Price: $%.2f, Quantity: %d, Warranty: %d months\n", 
                          name, price, quantity, warrantyMonths);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
    //unique method of electronics
    public void extendWarranty(int extraMonths) {
        warrantyMonths = warrantyMonths + extraMonths;
        System.out.println("Warranty extended by " + extraMonths + " months. New warranty period: " + warrantyMonths + " months");
    }
}

//Derived Class Books
class Books extends Product {
    private String author;
    
    //constructor
    public Books(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        this.author = author;
    }

    @Override
    //methods
    public void displayInfo() {
        System.out.printf("Book: %s, Price: $%.2f, Quantity: %d, Author: %s\n", name, price, quantity, author);
    }
    //unique method of book
    public void readPreview() {
        System.out.println("Reading a preview of " + name + " by " + author);
    }
}

//Derived Class Clothing
class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    @Override
    //methods of derived class clothing 
    public void displayInfo() {
        System.out.printf("Clothing: %s, Price: $%.2f, Quantity: %d, Size: %s\n", name, price, quantity, size);
    }

    //unqiue method of clothing
    public void tryOn() {
        System.out.println("Trying on " + name + " in size " + size);
    }
}

// Main Method
public class Ecommerce {
    public static void main(String[] args) {
        System.out.println("E-COMMERCE SYSTEM\n");

        //electronics product
        Electronics laptop = new Electronics("Laptop", 1200.00, 10, 24);
        laptop.displayInfo();
        laptop.calculateTotalPrice();
        laptop.extendWarranty(6);
        System.out.println("------------------------------");

        //clothing product
        Clothing tShirt = new Clothing("T-Shirt", 25.00, 50, "L");
        tShirt.displayInfo();
        tShirt.calculateTotalPrice();
        tShirt.tryOn();
        System.out.println("------------------------------");

        //book product
        Books book = new Books("1984", 15.00, 100, "George Orwell");
        book.displayInfo();
        book.calculateTotalPrice();
        book.readPreview();
        System.out.println("------------------------------");
    }
}

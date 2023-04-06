package Book;
import java.util.*;

class Program {
    String title;
    String author;
    String publisher;
    String isbn;
    int year;
    double price;
    int quantity;

    Program() {
        String title = "0";
        String author = "0";
        String publisher = "0";
        String isbn = "0";
        int year = 0;
        double price = 0.0;
        int quantity = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn(String isbn) {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Scanner sc = new Scanner(System.in);

    void bookPrice(){

        System.out.println("Enter the Book Price :");
        setPrice( sc.nextDouble());

    }

    void increasequantity() {

        System.out.println("Enter the Increase qty of books :");
        setQuantity(sc.nextInt());
    }

    void decreasequantity(){
        System.out.println("Enter the Decrease qty of books :");
        setQuantity( sc.nextInt());

    }

    void inventoryvalue() {
        System.out.println("Total inventory Qty of books :");

        double Total = (getQuantity() * getPrice());
        System.out.println(Total);
    }
}

class Book {
    public static void main(String args[]) {

        Program prg = new Program();
        prg.increasequantity();
        prg.decreasequantity();
        prg.bookPrice();
        prg.inventoryvalue();
    
    }
}

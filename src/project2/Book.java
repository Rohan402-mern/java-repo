package project2;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Bookdetail(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

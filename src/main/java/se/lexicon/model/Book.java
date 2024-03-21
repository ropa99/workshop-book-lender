package se.lexicon.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private String available;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, Person borrower) {
        this.title = title;
        this.author = author;
    }
    public String getBookInformation(){
            return "";
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getAvailable() {
        return available;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
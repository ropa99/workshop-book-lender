package se.lexicon.model;

import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;


    public Book(String title, String author) {
       this(title,author,null);
    }
    public Book(String title, String author, Person borrower) {
        setTitle(title);
        setAuthor(author);
        setId();
        setAvailable(true);

    }
    public String getBookInformation(){
            String strInfo = "id" + ", " + getId() +"title: " +getTitle() + ", " + "author: " + getAuthor() + ", " + "available: " + getAvailable();
            return strInfo;
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

    public boolean getAvailable() {
        return available;
    }

    public void setId() {

            UUID uuid = UUID.randomUUID();
            this.id = uuid.toString();
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Title cannot be null or empty");
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty()) throw new IllegalArgumentException("Author can not be null or empty");
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
package se.lexicon.model;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    private Book borrowedBooks[];

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private static int getNextId() {
        return 0;
    }

    public String getPersonInformation() {
        return "";
    }

    public static int getSequencer() {
        return sequencer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static void setSequencer(int sequencer) {
        Person.sequencer = sequencer;
    }

    //public Book getBorrowedBook(int bookId){}

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void loanBook(Book book){

    }

    public void returnBook(Book book){

    }

}
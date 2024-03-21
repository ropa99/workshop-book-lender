package se.lexicon.model;
import java.util.Arrays;
import se.lexicon.model.Book;
public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;

    private  Book borrowedBooks[] = new Book[0];

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        sequencer ++;
        setId();

    }

    private static int getNextId() {
        return sequencer;
    }

    public String getPersonInformation() {
        StringBuilder sb = new StringBuilder();

        sb.append("id: " + getId() + "," + " firstname: " + getFirstName() + ", " + "lastname: " + getLastName());

        if (borrowedBooks.length > 0) {
            sb.append(" Borrowing books: " );
            for (Book book : borrowedBooks) {

                sb.append(book.getId() + ", " +  book.getTitle() + ", " +  book.getAuthor() +" ");

            }
        }
        return sb.toString();
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


    //public Book getBorrowedBook(int bookId){}

    public void setId() {
        this.id = getNextId();
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.trim().isEmpty()) throw new IllegalArgumentException("First name cannot be null or empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().isEmpty()) throw new IllegalArgumentException("Last name cannot be null or empty");
        this.lastName = lastName;
    }

    public void loanBook(Book book){
        if(book == null) throw new IllegalArgumentException("Book cannot be null");
        book.setAvailable(false);
        //Assume that every book has a unique id and just insert it in the array
        Book tempBook[] = new Book[borrowedBooks.length + 1];
        tempBook  = Arrays.copyOf(borrowedBooks,borrowedBooks.length +1);
        tempBook[tempBook.length - 1 ] = book;
        borrowedBooks = tempBook;
    }

    public void returnBook(Book book){
        int i ,x=0;
        if(findBook((book))){
            //Book exist in the array
            Book tempBook[] = new Book[borrowedBooks.length - 1];
            for (i = 0; i < borrowedBooks.length; i++) {
                if (borrowedBooks[i].getId() != book.getId()) {
                    tempBook[x] = borrowedBooks[i];
                    x++;
                }
            }
            borrowedBooks = tempBook;
            book.setAvailable(true);
        }

    }

    private boolean findBook(final Book book){

        boolean searchBook = false;

        for (Book b : borrowedBooks) {

            if (b.getId().equalsIgnoreCase(book.getId())) {
                searchBook = true;
                break;
            }

        }
        return searchBook;
    }


}
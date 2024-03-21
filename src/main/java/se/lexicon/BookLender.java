package se.lexicon;
import se.lexicon.model.*;

public class BookLender {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        Book bk = new Book("Bamse på äventyr","Anders Svensson");
        // Display book information
        System.out.println(bk.getBookInformation());
        // Create a person instance
        Person pr = new se.lexicon.model.Person("Kalle","Karlsson");
        // Display person information
        System.out.println(pr.getPersonInformation());
        // Loan a book to the person
        pr.loanBook(bk);
        // Display person information after borrowing a book
        System.out.println(pr.getPersonInformation());
        // Display book information after borrowing a book
        System.out.println(bk.getBookInformation());
        // Return the borrowed book
        pr.returnBook(bk);
        // Display person information after returning the book
        System.out.println(pr.getPersonInformation());
        // Display book information after borrowing a book
        System.out.println(bk.getBookInformation());

    }

}

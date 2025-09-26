import java.util.*;

public class Book {
    private String isbn;
    private String title;
    private int publicationYear;
    private List<Author> authors;
    private List<Copy> copies;
    
    // Constructor
    public Book(String isbn, String title, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.publicationYear = publicationYear;
        this.authors = new ArrayList<>();
        this.copies = new ArrayList<>();
    }

    public String getSummary() {
        // TODO: Implementation to get book summary
        return "Title: " + title + ", Year: " + publicationYear + ", ISBN: " + isbn;
    }
    
    public void addAuthor(Author author) {
        // TODO: Implementation to add author
        if (!authors.contains(author)) {
            authors.add(author);
            author.addBook(this);
        }
    }
    
    public void addCopy(Copy copy) {
        // TODO: Implementation to add copy
        if (!copies.contains(copy)) {
            copies.add(copy);
        }
    }   
    
    public List<Copy> getAvailableCopies() {
        // TODO: Implementation to get available copies
        List<Copy> availableCopies = new ArrayList<>();
        for (Copy copy : copies) {
            if (copy.checkAvailability()) {
                availableCopies.add(copy);
            }
        }
        return availableCopies;
    }
    
    // Getters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public int getPublicationYear() { return publicationYear; }
    public List<Author> getAuthors() { return authors; }
    public List<Copy> getCopies() { return copies; }
}



import java.util.*;

public class Author {
    private String name;
    private String bio;
    private List<Book> books;
    
    // Constructor
    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        // TODO: Implementation to add book
        if (!books.contains(book)) {
            books.add(book);
        }
    }
    
    public List<Book> getBibliography() {
        // TODO: Implementation to get author's books
        return new ArrayList<>(books);
    }
    
    // Getters
    public String getName() { return name; }
    public String getBio() { return bio; }
    public List<Book> getBooks() { return books; }
}



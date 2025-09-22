public class Book {
 String isbn;
    String title;
    int publicationYear;
    List<Author> authors;
    List<Copy> copies; 

    public String getSummary() {
        // Implementation to get book summary
        return "";
    }
    public void addAuthor(Author author) {
        // Implementation to add author
    }
    public void addCopy(Copy copy) {
        // Implementation to add copy
    }   
    public List<Copy> getAvailableCopies() {
        // Implementation to get available copies
        return new ArrayList<>();
    }
}


import java.util.*;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<Librarian> librarians;
    
    // Constructor
    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    public void addBook(Book book, int copies) {
        // TODO: Implementation to add book copies
        if (!books.contains(book)) {
            books.add(book);
        }
        // Add the specified number of copies to the book
        for (int i = 0; i < copies; i++) {
            Copy copy = new Copy("COPY_" + book.getIsbn() + "_" + System.currentTimeMillis(), "Good", book);
            book.addCopy(copy);
        }
    }
    
    public void removeBook(Book book) {
        // TODO: Implementation to remove book
        books.remove(book);
    }

    public void registerMember(Member member) {
        // TODO: Implementation to register member
        if (!members.contains(member)) {
            members.add(member);
            member.setLibrary(this);
        }
    }
    
    public void removeMember(Member member) {
        // TODO: Implementation to remove member
        members.remove(member);
    }
    
    public List<Book> findBookByTitle(String title) {
        // TODO: Implementation to find books by title
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    
    public void hireLibrarian(Librarian librarian) {
        // TODO: Implementation to hire librarian
        if (!librarians.contains(librarian)) {
            librarians.add(librarian);
            librarian.setLibrary(this);
        }
    }
    
    public List<Copy> getAvailableCopies(Book book) {
        // TODO: Implementation to get available copies of a book
        return book.getAvailableCopies();
    }
    
    // Getters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public List<Book> getBooks() { return books; }
    public List<Member> getMembers() { return members; }
    public List<Librarian> getLibrarians() { return librarians; }
}






        
        
     public void removeBook(Book book){
        books.remove(book);
     }


     public void registerMember(Member member)
{
    members.add(member);
}
    public List<Book> findBookByTitle(String title) {
        return list;

    }

      public void hireLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }
        public List<Book> getAvailableCopies(Book book) {

            return list;
    
}


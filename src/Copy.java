import java.util.*;

public class Copy {
    private String copyId;
    private String condition;
    private boolean isAvailable;
    private Book book;
    
    // Constructor
    public Copy(String copyId, String condition, Book book) {
        this.copyId = copyId;
        this.condition = condition;
        this.book = book;
        this.isAvailable = true;
    }

    public boolean checkAvailability() {
        // TODO: Implementation to check availability
        return isAvailable;
    }
    
    public void updateCondition(String condition) {
        // TODO: Implementation to update condition
        this.condition = condition;
    }
    
    public Book getBook() {
        // TODO: Implementation to get book details
        return book;
    }
    
    // Getters and setters
    public String getCopyId() { return copyId; }
    public String getCondition() { return condition; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }
}



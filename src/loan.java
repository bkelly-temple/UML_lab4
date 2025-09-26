import java.util.*;

public class Loan {
    private String loanId;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private double fineAmount;
    private Member member;
    private Copy copy;
    private Librarian issuingLibrarian;
    
    // Constructor
    public Loan(String loanId, Date borrowDate, Date dueDate, Member member, Copy copy, Librarian issuingLibrarian) {
        this.loanId = loanId;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.member = member;
        this.copy = copy;
        this.issuingLibrarian = issuingLibrarian;
        this.fineAmount = 0.0;
    }

    public boolean isOverdue() {
        // TODO: Implementation to check if loan is overdue
        if (returnDate == null) {
            return new Date().after(dueDate);
        }
        return false;
    }
    
    public double calculateFine() {
        // TODO: Implementation to calculate fine
        return fineAmount;
    }
    
    public void markReturned() {
        // TODO: Implementation to mark loan as returned
        this.returnDate = new Date();
        if (copy != null) {
            copy.setAvailable(true);
        }
    }
    
    public boolean renew() {
        // TODO: Implementation to renew loan
        return false;
    }
    
    // Getters
    public String getLoanId() { return loanId; }
    public Date getBorrowDate() { return borrowDate; }
    public Date getDueDate() { return dueDate; }
    public Date getReturnDate() { return returnDate; }
    public double getFineAmount() { return fineAmount; }
    public Member getMember() { return member; }
    public Copy getCopy() { return copy; }
    public Librarian getIssuingLibrarian() { return issuingLibrarian; }
}

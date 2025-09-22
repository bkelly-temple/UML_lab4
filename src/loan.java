public class loan {
String loanId;
    Date borrowDate;
    Date dueDate;
    Date returnDate;
    Double fineAmount;
    Member member;
    Copy copy;
    Librarian issueLibrarian;

    public boolean isOverdue() {
        // Implementation to check if loan is overdue
        return false;
    }
    public Double calculateFine() {
        // Implementation to calculate fine
        return 0.0;
    }
    public void markReturned() {
        // Implementation to mark loan as returned
    }
    public boolean renew() {
        // Implementation to renew loan
        return true;
    }
}


import java.util.*;

public class Member extends User {
    private Date membershipDate;
    private int loanLimit;
    private List<Loan> activeLoans;
    private List<Reservation> reservations;
    private Library library;
    
    // Constructor
    public Member(String userId, String name, String email, String password, Date membershipDate, int loanLimit) {
        super(userId, name, email, password);
        this.membershipDate = membershipDate;
        this.loanLimit = loanLimit;
        this.activeLoans = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public Loan borrowCopy(Copy copy) {
        // TODO: Implementation to borrow a copy
        return null;
    }
    
    public void returnLoan(Loan loan) {
        // TODO: Implementation to return a copy
        if (activeLoans.contains(loan)) {
            activeLoans.remove(loan);
        }
    }
    
    public Reservation reserveBook(Book book) {
        // TODO: Implementation to reserve a book
        return null;
    }
    
    public void cancelReservation(Reservation reservation) {
        // TODO: Implementation to cancel a reservation
        if (reservations.contains(reservation)) {
            reservations.remove(reservation);
        }
    }
    
    public List<Loan> getActiveLoans() {
        return activeLoans;
    }
    
    public List<Reservation> getReservations() {
        return reservations;
    }
    
    public List<Loan> getBorrowingHistory() {
        // TODO: Implementation to get history
        return new ArrayList<>();
    }
    
    // Getters
    public Date getMembershipDate() { return membershipDate; }
    public int getLoanLimit() { return loanLimit; }
    public Library getLibrary() { return library; }
    public void setLibrary(Library library) { this.library = library; }
}



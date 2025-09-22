public class Member extends User {
    Date membershipDate;
    int loanLimit;
    List<Loan> activeLoans;
    List<Reservation> reservations;
    private Library library;

    public List<Loan> borrowCopy(Copy copy) {
        // Implementation to borrow a copy
        return new ArrayList<>();
    }
    public void returnLoan(Loan loan) {
        // Implementation to return a copy
    }
    public List<Reservation> reserveBook(Book book) {
        // Implementation to reserve a book
        return new ArrayList<>();
    }
    public void cancelReservation(Reservation reservation) {
        // Implementation to cancel a reservation
    }
    public List<Loan> getActiveLoans() {
        return activeLoans;
    }
    public List<Reservation> getReservations() {
        return reservations;
    }
    public List<Loan> getBorrowingHistory() {
        // Implementation to get history
        return new ArrayList<>();
    }
}


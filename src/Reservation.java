public class Reservation {
    String reservationId;
    Date requestDate;
    Date expiryDate;
    Member member;
    Book book;
    int position;

    public boolean isExpired() {
        // Implementation to check if reservation is expired
        return true;
    }
    public void cancel() {
        // Implementation to cancel reservation
    }
    public String getStatus() {
        // Implementation to get reservation status
        return "";
    } 
    public void notifyMember() {
        // Implementation to notify member
    }

}


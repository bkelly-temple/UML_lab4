import java.util.*;

public class Reservation {
    private String reservationId;
    private Date requestDate;
    private Date expiryDate;
    private int position;
    private Member member;
    private Book book;
    
    // Constructor
    public Reservation(String reservationId, Date requestDate, Date expiryDate, int position, Member member, Book book) {
        this.reservationId = reservationId;
        this.requestDate = requestDate;
        this.expiryDate = expiryDate;
        this.position = position;
        this.member = member;
        this.book = book;
    }

    public void cancel() {
        // TODO: Implementation to cancel reservation
    }
    
    public String getStatus() {
        // TODO: Implementation to get reservation status
        if (isExpired()) {
            return "Expired";
        }
        return "Active";
    }
    
    public boolean isExpired() {
        // TODO: Implementation to check if reservation is expired
        return new Date().after(expiryDate);
    }
    
    public void notifyMember() {
        // TODO: Implementation to notify member
    }
    
    // Getters
    public String getReservationId() { return reservationId; }
    public Date getRequestDate() { return requestDate; }
    public Date getExpiryDate() { return expiryDate; }
    public int getPosition() { return position; }
    public Member getMember() { return member; }
    public Book getBook() { return book; }
}



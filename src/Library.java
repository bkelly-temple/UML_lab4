public class Library {
    String name;
    String address;
    ArrayList<Books> books;
    ArrayList<Librarians> librarians;
    ArrayList<Members> members;

     public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }


    public void addBook(Book book,int copies){
         // add book to the list of books
         for(int i=0;i<copies;i++){
            books.add(book);// ad copies amount of books to the list
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

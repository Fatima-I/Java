package SectionA;

public class User {
    private String password;
    private String username;
    Book[] borrowedBooks = new Book[10];

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }
    User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        for (int i = 0; i<borrowedBooks.length; i++)
        {
            if(borrowedBooks[i] != null && book.getTitle() == borrowedBooks[i].getTitle()) {
                if(borrowedBooks[i].getAva_status() == Status.AVAILABLE) {
                    System.out.println("Book is available for borrow");
                    borrowedBooks[i].setAva_status(Status.BORROWED);
                    break;
                }
            }
            else if (borrowedBooks[i] != null && borrowedBooks[i].getAva_status() == Status.BORROWED){
                System.out.println("Book is already borrowed");
                break;
            }
        }
    }

    public void returnBook(Book book) {
        for (int i = 0; i<borrowedBooks.length; i++)
        {
            if(borrowedBooks[i] != null && book.getTitle() == borrowedBooks[i].getTitle()) {
                if(borrowedBooks[i].getAva_status() == Status.BORROWED) {
                    System.out.println("Book is returned");
                    borrowedBooks[i].setAva_status(Status.AVAILABLE);
                }
            }
            else if (borrowedBooks[i].getAva_status() == Status.AVAILABLE){
                System.out.println("Book is already returned");
            }
            }
    }

    public void addBook(Book book) {
        for (int i = 0; i<borrowedBooks.length; i++) {
            if(borrowedBooks[i] == null) {
                borrowedBooks[i] = book;
                System.out.println("Book added sucessfully!");
                break;
            }
            else {
                System.out.println("No space is left in library");
            }
        }
    }
}

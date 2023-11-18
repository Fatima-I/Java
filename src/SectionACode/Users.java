package SectionACode;

public class Users
{
    private String password;
    private String username;
     Book[] borrowedBooks;
    int counter = 0;

    public Users()
    {
        borrowedBooks = new Book[3];
    }

    public Users(String password, String username)
    {
        this.password = password;
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public Book[] getBorrowedBooks()
    {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks)
    {
        this.borrowedBooks = borrowedBooks;
    }

    public void BorrowBook(Book book)
    {
        for(int i = 0; i < borrowedBooks.length; i++)
        {
            if(borrowedBooks[i] == null)
            {
                borrowedBooks[i] = book;
                borrowedBooks[i].setStatus(Status.BORROWED);
                System.out.println("Book borrowed");
                break;
            }
        }
    }

    public void ReturnBook(Book book)
    {
        for(int i = 0; i < borrowedBooks.length; i++)
        {
            if(borrowedBooks[i] != null && borrowedBooks[i].equals(book))
            {
                borrowedBooks[i].setStatus(Status.AVAILABLE);
                System.out.println("Book Returned");
                for(int j = i; j < borrowedBooks.length - 1; j++)
                {
                    borrowedBooks[j] = borrowedBooks[j+1];
                }
                borrowedBooks[borrowedBooks.length -1] = null;
                break;
            }
        }
    }
}

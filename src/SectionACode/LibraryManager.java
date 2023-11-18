package SectionACode;

import java.util.Arrays;

public class LibraryManager
{
    Book[] libraryInventory = new Book[200];
    Users[] registeredUsers = new Users[200];

    int counter = 0;
    int borrowCounter = 0;


    public boolean AddBook(Book book)
    {
        if(counter < libraryInventory.length)
        {
            libraryInventory[counter++] = book;
            System.out.println("Book is Added Successfully");
            return true;
        }

        return false;
    }

    public void RemoveBook(Book book)
    {
        for(int i = 0; i < libraryInventory.length; i++)
        {
            if(libraryInventory[i] != null && libraryInventory[i].getISBN().equals(book.getISBN()))
            {
                for(int j = i; j < libraryInventory.length - 1; j++)
                {
                    libraryInventory[j] = libraryInventory[j+1];
                }
                libraryInventory[libraryInventory.length -1] = null;
                System.out.println("Book is Removed Successfully");
                break;
            }
        }
    }

    public void SearchBook(String isbn)
    {
        for(int i = 0; i < libraryInventory.length; i++)
        {
            if(libraryInventory[i] != null && libraryInventory[i].getISBN().equals(isbn))
            {
                System.out.println("Book is found at "+ i + " index of Array");
            }
        }
    }

    public void BorrowBook(Users user, Book book)
    {
        for(int i = 0; i < registeredUsers.length; i++)
        {
            if(registeredUsers[i] != null && registeredUsers[i]!=null)
            {
                for(Book b: libraryInventory)
                {
                    if (libraryInventory[i]!=null && libraryInventory[i].equals(book))
                    {
                        registeredUsers[i].BorrowBook(book);
                        break;
                    }
                }
            }
        }
    }
    public void ReturnBook(Users user, Book book) {
        for (int i = 0; i < registeredUsers.length; i++) {
            if (registeredUsers[i] != null && registeredUsers[i].equals(user))
            {
                registeredUsers[i].ReturnBook(book);
            }
        }
    }

    public void DisplayReport()
    {
        System.out.println(Arrays.toString(libraryInventory));
    }


    public Book[] getLibraryInventory()
    {
        return libraryInventory;
    }

    public void setLibraryInventory(Book[] libraryInventory)
    {
        this.libraryInventory = libraryInventory;
    }

    public Users[] getRegisteredUsers()
    {
        return registeredUsers;
    }

    public void setRegisteredUsers(Users[] registeredUsers)
    {
        this.registeredUsers = registeredUsers;
    }

}



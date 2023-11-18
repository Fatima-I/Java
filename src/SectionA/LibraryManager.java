package SectionA;

public class LibraryManager extends User{

    Book libraryInventory[] = new Book[10];

    User users[] = new User[10];

    public void addBook(Book book) {
        for (int i = 0; i<libraryInventory.length; i++) {
            if(libraryInventory[i] == null) {
                libraryInventory[i] = book;
                System.out.println("Book added sucessfully!");
                break;
            }
            else {
                System.out.println("No space is left in library");
            }
        }
    }

    public void searchBook(String title) {
        for (int i = 0; i<libraryInventory.length; i++) {
            if(libraryInventory[i] != null && libraryInventory[i].getTitle() == title) {
                System.out.println("\nBook found\nHere are the details of your book\n");
                libraryInventory[i].showDetails();
                break;
            }
            else {
                System.out.println("No book is matching your search");
                break;
            }
        }
    }

    public void generateReport() {
        for (int i=0; i<libraryInventory.length; i++) {
            if(libraryInventory[i] != null) {
                System.out.println(libraryInventory[i]);
            }
        }
    }

    public void borrowBook(Book book,User user) {

    }

}

package OOPAssignment1;

public class Library {
    LibraryItem[] add = new LibraryItem[10];
    LibraryItem[] borrow = new LibraryItem[10];
    private boolean isBorrowed;
    private static int counter = 0;

    void addItem(LibraryItem item) {
        this.add[counter++] = item;
    }

    void borrowItem(LibraryItem item) {
        isBorrowed = true;
        this.borrow[counter++] = item;
    }

    void returnItem(LibraryItem item) {
        isBorrowed = false;
    }

    void displayAvailableItems() {
        isBorrowed = true;
        if(isBorrowed) {
            for(int i = 0; i< add.length; i++)
                System.out.println(add[i]);
        }
    }

    void displayBorrowedItems() {
        isBorrowed = true;
        if(isBorrowed) {
            for(int i = 0; i< borrow.length; i++)
                System.out.println(borrow[i]);

        }
    }
}

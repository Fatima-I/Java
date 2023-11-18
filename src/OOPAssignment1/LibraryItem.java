package OOPAssignment1;

public class LibraryItem {;
    private String title;
    private String author;
    private int year;
    boolean isBorrowed;
    LibraryItemType itemType;

LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public boolean isBorrowed() {
        return true;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor() {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    public void setItemType(LibraryItemType itemType) {
        this.itemType = itemType;
    }

    public String toString() {
        String details = String.format("%s\t%s\t%d" , title,author,year);
        return details;
    }
}

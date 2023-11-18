package OOPAssignment1;

public class Book extends LibraryItem {
    private int pageCount;

    Book(String title, String author, int year,int pageCount) {
        super(title,author,year);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}

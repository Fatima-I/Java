package SectionACode;

public abstract class Book
{
    private String ISBN;
    private String title;
    private String author;
    private Status status;

    public Book(String ISBN, String title, String author, Status status) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public Book()
    {

    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setISBN(String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public abstract void ShowDetails();


    @Override
    public boolean equals(Object o)
    {
        Book book = (Book) o;
        return book.getISBN().equals(this.ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}

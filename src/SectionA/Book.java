package SectionA;

import java.util.Objects;

public abstract class Book {
    private String title;
    private String author;
    private String ISBN;
    private Status ava_status;

    Book() {

    }

    public Book(String title, String author, String ISBN, Status ava_status) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.ava_status = ava_status;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Status getAva_status() {
        return ava_status;
    }

    public void setAva_status(Status ava_status) {
        this.ava_status = ava_status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", ava_status=" + ava_status +
                '}';
    }

    public abstract void showDetails();
}

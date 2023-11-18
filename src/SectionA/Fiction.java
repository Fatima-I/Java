package SectionA;

public class Fiction extends Book implements Categorizeable{

    private String genre;

    public Fiction(String title, String author, String ISBN, Status ava_status, String genre) {
        super(title, author, ISBN, ava_status);
        this.genre = genre;
    }

    public void showDetails() {
        System.out.println("Title:  "+getTitle()+"\nAuthor:  "+getAuthor()+"\nISBN:  " +getISBN()+"\nStatus:  "+ getAva_status());
    }

    public void displayCategoryDetails() {
        System.out.println("genre:  " + genre);
    }

    @Override
    public String toString() {
        return "Fiction{" +
                "genre='" + genre + '\'' +
                '}';
    }
}

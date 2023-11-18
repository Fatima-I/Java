package SectionACode;

public class Fiction extends Book implements Caterizable
{
    private String genre;

    public Fiction(String ISBN, String title, String author, String genre)
    {
        super(ISBN, title, author, Status.AVAILABLE);
        this.genre = genre;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }


    public void ShowDetails()
    {
        System.out.println("ISBN: "+getISBN());
        System.out.println("Author: "+getAuthor());
        System.out.println("Title: "+getTitle());
        System.out.println("Status: "+getStatus());
    }

    public void DisplayCategoryDetails()
    {
        System.out.println("Genre: "+genre);
    }

    @Override
    public String toString() {
        return super.toString() + "Fiction{" +
                "genre='" + genre + '\'' +
                '}';
    }
}

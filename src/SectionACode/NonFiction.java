package SectionACode;

public class NonFiction extends Book implements Caterizable
{
    private String subject;

    public NonFiction(String ISBN, String title, String author, String subject)
    {
        super(ISBN, title, author, Status.AVAILABLE);
        this.subject = subject;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
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
        System.out.println("Subject: "+subject);
    }

    @Override
    public String toString() {
        return super.toString() + "NonFiction{" +
                "subject='" + subject + '\'' +
                '}';
    }
}

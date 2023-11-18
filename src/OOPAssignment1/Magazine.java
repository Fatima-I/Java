package OOPAssignment1;

public class Magazine extends LibraryItem{
    int issueNumber;

    Magazine(String title, String author, int year,int issueNumber) {
        super(title, author, year);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}

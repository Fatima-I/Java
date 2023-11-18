package SectionA;

import OOPAssignment1.Library;

public class Main {
    public static void main(String[] args) {
        LibraryManager l = new LibraryManager();
        User u = new User();
        //User u = new User();
        Fiction f1 = new Fiction("a","b","c",Status.AVAILABLE,"d");
        f1.showDetails();
        l.addBook(f1);
        u.addBook(f1);
        l.searchBook("b");
        u.borrowBook(f1);
        l.generateReport();
        //l.returnBook(f1);


    }
}

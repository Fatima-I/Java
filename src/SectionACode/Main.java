package SectionACode;

public class Main
{
    public static void main(String[] args)
    {
        LibraryManager l = new LibraryManager();
        Users u1 = new Users();
        Users u2 = new Users();
        Users[] list = new Users[200];
        list[0] = u1;
        list[1] = u2;
        u1.setUsername("Ali");
        u2.setUsername("Hamza");
        l.setRegisteredUsers(list);

        Book b = new Fiction("01","Raja","Bano","Novel");

       l.AddBook(b);
        l.AddBook(new Fiction("02","Udaas","Hassan","Novel"));
        l.AddBook(new Fiction("03","Peer","Umera","Novel"));

//        u1.books[0] = b;
//        u1.books[1] = new Fiction("02","Udaas","Hassan","Novel");

//        l.DisplayReport();
//        l.RemoveBook(new Fiction("01","Raja","Bano","Novel"));
//        l.DisplayReport();
////        l.SearchBook("03");
        System.out.println(b.getStatus());
        l.BorrowBook(u1,b);
//        l.BorrowBook(u1,b);
        System.out.println(b.getStatus());
        l.ReturnBook(u1,b);
//        l.ReturnBook(u1,b);
        System.out.println(b.getStatus());






    }
}

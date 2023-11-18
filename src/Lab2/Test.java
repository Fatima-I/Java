package Lab2;
public class Test {
    public static void main (String[] args)
    {
        Product p1 = new Product("bag", 500 , 10 , new Date(4,8, 2023));
        Product p2 = new Product("pen", 50 , 20 , new Date(1 , 9 , 2023));
        Product p3 = new Product("eraser" , 10 , 50 , new Date(7 , 2 , 2021) );
        //p1.setName("pouch");
        //p1.setDate(new Date(5 , 2 , 2020));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("The most latest product is");
        //System.out.println(p1.isLatest(p1,p2));
    }

}

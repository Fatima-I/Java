package Outputs;

public class A
{
    int y;
    static void A()
    {
        System.out.println("Class A");
    }
//    public static void main(String[] args)
//    {
//        A a= new A();
//    }
}
class U extends A{
    int x;
    static void A() {

    }
}
class Demo {
    public static void main(String[] args) {
        A a = new U();
        System.out.println(a);
    }
}

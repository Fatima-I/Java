package Outputs;

public class PastPaperTwo {
    public int i;
    private int j;
}
class B extends PastPaperTwo {
    public B() {
        i = 10;
        //super.j = 20;
    }
}
class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
    }
}

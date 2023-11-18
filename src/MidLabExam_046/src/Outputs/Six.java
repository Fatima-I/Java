package Outputs;
class DummySix {  // ik class me ik se zyada classes public nhi ho skti
    static int x = 10;
    private int a = 5;
}

public class Six {
    public static void main(String[] args) {
        //DummySix d = new DummySix();
        // System.out.println(d.a); // can not access as a is private
        // System.out.println(x); // sirf apni class ke static member ko access krskte
        // a is in diff class, so will give error
    }
}

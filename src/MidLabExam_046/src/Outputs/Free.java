package Outputs;
public class Free implements Inter {
    @Override
    public void a() {

    }
    static void fun(){
        System.out.println("hello");
    }
    @Override
    public void e() {

    }

}

class Demos {
    public static void main(String[] args) {

        Inter.fun();
        Free.fun();
    }
}
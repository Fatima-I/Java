package Outputs;

public class Function {
    static int x;
    static int y;
    static void call(int a, int b) {
        x = a + 1;
        y = b;
    }

}

class F{
    public static void main(String[] args) {
        Function f = new Function();
        f.call(2,3);
        System.out.println(f.x + " " + f.y);
    }
}

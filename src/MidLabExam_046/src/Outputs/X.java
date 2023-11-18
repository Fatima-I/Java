package Outputs;

public class X {
    public void method1() {
        System.out.println("a 1");
    }
    public void method2() {
        System.out.println("a 2");
    }
}

class Y extends X {
    public void method1() {
        System.out.println("b 1");
    }
}

class Z extends Y {
    public void method2() {
        System.out.println("c 2");
    }
}

class Tests{
    public static void main(String[]args)
    {
        X[] elements = {new X(),
                new Y(),
                new Z()};

        for (int i = 0; i < elements.length; i++) {
            elements[i].method1();
            elements[i].method2();
        }
    }
}


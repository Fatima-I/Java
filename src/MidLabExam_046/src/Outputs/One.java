package Outputs;

public class One {
    static int x; // to write here, you have to write static then main will access it as
    // main is static and can access static x, as static variable dont depend on object and can
    // be accessed directly. // and also here you dont have to initialize.
    // it is an instance variable
    // by default, instance and static variables me 0 hota in case of integers.
    public static void main(String[] args) {
        int x = 1;  // cant write private,public,protected,static, will get error
        // it is a local variable, so do not have to use static to access
        //also if you will not initialize here, it will give error.
        // as it is a local variable aur ye by default blank hote, so have to initialize.
        System.out.println(x);
    }
}

package Outputs;

public class Three {
    public static void main(String[] args) {

        // float x = 3.5; // can not write like this
        float x = 3.5f; // correct way
        // by default points wale number ko double mana jata, so float x = 3.5 ko double samaj lega so
        // convert krne kelie f lagae ge

        System.out.println(x); // it will not print 3.50000, rather it will print 3.5
    }
}

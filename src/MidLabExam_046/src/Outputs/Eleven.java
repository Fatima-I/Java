package Outputs;

public class Eleven {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        if (s1 == s2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
// output will not equal
// hum ne 2 obj bnae string type ke
// s1 and s2 are referring obj, are not obj
// you are comparing the reference number of s1 and s2
// not a right approach to compare strings
// to compare strings, you can use equals method

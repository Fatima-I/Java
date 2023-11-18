package Outputs;

public class Twelve {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        if (s1 == s2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }
}
// if you make obj without using new keyword, then jab ap dosra obj bnae ge aur us me characters same
// honge tu new obj nhi bnega balke wo (s2) usi pichle obj ko refer krega
// Thats why output equal aega so s1 and s2 ka reference number same hoga
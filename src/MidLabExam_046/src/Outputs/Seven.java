package Outputs;
public class Seven {  // jo bhi class public ho file ka name wohi hona chahye
    // koi bhi class public na ho tu bhi chalta
    // lekin file naam wali class ke ilawa koi public kro tu error aata
    public int a = 10;
}
class DummySeven {
    public static void main(String[] args) {
        Seven d = new Seven();
        System.out.println(d.a);
    }
}

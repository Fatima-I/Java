package Outputs;
abstract class Employee {
    String name ="me";
    public abstract void hire(String who);
    public abstract void fire(String who);
}

class Manager extends Employee {
    public void hire(String who) {
        System.out.println( who + " hired by " + name );
    }

    public void fire(String who) {
        System.out.println( who + " fired by " + name );
    }
}
class ManagerCheck {
    public static void main(String args[]) {
        Manager me = new Manager();
        me.hire("newbie");
        me.fire("nobody");
    }
}


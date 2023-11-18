package TaxiBooking;

import javax.print.attribute.standard.MediaName;

public class Main {
    public static void main(String[] args) {
        Location l1 = new Location(1,2);
        Manager m1 = new Manager();
        m1.list.add(new Taxi(0,new Location(1,2), true, new Location(3,3)));
        m1.list.add(new Taxi(1,new Location(2,3), true, new Location(4,5)));
        m1.list.add(new Taxi(2,new Location(4,0), true, new Location(5,6)));

        String a = m1.findNearestTaxi(l1);
        System.out.println(a);
        double o = m1.findFare(l1);
        System.out.println("The fare for this ride is " +o);

    }
}

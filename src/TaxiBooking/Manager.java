package TaxiBooking;

import java.util.ArrayList;

public class Manager {

    ArrayList<Taxi> list = new ArrayList<>();

    public String findNearestTaxi(Location passenger) {
        String id = " ";
        double max = 100;

        for (int i = 0; i<list.size(); i++) {
            double a = list.get(i).getLocation().getX() - passenger.getX();
            double b = list.get(i).getLocation().getY() - passenger.getY();
            double distance = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            if(distance < max) {
                max = distance;
                id = list.get(i).toString();
            }
        }
        return id;
    }

    public double findFare(Location loc) {
        double fare = 0;
        //double permeter = 100;
        for (int i = 0; i<list.size(); i++) {
            double a = list.get(i).getLocation().getX() - loc.getX();
            double b = list.get(i).getLocation().getY() - loc.getY();
            double distance = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            if(distance != 0) {
                fare = distance*100;
        }
    }
        return fare;
    }

//    public String findTaxi(Location passenger) {
//        String id = " ";
//        double max = 100;
//
//        for (int i = 0; i<list.size(); i++) {

//            double a = list.get(i).getLocation().getX() - passenger.getX();
//            double b = list.get(i).getLocation().getY() - passenger.getY();
//            double distance = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//            if(distance < max) {
//                max = distance;
//                id = list.get(i).toString();
//            }
//        }
//        return id;
//    }

}

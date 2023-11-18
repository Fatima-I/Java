package Lab2;

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        String details = String.format("%d/%d/%d", day, month, year);
        return details;
    }

//    public Date recentDate(Date d1, Date d2)
//    {
//        if (d1.getYear() > d2.getYear()) {
//            return d1;
//            //return d1.getYear()>d2.getYear()?d1:d2;
//        }
//        else if (d1.getYear() == d2.getYear()) {
//            if (d1.getMonth() > d2.getMonth()) {
//                return d1;
//            }
//            //return d1.getMonth() > d2.getMonth() ? d1 : d2;
//        }
//        else if (d1.getMonth() == d2.getMonth()) {
//            if (d1.getDay() > d2.getDay()) {
//                return d1;
//            }
//            //return d1.getDay() > d2.getDay() ? d1 : d2;
//        }
//        else //if (d1.getDay() ==  d2.getDay())
//        {
//            return d2;
//        }
//
//        return null;
//    }
}



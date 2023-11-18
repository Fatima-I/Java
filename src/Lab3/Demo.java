package Lab3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter title");
        String title = sc.nextLine();
        System.out.println("Enter Artist Name");
        String artist = sc.nextLine();
        System.out.println("Enter nationality");
        String nationality = sc.nextLine();
        System.out.println("Enter artist rating");
        double rating = sc.nextDouble();
        //System.out.println("\n");
        
        System.out.println("Enter duration");
        String duration = sc.nextLine();
        System.out.println("Enter genre");
        String genre = sc.nextLine();
        System.out.println("Enter Album name");
        String album = sc.nextLine();
        System.out.println("Enter day");
        int day = sc.nextInt();
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();

        Music m1 = new Music(title,new Artist(artist,nationality,rating),duration,genre,album,new Date(day,month,year));
        System.out.println(m1);

//        Music m1 = new Music("Lost", new Artist("Andrew" , "American" , 4.0), "5 min", "Melody", "Silence", new Date(2, 3, 2022));
//        Music m2 = new Music("Lost", new Artist("Edward" , "African" , 4.5), "4 min", "Pop", "What's next", new Date(12, 5, 2023));
//        Music m3 = new Music("Darkness", new Artist("Mathew" , "Italian" , 4.2), "4.6 min", "Sad", "Life", new Date(17, 8, 2021));
//        Music m4 = new Music("Dynamite", new Artist("Jimin" , "Korean" , 3.9), "4 min", "Kpop", "Blast", new Date(4, 1, 2021));
//        Music m5 = new Music("Fire", new Artist("Smith" , "German" , 4.1), "6 min", "Hip hop", "Blast", new Date(12, 1, 2021));
//        System.out.println("Title\t\tArtist\t\tNationality\t\t\tRating\t\t\tDuration\t\t\tGenre\t\t\tAlbum Name\t\t\tRelease Date");
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);
//
//        if(m1.getTitle().equals(m2.getTitle()))
//            System.out.println("Objects are equal");
//        else
//            System.out.println("Not equal");
    }
}

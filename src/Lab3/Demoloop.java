package Lab3;

public class Demoloop {
    public static void main(String[] args) {
        //int a[] = new int[20];
        Music list[] = new Music[10];
        list[0] =  new Music("Lost", new Artist("Andrew" , "American" , 4.0), "5 min", "Melody", "Silence", new Date(2, 3, 2022));
        list[1] = new Music("Lost", new Artist("Edward" , "African" , 4.5), "4 min", "Pop", "What's next", new Date(12, 5, 2023));
        list[2] = new Music("Darkness", new Artist("Mathew" , "Italian" , 4.2), "4.6 min", "Sad", "Life", new Date(17, 8, 2021));
        list[3] = new Music("Dynamite", new Artist("Jimin" , "Korean" , 3.9), "4 min", "Kpop", "Blast", new Date(4, 1, 2021));
        list[4] = new Music("Fire", new Artist("Smith" , "German" , 4.1), "6 min", "Hip hop", "Blast", new Date(12, 1, 2021));
        System.out.println("Title\t\tArtist\t\tNationality\t\t\tRating\t\t\tDuration\t\t\tGenre\t\t\tAlbum Name\t\t\tRelease Date");
//        list[0] = m1;
//        list[1] = m2; // practice by this way as well(by making simple objects first and then assigning them to the list)
        for(int i=0; i<=4; i++)
        {
            System.out.println(list[i]);
        }
//        if(m1.getTitle().equals(m2.getTitle()))
//            System.out.println("Objects are equal");
//        else
//            System.out.println("Not equal");
    }
}

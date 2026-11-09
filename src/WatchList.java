public class WatchList {
    static void main() {
        // creating string variables
        String topAnime = "NAruto";
        String ogAnime = new String("one pIEce");

        //using inbuilt strings methods
        String topAnimeUpperCase = topAnime.toUpperCase();
        System.out.println(topAnimeUpperCase);

        //using custom method
        System.out.println(makeLowercase(ogAnime));

        //arrays
        String[] watchList = {"jjk", "naruto", "one piece", "demon slayer"};
        String[] recommendedList = new String[3];


        //using an enhanced "for loop" to iterate through the list in watchList
        for(String anime : watchList){
            System.out.print(anime + ", ");
        }

    }

    //create custom method
    static String makeLowercase( String name){
        return name.toLowerCase();
    }
}

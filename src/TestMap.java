import Songs.SongV5;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        /**
         * Map collection
         * keys can be any Java object (and wrapped primitives too)
         * (often it implements like String keys (for property names) or Integer keys (unique IDs)
         * each item in the map is actually two objects - a key and a value
         * duplicated values are allowed, but not the keys
         */

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));

        List<String> songs = new ArrayList<>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        List<String> myList = Collections.unmodifiableList(songs);

        /**
         * Convenience Factory Methods for Collections
         * 1. The resulting collections cannot be changed (even sorting)
         * 2. The resulting collections are not the standard Collections we've seen
         */

        List<String> strings = List.of("somersault", "cassidy", "$10");
        List<SongV5> songList = List.of(
                new SongV5("My way", "Limp Bizkit", 110, "Results may vary"),
                new SongV5("I say by the ocean", "Queens of the Stone Age", 200, "...Like Clockwork"));

        Set<Book> books = Set.of(
                new Book("War and Peace"),
                new Book("Monday begins on a Saturday"));

        Map<String, Integer> scores2 = Map.of(
                "Kathy", 42,
                "Bert",430,
                "Skyler", 120);

        Map<String, String> stores2 = Map.ofEntries(
                Map.entry ("Riley", "Supersports"),
                Map.entry("Brooklyn", "Camera World"));

        // using wildcard ? in method arguments stop a use of adding elements to the list





    }
}

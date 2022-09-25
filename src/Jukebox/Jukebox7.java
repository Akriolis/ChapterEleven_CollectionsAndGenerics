package Jukebox;
import MockSong.*;
import Compare.*;
import Songs.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class Jukebox7 {
    public static void main(String[] args) {
        new Jukebox7().go();

    }

    public void go(){

        List<SongV4> songList = MockSong4.getSongV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        /** Collection API has three main interfaces - List, Set, Map

        List - when sequence matters
        this collection know about index position
        duplicates are okay

        Set - when uniqueness matters
        this collection has no duplicates

        Map - when finding something by key matters
        this collection has key-value pairs
        duplicate values okay, but not duplicate keys

        */

        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        // reference equality and object equality

    }


}

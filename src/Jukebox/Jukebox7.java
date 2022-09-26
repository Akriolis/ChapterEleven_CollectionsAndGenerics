package Jukebox;
import MockSong.*;
import Compare.*;
import Songs.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;

public class Jukebox7 {
    public static void main(String[] args) {
        new Jukebox7().go();

    }

    public void go(){

        List<SongV5> songList = MockSong5.getSongV5();
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

        Set<SongV5> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        // reference equality and object equality

        // two references point the same object
        // if two objects are equal, they have to return the same value form hashCode()

        // two references, two objects
        // need to override both hashCode() and equals()
        // if (x.equals(x1) && x.hashCode() == x1.hashCode()){ // some code }

        /**
         * if two objects are equal, they must have matching has codes
         * if two objects are equal, calling equals() on either object must return true
         * if two objects have the same hash code value, they are not required to be equal
         * but if they are equal, they must have the same hash code value
         * if you override equals(), you must override hashCode()
         *
         */

        // TreeSet
        // uses each object's compareTo() method for the sort

        Set<SongV5> songSet2 = new TreeSet<>(songList);
        System.out.println(songSet2);

        // lambda or Comparator can be passed into TreeSet constructor
        Set<SongV5> songSet3 = new TreeSet<>(((o1, o2) -> o1.getBpm() - o2.getBpm()));
        songSet3.addAll(songList);
        System.out.println(songSet3);

        // lambda implements Comparator


    }


}

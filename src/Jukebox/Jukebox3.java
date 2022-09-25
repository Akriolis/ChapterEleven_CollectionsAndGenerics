package Jukebox;

import java.util.Collections;
import java.util.List;

import Compare.*;
import Songs.*;
import MockSong.*;


public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();

    }

    public void go(){
        // list from static MockSong2 class (SongV3 objects)
        List<SongV3> songList = MockSong2.getSongV2();
        System.out.println(songList);

        // SongV3 class implements compareTo method from Comparable
        Collections.sort(songList);
        // sorted by artist - in SongV3 toString() overwritten to return artist
        System.out.println(songList);

        // list from static MockSong3 class (SongV3 objects)
        List<SongV2> songList2 = MockSong3.getSongV2();
        // class ArtistCompare implements Comparator
        ArtistCompare artistCompare = new ArtistCompare();
        //songList2.sort(artistCompare);
        // sorted by title - in SongV2 toString() overwritten to return title
        System.out.println(songList2);





    }


}

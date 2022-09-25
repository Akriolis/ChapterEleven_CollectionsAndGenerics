package Jukebox;

import MockSong.*;
import Compare.*;
import Songs.*;
import java.util.Collections;
import java.util.List;


public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();

    }

    public void go(){
        List<SongV3> songList = MockSong2.getSongV2();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }





}

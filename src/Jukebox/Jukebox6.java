package Jukebox;
import MockSong.*;
import Compare.*;
import Songs.*;

import java.util.List;


public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();

    }

    public void go(){

        List<SongV4> songList = MockSong4.getSongV4();
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getTitle() + " ");
        }

        System.out.println();

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getTitle() + " ");
        }

        System.out.println();

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getArtist() + " ");
        }

        System.out.println();

        songList.sort((one,two) -> one.getAlbum().compareTo(two.getAlbum()));
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getAlbum() + " ");
        }

        System.out.println();

        // sorting by BPM
        // according to official documentation
        // compare returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
        // so we get one's BPM and subtract two's PBM from it
        songList.sort((one,two) -> one.getBpm() - two.getBpm()) ;
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getBpm() + " ");
        }

        System.out.println();

        //same sorting, but in reverse
        songList.sort((one,two) -> two.getBpm() - one.getBpm()) ;
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getBpm() + " ");
        }

        System.out.println();

        //reverse sorting for title

        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getTitle() + " ");
        }

        System.out.println();


    }


}

package Jukebox;

import MockSong.*;
import Compare.*;
import Songs.*;
import java.util.Comparator;
import java.util.List;


public class Jukebox5 {
    public static void main(String[] args) {
        new Jukebox5().go();

    }

    public void go(){

        List<SongV4> songList = MockSong4.getSongV4();

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);

        for (int x = 0; x < songList.size(); x++){
            System.out.print(songList.get(x).getTitle() + " ");
        }

        System.out.println();

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);

        for (int x = 0; x < songList.size(); x++) {
            System.out.print(songList.get(x).getArtist() + " ");
        }
        System.out.println();


        // anonymous comparator
        songList.sort(new Comparator<SongV4>() {
            @Override
            public int compare(SongV4 o1, SongV4 o2) {
                return o1.getAlbum().compareTo(o2.getAlbum());
            }
        });

        for (int x = 0; x < songList.size(); x++) {
            System.out.print(songList.get(x).getAlbum() + " ");
        }
        System.out.println();

        // lambda to a rescue!

        songList.sort((o1, o2) -> o1.getAlbum().compareTo(o2.getAlbum()));

        // some interfaces have to implement only a single abstract method (SAM)
        // SAM interfaces or Functional Interfaces



    }


}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Jukebox5 {
    public static void main(String[] args) {
        new Jukebox5().go();

    }

    public void go(){

        List<SongV4> songList = MockSong4.getSongV2();

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


    }


}

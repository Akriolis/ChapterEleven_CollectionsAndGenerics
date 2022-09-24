import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();

    }

    public void go(){

        List<SongV3> songList = MockSong2.getSongV2();
        System.out.println(songList);


        Collections.sort(songList);

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

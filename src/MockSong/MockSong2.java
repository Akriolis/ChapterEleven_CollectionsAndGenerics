package MockSong;
import Songs.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockSong2 {

    public static List<SongV3> getSongV2(){
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("Cassidy", "grateful dead", 158));
        songs.add(new SongV3("30 seconds to Mars", "30 seconds to Mars", 102 ));
        return songs;
    }




}

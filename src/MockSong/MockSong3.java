package MockSong;

import Songs.*;

import java.util.ArrayList;
import java.util.List;

public class MockSong3 {

    public static List<SongV2> getSongV2(){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));
        songs.add(new SongV2("havana", "cabello", 105));
        songs.add(new SongV2("Cassidy", "grateful dead", 158));
        songs.add(new SongV2("30 seconds to Mars", "30 seconds to Mars", 102 ));
        return songs;
    }




}

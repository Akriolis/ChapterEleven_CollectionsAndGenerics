package MockSong;

import Compare.*;
import Songs.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MockSong4 {

    public static List<SongV4> getSongV4(){
        List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("somersault", "zero 7", 147, "When It Falls"));
        songs.add(new SongV4("cassidy", "grateful dead", 158, "reckoning"));
        songs.add(new SongV4("$10", "hitchhiker", 140, "$10"));
        songs.add(new SongV4("havana", "cabello", 105, "Camila"));
        songs.add(new SongV4("cassidy", "grateful dead", 158, "Reckoning"));
        songs.add(new SongV4("30 seconds to Mars", "30 seconds to Mars", 102, "30 seconds to Mars"));
        return songs;
    }




}

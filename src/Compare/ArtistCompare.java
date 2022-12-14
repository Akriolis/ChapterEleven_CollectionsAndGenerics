package Compare;

import Songs.SongV4;

import java.util.Comparator;

public class ArtistCompare implements Comparator <SongV4> {
    @Override
    public int compare(SongV4 o1, SongV4 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }

}

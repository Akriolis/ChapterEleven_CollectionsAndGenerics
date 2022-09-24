import java.util.Comparator;

class ArtistCompare implements Comparator <SongV4> {
    @Override
    public int compare(SongV4 o1, SongV4 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }

}

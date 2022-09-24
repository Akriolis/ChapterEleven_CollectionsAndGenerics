import java.util.Comparator;

public class TitleCompare implements Comparator <SongV4> {
    @Override
    public int compare(SongV4 o1, SongV4 o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

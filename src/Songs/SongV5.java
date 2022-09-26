package Songs;

public class SongV5 implements Comparable<SongV5>{
    private String title;
    private String artist;
    private int bpm;
    private String album;

    @Override
    public boolean equals(Object aSong) {
        SongV5 other = (SongV5) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public int compareTo(SongV5 o) {
        return title.compareTo(o.getTitle());
    }

    public SongV5(String title, String artist, int bpm, String album){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
        this.album = album;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return title;
    }
}

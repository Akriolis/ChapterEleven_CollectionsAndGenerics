package Songs;

public class SongV4{
    private String title;
    private String artist;
    private int bpm;

    private String album;

    public SongV4(String title, String artist, int bpm, String album){
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

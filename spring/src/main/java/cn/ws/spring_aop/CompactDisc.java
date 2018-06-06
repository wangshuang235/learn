package cn.ws.spring_aop;

import java.util.List;

/*
 * @Author: cool
 * @Date: 2018/6/4 17:49
 */
public class CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public void playTrack(int trackNumber) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}

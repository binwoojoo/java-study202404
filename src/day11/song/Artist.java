package day11.song;

import java.util.HashSet;
import java.util.Set;

// 1개의 가수 정보
public class Artist {

    private String artistName; // 가수명
    private Set<String> songList; // 노래목록

    // 생성자

    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>();
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    public void addSong(String songName) {

    }
}


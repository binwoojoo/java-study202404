package day10.inter.quiz;

import java.util.Arrays;

public class MediaPlayer {

    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        // 주어진 media를 mediaList배열에 추가
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
//        MediaPlayable[] temp
//                = Arrays.copyOf(mediaList, mediaList.length + 1); // 배열 복사
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[temp.length - 1] = media;
        mediaList = temp;
        temp = null;
    }

    public void playAll() {
        // 반복문을 통해 mediaList에 있는 모든 미디어들을 재생시킴
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.play();
        }
    }

    public void pauseAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.pause();
        }
    }

    public void stopAll() {
        for (MediaPlayable mediaPlayable : mediaList) {
            mediaPlayable.stop();
        }
    }
}

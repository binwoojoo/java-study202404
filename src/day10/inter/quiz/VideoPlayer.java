package day10.inter.quiz;

public class VideoPlayer implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("비디오를 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("비디오 재생을 중지합니다");
    }

    @Override
    public void stop() {
        System.out.println("비디오 재생을 종료합니다");
    }
}

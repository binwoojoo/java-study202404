package day10.inter.quiz;

public class ImageDisplay implements MediaPlayable{
    @Override
    public void play() {
        System.out.println("이미지를 재생합니다");
    }

    @Override
    public void pause() {
        System.out.println("이미지 재생을 중지합니다");
    }

    @Override
    public void stop() {
        System.out.println("이미지 재생을 종료합니다");
    }
}

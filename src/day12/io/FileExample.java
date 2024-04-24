package day12.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 기본 경로
    public final static String ROOT_PATH = "E:";

    public static void main(String[] args) {

        File directory = new File(ROOT_PATH + "hello2");

        // 폴더 생성
        if (!directory.exists()) directory.mkdir();

        File newFile = new File(ROOT_PATH + "zzz.txt");

        if (!newFile.exists()) {
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성에 실패했습니다");
            }

        }
    }
}

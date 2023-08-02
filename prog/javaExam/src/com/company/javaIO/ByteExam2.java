package com.company.javaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try{
            // 이 파일을 복사하여
            fileInputStream = new FileInputStream("src/com/company/javaIO/ByteExam1");
            // 이 파일에 저장하는 방법입니다.
            fileOutputStream = new FileOutputStream("byte.txt");
            //음수일 경우 맨 끝자리인 1을 봔환 읽어드릴 코드가 있다면 무조건 양수 반환
            int readData = -1;
            while ((readData = fileInputStream.read()) != -1){
                fileOutputStream.write(readData);

            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

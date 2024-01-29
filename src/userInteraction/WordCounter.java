package userInteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        int wordCounter = 0;
        try {
            File myFile = new File("Vancouver.txt");
            Scanner myScan = new Scanner(myFile);
            while (myScan.hasNextLine()){
                String line = myScan.nextLine();
                wordCounter += line.split(" ").length;
            }
            System.out.printf("이 파일에는 %d 개의 단어가 있습니다.", wordCounter);

        } catch (FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
            System.out.printf("그없");

        }
    }
}

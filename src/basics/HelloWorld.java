package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HelloWorld {
    static Scanner myScanner = null;
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        int num = getInput();
        System.out.printf("당신의 나이는 %d 살 입니다", num);
    }

    public static int getInput(){
        myScanner = new Scanner(System.in);

        int num = 0;
        System.out.println("나이를 입력하세요");

        try {
            num = myScanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("에러");
            System.out.println(e);
            myScanner = new Scanner(System.in);
        }

        return num;
    }
}

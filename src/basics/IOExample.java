package basics;

import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String str = myScanner.nextLine();
        if (str.equals("en")) {
            System.out.println("Hello");
        } else if (str.equals("ko")) {
            System.out.println("안녕");
        }
    }
}

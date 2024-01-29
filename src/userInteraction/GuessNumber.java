package userInteraction;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int magicnum = (int) (Math.random() * 100 + 1);
        boolean co = true;
        System.out.println("1~100 중에 랜덤한 숫자가 만들어 졌습니다.");
        Scanner myScanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--){
            System.out.println("뭘까요?");
            int input = myScanner.nextInt();
            if (magicnum == input){
                System.out.println("맞아용");
                co = false;
                break;
            } else if (magicnum < input) {
                System.out.println(input + "는 답보다 커용");
                System.out.println(i + "번 남았읍니다.");
            } else {
                System.out.println(input + "는 답보다 작아용");
                System.out.println(i + "번 남았읍니다.");
            }
        }
        if (co) {
            System.out.println("허~접" + magicnum + "이거 지롱");
        }

    }
}

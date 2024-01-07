package basics;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        int age = 0;
//        age = getInput();
        if (age > 19){
            System.out.println("당신은 술을 마실수 있습니다.");
        } else if (15 < age && age <= 19) {
            System.out.println("당신은 청소년 영화를 볼 수 있습니다.");
        } else if (age <= 15) {
            System.out.println("응애네요");
        }

        int sell = 500_000;
        switch (sell){
            case 1000_000:
                System.out.println("이정도면 충분한가요?");
                break;
            case 500_000:
                System.out.println("당신은 주니어 개발자입니다");
                break;
            case 300_000:
                System.out.println("당신은 인턴입니다.");
                break;
        }
    }
    public static int getInput() {
        Scanner mS = new Scanner(System.in);
        int age = mS.nextInt();
        return age;
    }

}

package finalStatic;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        int max = Math.max(10, 20);
        System.out.println(max);

        Math m1 = new Math("캐나다");
        Math m2 = new Math("미국");
//        Math.PI = 20;
        // 앞서 final로 선언해둔 변수이기 때문에 변환이 불가함

        System.out.println(m1.name);
        System.out.println(m2.name);

        System.out.println(Math.PI);
        System.out.println(m1.PI);
        System.out.println(m2.PI);
        m1.PI = 30;
        System.out.println(m1.PI);
        System.out.println(m2.PI);
        System.out.println();
    }

    // 매인함수가 스태틱인 이유는 프로그램의 시작점이기 때문
    // 메인함수가 스태틱이 아니라면 매인함수가 포함된 클래스가 먼저 객체화 되어야 하나 이는 불가능함
    // 시작점이 실행되는 지점인데 시작전에 객체화는 불가능하기 때문
}

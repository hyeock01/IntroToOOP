package basics;

public class StaticMethods {

    //static 객채들은 어디서든 자유롭게 불러오기가 가능
    //그 외의 함수들은 어디서든 불러올 때 해당 클래스를 먼저 객체화 필요
    public static void main(String[] args) {
        StaticMethods myStaticMethods = new StaticMethods();
        myStaticMethods.printCity("Tokyo");
//        swap();
//        changeFirst();
//        printCity
        printName("dongjin");
    }
    //값 전달 원시타입
    public static void swap(int a, int b) {
        int num = a;
        a = b;
        b = num;
    }

    //레퍼런스 전달 객체타입
    public static void changeFirst(int[] arr){
        arr[0] = 100;
    }

    public void printCity(String city){
        System.out.println("hello, " + city);
    }

    //public;매소드가 클래스외부에서 불릴 수 있음
    //static;매소드가 객체를 생성하지 않고 불릴 수 있음을 의미
    //void;함수가 리턴타입이 없음을 의미
    public static void printName(String name){
        System.out.println("hello, " + name);
    }

}

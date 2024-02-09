package finalStatic;

public class TimeClient {
    public static void main(String[] args) {
        Time t1 = new Time(23);
        Time t2 = new Time(9, 11, 23);
        Time t3 = new Time(23, 2, 5);
        Time t4 = new Time(22, 10);
        Time t5 = new Time();

        Time[] times = {t1,t2, t3, t4, t5};

        for(Time t:times){
            System.out.println(t.toStandardForm());
            System.out.println(t.toUniversalForm());
        }

        System.out.println(String.format("시간오브젝트 %d개를 만들었습니다.",Time.instanecCount));
    }
}

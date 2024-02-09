package finalStatic;

public class Validation {
    static void checkHour(int hour){
        if (0 > hour || hour >23){
            throw new IllegalArgumentException("시간은 0과 23 사이의 값만 가능합니다.");
        }
    }
    static void checkMinute(int minute){
        if (0 > minute || minute > 59){
            throw new IllegalArgumentException("분은 0부터 59 사이의 값만 가능합니다.");
        }
    }
    static void checkSecond(int second){
        if (0 > second || second > 59){
            throw new IllegalArgumentException("초는 0부터 59 사이의 값만 가능합니다.");
        }
    }
}

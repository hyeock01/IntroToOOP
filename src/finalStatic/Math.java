package finalStatic;

public class Math {
    public static double PI = 3.1415926;
    public String name;

    public Math(String name) {
        this.name = name;
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }


}

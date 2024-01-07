package basics;

public class StringExample {
    public static void main(String[] args) {
        String name = "Richard";
        String name1 = "Richard";
        String name2 = new String("Richard");
        String name3 = new String("Richard");

        System.out.println(name == name1);
        System.out.println(name2 == name3);
    }
}

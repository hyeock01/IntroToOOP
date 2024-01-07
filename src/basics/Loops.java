package basics;

public class Loops {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
//        System.out.println(arr);

//            for i in range(len(arr))
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int o = 0; o < i + 1; o++) {
                System.out.print("*");
            }
            for (int o = 0; o < i; o++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < 9; i++) {
            for (int o = 0; o < i + 1; o++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 9 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 8 - i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }

//        while (true){
//      }

    }
}

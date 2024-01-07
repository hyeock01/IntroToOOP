package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr.length);
        System.out.println(arr[4]);
        arr[4] = 10;
        System.out.println(arr[4]);

        int[] arr2 = new int[100000];
        System.out.println(arr2); // 리스트만 적으면 메모리 주소를 출력
        System.out.println(Arrays.toString(arr));

        String[] arrstr = {"qwer", "asdf"};
        arrstr[0] = "뻐규";
        System.out.println(Arrays.toString(arrstr));
    }

}

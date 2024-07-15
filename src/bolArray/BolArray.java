package bolArray;

import java.util.ArrayList;
import java.util.List;

public class BolArray {


        public static List<Boolean> badBoy(int[] arr) {
            List<Boolean> result = new ArrayList<>();
            for (int num : arr) {
                result.add(num % 2 != 0);
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 8, 8, 8, 2, 9};
            List<Boolean> output = badBoy(arr);
            System.out.println(output);
        }

}


//public static boolean[] badBoy(int[] arr) {
//    boolean[] result = new boolean[arr.length];
//    for (int i = 0; i < arr.length; i++) {
//        result[i] = arr[i] % 2 != 0;
//    }
//    return result;
//}



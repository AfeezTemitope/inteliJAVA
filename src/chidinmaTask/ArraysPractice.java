package chidinmaTask;

import java.util.Scanner;
import java.util.Arrays;
public class ArraysPractice{

    public static void main(String [] args){

        int [] numbers = {1,2,3,4,5,6,7,8,9};
        boolean[] result = evenOdd(numbers);
        System.out.println(Arrays.toString(result));


    }

    public static boolean[] evenOdd(int[] array) {
        boolean[] results = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                results[i] = true;
            } else {
                results[i] = false;
            }
        }
        return results;
    }



}

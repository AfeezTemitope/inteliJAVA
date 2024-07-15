package chidinmaTask;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};
        boolean result = evenOdd(numbers);


    }

    public static boolean evenOdd(int[] chi) {
        for (int counter = 0; counter < chi.length; counter++) {
            return chi[counter] % 2 == 0;

        } return true;


    }
}
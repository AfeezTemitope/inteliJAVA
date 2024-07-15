package chidinmaTask;

public class Reverse{
    public static void main(String[]args){

        int[] numbers = {1, 2, 3, 4, 5};
        printNumbersInReverse(numbers);

        int num = 5;
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);

    }
    public static void printNumbersInReverse(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}












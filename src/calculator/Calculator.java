package calculator;

public class Calculator {
    public int add(float... numbers) {
        int sum = 0;
        for (float number : numbers) {
            sum += (int) number;
        }
        return sum;
    }


}

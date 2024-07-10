import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.4, -2.5, 4.1, 6.1, 7.4, -1.8, 8.1, 7.4, -5.9, 7.5, -6.2, 4.6, 9.9, -8.3};

        double average = 0.0;

        int count = 0;

        for (int a1 = 0; a1 < numbers.length; a1++) {


            if (numbers[a1] < 0) {

                for (int a2 = a1 + 1; a2 < numbers.length; a2++) {

                    if (numbers[a2] > 0) {
                        average = average + numbers[a2];

                        count++;

                    }

                }

                break;

            }

        }

        System.out.println("сумма положительных чисел(после отриц. числа): " + average);


        System.out.println("количество положительных чисел(после отриц. числа): " + count);


        System.out.println("среднее арифм. значения положительных чисел(после отриц. числа): " + average / count);

    }



}

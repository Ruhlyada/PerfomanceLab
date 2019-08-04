import java.io.IOException;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class task1 { //Заранее пардоньте за работу с типом double ,
    // к несчастью у меня не получилось придти к нужным результатам с short
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        double perc = perc(array);
        double med = med(array);
        double max = max(array);
        double min = min(array);
        double mid = mid(array);
        System.out.println(String.format("%.2f", perc) + "\n");
        System.out.println(String.format("%.2f", med) + "\n");
        System.out.println(String.format("%.2f", max) + "\n");
        System.out.println(String.format("%.2f", min) + "\n");
        System.out.println(String.format("%.2f", mid) + "\n");
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());

        }

        return numbers;
    }


    public static double perc(int[] array) {
        Arrays.sort(array);
        double perc1 = array[array.length / 2];

        double perc2 = array[array.length * 9 / 10];
        double perc3 = array[array.length * 99 / 100];
        double perc = ((((array[array.length / 2] + array[array.length * 9 / 10] + array[array.length * 99 / 100]) / 3) * 0.9 + 1.0));
        return perc;
    }

    public static double med(int[] array) {
        Arrays.sort(array);
        double med;
        if (array.length % 2 == 0)
            med = ((array[array.length / 2]) + (array[array.length / 2 - 1])) / 2;
        else
            med = array[array.length / 2];
        return med;
    }

    public static double max(int[] array) {
        double max = array[0];
        for (int x = 1; x < array.length; x++) max = Math.max(max, array[x]);
        return max;
    }

    public static double min(int[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static double mid(int[] array) {
        double mid = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            mid = (double) (sum / array.length);
        }
        return mid;
    }
}



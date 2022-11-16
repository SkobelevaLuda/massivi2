import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] wastesOfDay = generateRandomArray();

        for (int i = 0; i <= wastesOfDay.length - 1; i++) {
            System.out.println(i + " " + wastesOfDay[i]);

        }
        //min
        int min = wastesOfDay[0];
        for (int i = 0; i < wastesOfDay.length; i++) {
            if (min > wastesOfDay[i]) {
                min = wastesOfDay[i];

            }
        }
        System.out.println(" Минимальная сумма трат за день составила " + min + " рублей ");

        //max
        int max = wastesOfDay[0];
        for (int i = 0; i < wastesOfDay.length; i++) {
            if (max < wastesOfDay[i]) {
                max = wastesOfDay[i];

            }
        }
        System.out.println(" Максимальная сумма трат за день составила " + max + " рублей ");

    }

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10_000) + 10_000;
        }
        return arr;

    }

}

















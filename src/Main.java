
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задача 1");
        System.out.println("Целочисленный массив");
        int[] arrays = new int[]{1, 2, 3};
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;
        int firstArray = arrays[0];
        System.out.println(firstArray);
        int secondArray = arrays[1];
        System.out.println(secondArray);
        int thirdArray = arrays[2];
        System.out.println(thirdArray);
        System.out.println("Дробные числа");
        float[] fractionalNubers = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < fractionalNubers.length; i++) {
            fractionalNubers[0] = 1.57f;
            fractionalNubers[1] = 7.654f;
            fractionalNubers[2] = 9.986f;

            System.out.println(fractionalNubers[i]);
        }
        System.out.println("Произвольный массив");
        float[] dollars = new float[]{1.2f, 1.44f, 5.444f};
        for (int i = 0; i < dollars.length; i++) {
            dollars[i] = i + 1;
            System.out.println(dollars[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] dollars = new int[]{5000, 6000, 5, 7};
        for (int i = 0; i < dollars.length; i++) {
            if (i == dollars.length - 1) {
                System.out.println(dollars[i]);
                break;
            }
            System.out.print(dollars[i] + "," + " ");
        }
        int[] sums = {1, 2, 3, 4};
        for (int i = 0; i < sums.length; i++) {
            if (i == sums.length - 1) {
                System.out.println(sums[i]);
                break;
            }
            System.out.print(sums[i] + "," + " ");
        }
        float[] tenge = new float[]{1.00f, 2.99f, 3.0f, 193.32f};
        for (int i = 0; i < tenge.length; i++) {
            if (i == tenge.length - 1) {
                System.out.println(tenge[i]);
                break;
            }
            System.out.print(tenge[i] + "," + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        float[] tenge = new float[]{1.00f, 2.99f, 3.0f, 193.32f};
        for (int i = 5; i > tenge.length; i--) {
            System.out.println(tenge[3] + "," + " " + tenge[2] + "," + " " + tenge[1] + "," + " " + tenge[0]);
        }
        int[] sums = {1, 2, 3, 4};
        for (int i = 5; i > sums.length; i--) {
            System.out.println(sums[3] + "," + " " + sums[2] + "," + " " + sums[1] + "," + " " + sums[0]);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[]{1, 2, 35, 4, 19};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 && arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
                System.out.println(arr[i]);
                break;
            }
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
            System.out.print(arr[i] + "," + " ");
        }
    }

}
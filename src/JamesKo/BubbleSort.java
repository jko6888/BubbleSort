package JamesKo;

public class BubbleSort {
    public static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void bubbleSort(int[] num) {

        for (int a = 0; a < num.length; a++) {
            for (int b = 0; b < num.length - a - 1; b++) {
                if (num[b] > num[b + 1]) {
                    swap(num, b, b + 1);
                }
            }
        }

    }

    public static int[] randomNum(int count) {
        int[] num = new int[count];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10000);
        }
        return num;
    }
}
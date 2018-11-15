package JamesKo;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] num = BubbleSort.randomNum(10);
        System.out.println(Arrays.toString(num));
        BubbleSort.bubbleSort(num);
        System.out.println(Arrays.toString(num));

    }
}
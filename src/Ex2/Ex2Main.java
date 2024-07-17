package Ex2;

public class Ex2Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int i;

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
        }
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

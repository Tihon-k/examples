package Ex7;

public class Ex7main {
    public static void main(String[] args) {

        var sorted = new int[1000000];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = i * 10;
        }

        int b = foo(sorted, 10);
        System.out.println(b);
    }

    private static int foo(int[] sorted, int element) {
        int left = 0;
        int right = sorted.length;
        int middle;

        while (left <= right) {
            middle = (right + left) / 2;
            int current = sorted[middle];
            if (current < element) {
                left = middle + 1;
            } else if (current > element) {
                right = middle - 1;
            } else if (element == current) {
                return current;
            }
        }
        return -1;
    }
}


package Ex4;


import java.util.Random;

public class Ex4Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[9];
        int num = rand.nextInt(10);
        int i;
        System.out.println("Num=" + num);

        for (i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");

            if (array[i] == num) {
                    array[i] = array[i + 1];
                    array[i + 1] = num;
                    System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

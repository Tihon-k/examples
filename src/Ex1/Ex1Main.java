package Ex1;

import java.util.Arrays;

public class Ex1Main {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        double avgsum = 0;
        for (int i = 0; i<array.length;i++){
            if (max<array[i]){
                max = array[i];
            }
            if (min>array[i]){
                min = array[i];
            }
            if (i<array.length){
                avgsum=avgsum+array[i];
            }
            avg=avgsum/array.length;
        }
        System.out.println("максимум=" +max);
        System.out.println("минимум=" +min);
        System.out.println("среднее=" +avg);
    }

}


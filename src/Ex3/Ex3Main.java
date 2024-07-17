package Ex3;

public class Ex3Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean num = true;
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    num = false;
                    break;
                }
            if (num = true) {
                System.out.println(i);
            }
        }
    }
}

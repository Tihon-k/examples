package Ex6;

public class Ex6Main {

    int[] name={1,2,3};
    int[] heavy = {1,2,10};

    public Ex6Main(int[] name, int[] heavy) {
        this.name = name;
        this.heavy = heavy;
    }

    public static void main(String[] args) {

        for (int i = 0; i<13; i++){
            int n = (int) (Math.random()*10);
            if (n<1){

                System.out.println();
            }
        }
    }
}

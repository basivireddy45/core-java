package loopsAndConditions;

public class loops {
    public static void main(String[] args) {

        int[] a = {11, 33, 55, 77, 88, 99, 22, 44, 66, 0};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }


        for (int i : a) {
            System.out.println(i);
        }


        for (int i = 100; i > 0; i = i - 4) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }
}

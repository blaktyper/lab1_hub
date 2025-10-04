import java.util.Random;
public class  Lab11 {
     static final int long_array1 = 8;
     static final int long_array2 = 19;
     static final int columes_array3 = 19;
     static final int rows_array3 = 8;

    static int[] first_task() {
        int[] w = new int[long_array1];
        int value = 19;
        for (int i = 0; i < w.length; i++) {
            w[i] = value;
            value = value - 2;
        }
        return w;
    }

     static float[] second_task() {
        float[] x = new float[long_array2];
        Random rand = new Random();
        for (int i = 0; i < long_array2; i++) {
            x[i] = -5 + rand.nextFloat() * 16;
        }
        return x;
    }

     static double[][] third_task(int[] w, float[] x) {
        double[][] n = new double[rows_array3][columes_array3];
        for (int i = 0; i < rows_array3; i++) {
            for (int j = 0; j < columes_array3; j++) {
                n[i][j] = calculate1(w[i], x[j]);
            }
        }
        return n;
    }

    static double calculate1(int wValue, float xValue) {
        if (wValue == 19) {
            return Math.cos(Math.exp(Math.atan((xValue + 3) / 16.0)));
        }
        if (wValue == 7 || wValue == 9 || wValue == 11 || wValue == 17) {
            double numerator = 4 - Math.asin(Math.pow((xValue + 3) / 16.0, 2));
            double denominator = 0.5 * (0.25 + Math.atan((xValue + 3) / 16.0));
            return Math.pow(numerator / Math.pow(denominator, 3), 3);
        }
        double number = Math.asin(1 / Math.exp(Math.abs(xValue))) / 2.0;
        double number1 = 0.5 / Math.pow(number, 3);
        double degree = Math.asin(1.0 / Math.pow(Math.E,
                Math.sin(Math.atan((xValue + 3) / 16.0))));
        return Math.pow(number1, degree);
    }



    static void printarray1(int[] w) {
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }

    static void printarray2(float[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%.5f ", x[i]);
        }
        System.out.println();
    }

    static void printarray3(double[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.printf("%20.5f ", n[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] w = first_task();
        float[] x = second_task();
        double[][] n = third_task(w, x);
        System.out.println("Массив w:");
        printarray1(w);

        System.out.println("Массив x:");
        printarray2(x);

        System.out.println("Массив n:");
        printarray3(n);
    }
}


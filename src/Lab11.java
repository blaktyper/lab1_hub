import java.util.Random;
public class  Lab11 {
    static final int LONG_ARRAY1 = 8;
    static final int LONG_ARRAY2 = 19;
    static final int COLUMES_ARRAY3 = 19;
    static final int ROWS_ARRAY3 = 8;

    static int[] first_task() {
        int[] arrayW = new int[LONG_ARRAY1];
        int currentValue = 19;
        for (int i = 0; i < arrayW.length; i++) {
            arrayW[i] = currentValue;
            currentValue = currentValue - 2;
        }
        return arrayW;
    }

    static float[] second_task() {
        float[] arrayX = new float[LONG_ARRAY2];
        Random random = new Random();
        for (int i = 0; i < LONG_ARRAY2; i++) {
            arrayX[i] = -5 + random.nextFloat() * 16;
        }
        return arrayX;
    }

    static double[][] third_task(int[] arrayW, float[] arrayX) {
        double[][] arrayN = new double[ROWS_ARRAY3][COLUMES_ARRAY3];
        for (int i = 0; i < ROWS_ARRAY3; i++) {
            for (int j = 0; j < COLUMES_ARRAY3; j++) {
                arrayN[i][j] = calculate1(arrayW[i], arrayX[j]);
            }
        }
        return arrayN;
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

    static void printarray1(int[] arrayW) {
        for (int i = 0; i < arrayW.length; i++) {
            System.out.print(arrayW[i] + " ");
        }
        System.out.println();
    }

    static void printarray2(float[] arrayX) {
        for (int i = 0; i < arrayX.length; i++) {
            System.out.printf("%.5f ", arrayX[i]);
        }
        System.out.println();
    }

    static void printarray3(double[][] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN[i].length; j++) {
                System.out.printf("%19.5f ", arrayN[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arrayW = first_task();
        float[] arrayX = second_task();
        double[][] arrayN = third_task(arrayW, arrayX);
        System.out.println("Массив w:");
        printarray1(arrayW);

        System.out.println("Массив x:");
        printarray2(arrayX);

        System.out.println("Массив n:");
        printarray3(arrayN);
    }
}


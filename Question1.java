public class MergeArrays {
    public static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;


        int lastX = n - 1;
        int lastY = n - 1;


        int mergeIndex = m - 1;


        while (lastY >= 0) {

            if (lastX >= 0 && X[lastX] > Y[lastY]) {
                X[mergeIndex] = X[lastX];
                lastX--;
            } else {
                X[mergeIndex] = Y[lastY];
                lastY--;
            }
            mergeIndex--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        System.out.println("Input X: " + Arrays.toString(X));
        System.out.println("Input Y: " + Arrays.toString(Y));
        merge(X, Y);
        System.out.println("Merged X: " + Arrays.toString(X));
    }
}

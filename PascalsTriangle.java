public class PascalsTriangle {
    public static void pascalTriangleI(int r, int c) {
        int n = r - 1;
        int k = c - 1;

        int result = 1;

        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        pascalTriangleI(4, 2);
    }
}
public class Fibonacci {

    public static int fibonacciIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido. Insira um número >= 0.");
        }
        if (n <= 1) {
            return n;
        }
        
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}

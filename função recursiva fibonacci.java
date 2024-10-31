public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido. Insira um número >= 0.");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

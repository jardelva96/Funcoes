// Importa as bibliotecas necessárias
import java.util.ArrayList; // Biblioteca para a classe ArrayList, que armazena listas dinâmicas
import java.util.List; // Interface List, que define uma lista de elementos

public class PrimeNumbers {

    // Método principal que recebe um número e retorna uma lista de números primos até N
    public static List<Integer> getPrimesRecursive(int n) {
        if (n <= 1) // Validação para garantir que N > 1
            throw new IllegalArgumentException("Número inválido. Insira um número > 1.");
        
        // Chama a função recursiva auxiliar para encontrar os números primos
        return findPrimesRecursive(n, new ArrayList<>()); // Passa uma nova lista vazia para armazenar primos
    }

    // Função recursiva auxiliar que verifica e adiciona números primos à lista
    private static List<Integer> findPrimesRecursive(int n, List<Integer> primes) {
        if (n < 2) // Caso base: se N < 2, retorna a lista de primos encontrada
            return primes;
        
        if (isPrime(n)) // Verifica se o número atual é primo
            primes.add(0, n); // Adiciona o número na posição inicial da lista para manter a ordem crescente
        
        // Chama a função recursivamente com N-1
        return findPrimesRecursive(n - 1, primes);
    }

    // Função auxiliar para verificar se um número é primo
    private static boolean isPrime(int num) {
        // Laço para verificar divisores até a raiz quadrada do número, otimizando a verificação
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) // Se o número é divisível por i, não é primo
                return false;
        }
        return true; // Retorna verdadeiro se nenhum divisor foi encontrado, ou seja, é primo
    }
}

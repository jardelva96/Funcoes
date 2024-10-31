// Importa as bibliotecas necessárias
import java.util.ArrayList; // Biblioteca para a classe ArrayList, que armazena listas dinâmicas
import java.util.List; // Interface List, que define uma lista de elementos

public class PrimeNumbers {

    // Método principal que usa um laço para encontrar todos os números primos até N
    public static List<Integer> getPrimesIterative(int n) {
        if (n <= 1) // Valida que o número é maior que 1
            throw new IllegalArgumentException("Número inválido. Insira um número > 1.");
        
        List<Integer> primes = new ArrayList<>(); // Cria uma lista para armazenar os números primos
        
        // Laço que percorre todos os números de 2 até N
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) // Verifica se o número atual é primo
                primes.add(i); // Adiciona o número primo à lista
        }
        
        return primes; // Retorna a lista com todos os números primos encontrados
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

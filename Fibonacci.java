package Ex2;

import java.util.Objects;
import java.util.Scanner;

public class Fibonacci {
    public static int ehFibonacci(Integer numero){
        int x = 0, y = 1, soma = 0;
        while(soma < numero){
            soma = x + y;
            x = y;
            y = soma;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Qual numero deseja testar?");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = ehFibonacci(numero);
        if(Objects.equals(resultado, numero)) System.out.println("Eh fibonacci");
        else System.out.println("Nao eh fibonacci");
    }
}

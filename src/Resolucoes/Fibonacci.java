package Resolucoes;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        sequenciaDeFibonacci(numero);

    }
    static void sequenciaDeFibonacci(int numero){
        int fibAnterior1 = 0, fibAnterior2 = 1, aux = 0;
        while(numero > aux) {
            aux = fibAnterior1 + fibAnterior2;
            fibAnterior2 = fibAnterior1;
            fibAnterior1 = aux;
        }
          if(numero == 0 || numero == aux){
              System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
          }else {
              System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
          }
   }
}

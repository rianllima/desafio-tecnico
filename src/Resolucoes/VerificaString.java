package Resolucoes;

import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        Boolean contemA = false;

        String palavra = scan.nextLine();

        for(int i = 0; i < palavra.length();i++){
            if(palavra.charAt(i) == 'a'){
               contemA = true;
               cont++;
            }
        }
        if(contemA) {
            possuiLetraA(contemA, cont);
        }
    }
    static void possuiLetraA(boolean contemA, int contador){
        System.out.println("Possui a letra a!\nVezes em que se repete: " + contador);
    }
}

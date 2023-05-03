package ExQuatro;

import java.util.Scanner;
public class Vetor {
    public int vetor[] = new int[4];
    Scanner digite = new Scanner(System.in);
    public void pedirNumero(){
       for (int i = 0; i < vetor.length; i++) {

        System.out.println("Informe um número: ");
        vetor[i] = digite.nextInt();
    }
}
    public void numeroVerificado(){

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }
        System.out.println("-----");
        System.out.println("O menor número é: "+menorValor);
    }
}


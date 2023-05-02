package ExQuatro;

import java.util.Scanner;
public class Vetor {
    public int vetor[] = new int[4];
    Scanner digite = new Scanner(System.in);
    public int pedirNumero(){
       for (int i = 0; i < vetor.length; i++) {

        System.out.println("Informe um número: ");
        vetor[i] = digite.nextInt();
    }
        return 0;
}
    public int numeroVerificado(){

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorValor){
                menorValor = vetor[i];
            }
        }
        System.out.println("-----");
        System.out.println("O menor número é: "+menorValor);
        return 0;
    }
}


package ExUm;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        Soma somatoria = new Soma ();

        System.out.println("Digite um número: ");
        int numeroDigitado = digite.nextInt();

        somatoria.soma(numeroDigitado);

        System.out.println("O resultado final da somatória é: "+somatoria.resultado);
    }
}

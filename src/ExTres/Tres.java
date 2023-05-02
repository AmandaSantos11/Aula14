package ExTres;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);
        Imc imcDoUsuario = new Imc();

        System.out.println("Digite seu peso: ");
        Imc.peso = digite.nextDouble();

        System.out.println("Digite sua altura: ");
        Imc.altura = digite.nextDouble();

        imcDoUsuario.calculoImc();
    }
}

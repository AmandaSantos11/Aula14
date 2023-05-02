package ExDois;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {

        Scanner digite = new Scanner(System.in);
        ReceberNome usuario = new ReceberNome();

        System.out.println("Digite um nome: ");
        usuario.receberNome(digite.next());
    }
}

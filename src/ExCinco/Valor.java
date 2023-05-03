package ExCinco;
import java.util.Scanner;
public class Valor {
    Scanner digite = new Scanner (System.in);

    public static String nome;
    public static double salarioFixo;
    public static double vendas;


    public void registroUsuario(){

        System.out.println("Digite seu nome: ");
        nome = digite.next();

        System.out.println("Informe seu salário: ");
        salarioFixo = digite.nextDouble();

        System.out.println("Quantas vendas foram efetuadas em reais?");
        vendas = digite.nextInt();
    }
    public void atualizacao(){

        double salarioAtual;
        double comissao = vendas * ((double) 15 / 100);

        salarioAtual = comissao + salarioFixo;
        System.out.println("-------");
        System.out.println("Nome: " + nome);
        System.out.println("Valor de vendas: " + vendas);
        System.out.println("Salário: " + salarioFixo);
        System.out.println("Salário no final do mês: " + salarioAtual);
    }
}

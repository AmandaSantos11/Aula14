package ExCinco;
import java.util.Scanner;
public class Valor {
    Scanner digite = new Scanner (System.in);

    public static String nome;
    public static double salarioFixo;
    public static double vendas;


    public double registroUsuario(){

        System.out.println("Digite seu nome: ");
        nome = digite.next();

        System.out.println("Informe seu salário: ");
        salarioFixo = digite.nextDouble();

        System.out.println("Quantas vendas foram efetuadas em reais?");
        vendas = digite.nextInt();

        return 0;
    }
    public double atualizacao(){

        double salarioAtual;
        double comissao = vendas * ((double) 15 / 100);

        salarioAtual = comissao + salarioFixo;
        System.out.println("-------");
        System.out.println("Nome: " + nome  + "\n Valor de vendas: " + vendas + "\n Salário: " + salarioFixo + "\n Salário no final do mês: " + salarioAtual);
        return 0;
    }
}

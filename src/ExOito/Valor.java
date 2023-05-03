package ExOito;
import java.util.Scanner;
public class Valor {
    Scanner digite = new Scanner(System.in);
    public static double precoCusto;
    public static double acrescimo;

    public void produto(){

        System.out.println("Informe o preço de custo:  ");
        precoCusto = digite.nextDouble();

        System.out.println("Informe o percentual que deseja acrescentar: ");
        acrescimo = digite.nextDouble();

        acrescimo = (acrescimo/100) * precoCusto;

        double valorVenda = acrescimo + precoCusto;

        System.out.println("-----");
        System.out.println("Valor de venda do produto é: " + valorVenda);
    }
}

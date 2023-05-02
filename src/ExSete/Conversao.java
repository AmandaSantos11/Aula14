package ExSete;
import java.util.Scanner;
public class Conversao {

    Scanner digite = new Scanner(System.in);
    public double dolar;
    public double real;
    public double cotacao;

    public double valorDigitado(){

        System.out.println("Cotação do dolar?");
        cotacao = digite.nextDouble();

        return  0;
    }
    public double conversao(){

        System.out.println("Digite quantos dolares você tem disponível: ");
        dolar = digite.nextDouble();

        real = dolar * cotacao;

        System.out.println("-----");
        System.out.println("Você tem R$" + real + " em real");

        return 0;
    }
}


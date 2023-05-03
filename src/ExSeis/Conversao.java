package ExSeis;
import java.util.Scanner;
public class Conversao {
        Scanner digite = new Scanner(System.in);

        public double celcius;
        public double fahrenheit;

        public void conversor(){

            System.out.println("Digite a temperatura em Celcius: ");
            celcius = digite.nextDouble();

            fahrenheit = ((9 * celcius) + 160) /5;

            System.out.println("Temperatura convertida: "+fahrenheit);
        }
}

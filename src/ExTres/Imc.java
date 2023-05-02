package ExTres;

public class Imc {
    public static double peso;
    public static double altura;
    public double calculoImc(){

    double imc = peso / (altura*altura);

        if (imc < 18.5){
            System.out.println("Classificação: Magreza");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Classificação: Normal");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        }
        else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Classificação: Obesidade");
        }
        else if (imc > 40) {
            System.out.println("Classificação: Obesidade Grave");
        }
        return imc;
}
}

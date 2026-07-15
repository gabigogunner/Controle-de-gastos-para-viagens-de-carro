package ControleFinanceiroCarro;
import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {
        double precoGasolina = 6.58;

        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro("Fox", 12);

        System.out.println("Estão em quantas pessoas?");
        int pessoasNaRacha = scanner.nextInt();
        System.out.println("Qual a distância do trajeto?");
        double distanciaPercorrida = scanner.nextDouble();
        System.out.println("Qual o preço do Uber?");
        double precoUber = scanner.nextDouble();
        System.out.println("Quanto gastaria com estacionamento?");
        double valorEstacionamento = scanner.nextDouble();
        
        CalculosFinanceiro calculo1 = new CalculosFinanceiro();
        double calculoCarro = calculo1.calcularGastoCarro(carro1, pessoasNaRacha, precoGasolina, valorEstacionamento, distanciaPercorrida);  
        double calculoUber = calculo1.calcularGastoUber(pessoasNaRacha, precoUber);  
        System.out.printf("Indo de %s, será gasto: R$%.2f, já de Uber R$%.2f", carro1.getNomeCarro(), calculoCarro, calculoUber);
        scanner.close();

    }
}


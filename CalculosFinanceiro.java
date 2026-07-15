package ControleFinanceiroCarro;

public class CalculosFinanceiro {

    double calcularGastoCarro(Carro carro, int pessoasNaRacha, double precoGasolina, double valorEstacionamento, double distanciaPercorrida){
        double distanciaTotal = distanciaPercorrida * 2;
        double litrosGastos = distanciaTotal / carro.getConsumoCarro();
        double valorViagem = litrosGastos * precoGasolina;
        double valorFinal = (valorViagem + valorEstacionamento) / pessoasNaRacha;     
        return valorFinal;
    }
    double calcularGastoUber(int pessoasNaRacha, double precoUber){
        double valorFinal = precoUber * 2 / pessoasNaRacha;
        return valorFinal;
    }
}

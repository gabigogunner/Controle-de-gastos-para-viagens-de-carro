package ControleFinanceiroCarro;

public class Carro {

    private String nomeCarro;
    private double consumoCarro;

    Carro(String nomeCarro, double consumoCarro) {
        this.nomeCarro = nomeCarro;
        this.consumoCarro = consumoCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }
    public double getConsumoCarro(){
        return consumoCarro;
    }
}

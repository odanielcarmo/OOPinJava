package locadora.model;

import java.math.BigDecimal;

public abstract class  Veiculo {

    // Criando os atributos da classe
    private String placa;
    private String modelo;
    private BigDecimal diariaBase;
    private boolean disponivel;

    // Construtor
    public Veiculo(String placa, String modelo, BigDecimal diariaBase) {
        this.placa = placa;
        this.modelo = modelo;
        this.diariaBase = diariaBase;
        this.disponivel = true;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }


    // Métodos
    public void alugar(){
        if (!disponivel){
            throw new IllegalStateException("Veiculo já está alugado");
        }

        this.disponivel = false;
        IO.println("Veiculo " + modelo + " Alugado com Sucesso!");
    }

    public void devolver(){
        this.disponivel = true;
        IO.println("Veiculo " + modelo + " Alugado com Sucesso!");
    }

    // Metodo Abstrato
    public abstract BigDecimal calcularValorAluguel(int dias);

    // Metodo concreto
    public void exibirFicha(){
        IO.println(placa + " - " + modelo + " - Disponível: " + disponivel);
    }

}

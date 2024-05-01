package model;

import java.time.LocalDate;

public class Carro implements Veiculo{
    private String modelo;
    private String cor;
    private String marca;

    private String placa;
    private String nomeProprietario;
    private LocalDate dataCadastro;

    private double tempo;

    public Carro() {
        dataCadastro = LocalDate.now();
    }

    public Carro(String modelo, String cor, String marca, String placa, String nomeProprietario, double tempo) {
        this();
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.placa = placa;
        this.nomeProprietario = nomeProprietario;
        this.tempo = tempo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double valorTarifa(double tempo) {
        double valorTarifa = 0;
        if (tempo < 0.31) {
            return valorTarifa +=  10.0;
        } else if (tempo < 2.0) {
            return valorTarifa +=  15.0;
        } else if (tempo <= 6.0) {
            return valorTarifa +=  15.0 + (tempo - 1) * 5;
        }
        return valorTarifa += 30;
    }

    @Override
    public String getCor() {
        return cor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    @Override
    public void setNomeProprietario(String NomeProprietario) {
       this.nomeProprietario = nomeProprietario;
    }

    @Override
    public double getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", placa='" + placa + '\'' +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}

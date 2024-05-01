package model;

import java.time.LocalDate;

public class Bicicleta implements Veiculo{
    private String cor;
    private String marca;
    private String nomeProprietario;
    private LocalDate dataCadastro;

    private double tempo;

    public Bicicleta() {
        dataCadastro = LocalDate.now();
    }

    public Bicicleta(String cor, String marca, String nomeProprietario, double tempo) {
        this();
        this.cor = cor;
        this.marca = marca;
        this.nomeProprietario = nomeProprietario;
        this.tempo = tempo;
    }


    @Override
    public double valorTarifa(double tempo) {
        double valorTarifa = 0;
        if (tempo < 0.31) {
            return valorTarifa +=  5.0;
        } else if (tempo < 2.0) {
            return valorTarifa +=  7.0;
        } else if (tempo <= 6.0) {
            return valorTarifa +=  7.0 + (tempo - 1) * 2;
        }
        return valorTarifa += 10;
    }

    @Override
    public String getCor() {
        return cor;
    }


    public LocalDate getDataCadastro() {
        return dataCadastro;
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
        return "Bicicleta{" +
                "cor='" + cor + '\'' +
                ", nomeProprietario='" + nomeProprietario + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}


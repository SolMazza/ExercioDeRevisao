package model;

public interface Veiculo {

    public double valorTarifa(double tempo);
    String getCor();
    void setCor(String Cor);
    String getMarca();
    void setMarca(String marca);
    String getNomeProprietario();
    void setNomeProprietario(String NomeProprietario);

    double getTempo();
}

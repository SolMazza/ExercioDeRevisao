package View;

import model.Bicicleta;
import model.Carro;
import model.Moto;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class TesteEstacinamento {
    public static void main(String[] args) {

        Veiculo veiculo1 = new Moto("Forza 350", "Vermelha", "Honda", "VOI1P34", "Bianca De Assis", 5);
        Veiculo veiculo2 = new Moto("CBR 650R", "Amarela", "Honda", "TXT8O00", "Mateus Costa", 6);
        Veiculo veiculo3 = new Bicicleta("verde", "Caloi", "Bianca de Assis", 2);
        Veiculo veiculo4 = new Carro("HB20X", "Branco", "Hyundai", "PEP0908", "Antonia Beber", 0.30);
        Veiculo veiculo5 = new Moto("Honda ADV", "Preta", "Honda", "SOL0I66", "Sol Mazzarolo", 8);
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        veiculos.add(veiculo5);

        for (Veiculo veiculo : veiculos){
            double tarifaVeiculo = veiculo.valorTarifa(veiculo.getTempo());
            System.out.println(veiculo + "| Tarifa do estacionamento: " + tarifaVeiculo);
        }

    }

}

package view;

import controller.MovimentacaoVeiculosController;
import model.TipoVeiculo;
import model.Veiculo;
import model.VeiculoBuilder;

public class Principal {
    public static void main(String[] args) {
        MovimentacaoVeiculosController mov = new MovimentacaoVeiculosController();

        Veiculo caminhao = VeiculoBuilder.builder()
                .addVeiculo(
                        TipoVeiculo.MOTOCICLETA,
                        "XXX",
                        "ABC",
                        "ABCD65",
                        "",
                        160)
                .addCilindradas(200)
                .get();

        // Veiculo moto = VeiculoBuilder.builder()
        // .addVeiculo(
        // TipoVeiculo.MOTOCICLETA,
        // "GAT1515",
        // "HONDA",
        // "CG150",
        // "Vermelha",
        // 130)
        // .addCilindradas(150)
        // .get();

        // Veiculo van = VeiculoBuilder.builder()
        // .addVeiculo(
        // TipoVeiculo.VAN,
        // "EMA1012",
        // "Mercedes Benz",
        // "Sprinter",
        // "Branca",
        // 140)
        // .addPassageiros(12)
        // .addParadas(12)
        // .get();

        mov.inicioMovimentacao(caminhao);
    }
}
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
                        TipoVeiculo.MOTOCICLETA,"XXX","ABC","ABCD65","",160)
                .addCilindradas(200)
                .get();

        mov.inicioMovimentacao(caminhao);
    }
}
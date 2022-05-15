package controller;

import model.TipoVeiculo;
import model.Veiculo;

public class MovimentacaoVeiculosController {
  Veiculo veiculo;

  public void inicioMovimentacao(Veiculo veiculo) {
    System.out.println("Veículo se movimentando");
    System.out.println(veiculo);

    this.veiculo = veiculo;
  }

  private void automovel() {
    double tempo = gerarRandom(10, 30);
    double movimento = gerarRandom(50, 650);
    double passageiros = gerarRandom(1, 4);

    System.out.println(
        tempo + " segundos para atingir 100km/h. \n" +
            "Movimento: " + movimento + "km\n" +
            "Passageiros: " + passageiros);
  }

  private void caminhao() {
    double peso = gerarRandom(1000, 3000);
    double movimento = gerarRandom(500, 3000);
    double valorFrete = gerarRandom(2000, 5000);

    System.out.println(
        "Peso: " + peso + "kg\n" +
            "Movimento: " + movimento + "km\n" +
            "Valor do frete: R$ " + valorFrete);
  }

  private void motocicleta() {
    double movimento = gerarRandom(20, 100);
    double valorFrete = gerarRandom(30, 80);

    System.out.println(
        "Movimento: " + movimento + "km\n" +
            "Valor do frete: R$ " + valorFrete);
  }

  private void van() {
    double passageiros = gerarRandom(3, 12);
    double paradas = gerarRandom(3, 12);

    System.out.println(
        "Passageiros: " + passageiros + "\n" +
            "Paradas: " + paradas);
  }

  private double gerarRandom(double min, double max) {
    return (Math.random() * (max - min)) + min;
  }
}

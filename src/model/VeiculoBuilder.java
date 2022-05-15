package model;

public class VeiculoBuilder {
	  Veiculo veiculo;

	  VeiculoBuilder() {
	    this.veiculo = new Veiculo();
	  }

	  public static VeiculoBuilder builder() {
	    return new VeiculoBuilder();
	  }

	  public VeiculoBuilder addVeiculo(
	      TipoVeiculo tipo,
	      String placa,
	      String marca,
	      String modelo,
	      String cor,
	      int velocidadeMaxima) {
	    this.veiculo.setPlaca(placa);
	    this.veiculo.setMarca(marca);
	    this.veiculo.setModelo(modelo);
	    this.veiculo.setCor(cor);
	    this.veiculo.setVelocidadeMaxima(velocidadeMaxima);

	    return this;
	  }

	  public VeiculoBuilder addCargaMaxima(int cargaMaxima) {
	    this.veiculo.setCargaMaxima(cargaMaxima);
	    return this;
	  }

	  public VeiculoBuilder addCilindradas(int cilindradas) {
	    this.veiculo.setCilindradas(cilindradas);
	    return this;
	  }

	  public VeiculoBuilder addPassageiros(int passageiros) {
	    this.veiculo.setPassageiros(passageiros);
	    return this;
	  }

	  public VeiculoBuilder addParadas(int paradas) {
	    this.veiculo.setParadas(paradas);
	    return this;
	  }

	  public Veiculo get() {
	    return this.veiculo;
	  }

	}

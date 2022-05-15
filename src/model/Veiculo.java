package model;

public class Veiculo {
	  private String placa;
	  private String marca;
	  private String modelo;
	  private String cor;
	  private String TipoVeiculo;
	  private int velocidadeMaxima;
	  private int cargaMaxima;
	  private int cilindradas;
	  private int passageiros;
	  private int paradas;

	  public String getPlaca() {
	    return this.placa;
	  }

	  public void setPlaca(String placa) {
	    this.placa = placa;
	  }

	  public String getMarca() {
	    return this.marca;
	  }

	  public void setMarca(String marca) {
	    this.marca = marca;
	  }

	  public String getModelo() {
	    return this.modelo;
	  }

	  public void setModelo(String modelo) {
	    this.modelo = modelo;
	  }

	  public String getCor() {
	    return this.cor;
	  }

	  public void setCor(String cor) {
	    this.cor = cor;
	  }


	  public int getVelocidadeMaxima() {
	    return this.velocidadeMaxima;
	  }

	  public void setVelocidadeMaxima(int velocidadeMaxima) {
	    this.velocidadeMaxima = velocidadeMaxima;
	  }


	  public int getCargaMaxima() {
	    return this.cargaMaxima;
	  }

	  public void setCargaMaxima(int cargaMaxima) {
	    this.cargaMaxima = cargaMaxima;
	  }

	  public int getCilindradas() {
	    return this.cilindradas;
	  }

	  public void setCilindradas(int cilindradas) {
	    this.cilindradas = cilindradas;
	  }

	  public int getPassageiros() {
	    return this.passageiros;
	  }

	  public void setPassageiros(int passageiros) {
	    this.passageiros = passageiros;
	  }

	  public int getParadas() {
	    return this.paradas;
	  }

	  public void setParadas(int paradas) {
	    this.paradas = paradas;
	  } 

	  public String getTipoVeiculo() {
		return TipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		TipoVeiculo = tipoVeiculo;
	}

	@Override
	  public String toString() {
	    return "{" +
	        " placa do veiculo:'" + getPlaca() + "'" +
	        ", marca do veiculo:'" + getMarca() + "'" +
	        ", modelo do veiculo:'" + getModelo() + "'" +
	        ", cor do veiculo: '" + getCor() + "'" +
	        ", velocidadeMaxima do veiculo:'" + getVelocidadeMaxima() + "'" +
	        ", cargaMaxima do veiculo:'" + getCargaMaxima() + "'" +
	        ", cilindradas do veiculo:'" + getCilindradas() + "'" +
	        ", passageiros'" + getPassageiros() + "'" +
	        ", paradas'" + getParadas() + "'" +
	        "}";
	  }
	}

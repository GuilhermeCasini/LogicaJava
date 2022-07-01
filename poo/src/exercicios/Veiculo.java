package exercicios;

public class Veiculo {
	private double capacidade;
	private int passageiros;
	private double consumo;
	
	public Veiculo(double cap,int pag, double con) {
		capacidade=cap;
		passageiros=pag;
		consumo = con;
		
		
	}
	
	public double tanqueViagem (double km) {
		return km/(consumo*capacidade);
	}
	public double dividirDespesas(double km, double combustivel) {
		return (km/capacidade*combustivel)/passageiros;
	}
	
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public String toString() {
		return "\n O veiculo tem "+passageiros
				+" passageiros, e possui um tanque de "+capacidade
				+"litros, e faz "+consumo+"KM/L.\n";
	}
	
}

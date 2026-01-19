package reto4;

import java.util.ArrayList;

public class Puerto {
	protected ArrayList<Barco> barcos = new ArrayList<>();
	
	public boolean entrarBarco(Barco b) {
		if (barcos.size() < 6) {
			barcos.add(b);
			return true;
		}else {return false;}
	}
	
	public boolean salirBarco(String nombre) {
		boolean losaco  = false;
		for (int i = 0; i < barcos.size(); i++) {
			Barco b = barcos.get(i);
			
		if (b.getNombre().equals(nombre)) {
			barcos.remove(i);
			losaco = true;
		}
		}
		return losaco;
	}
	
	public double calcularPrecio(Barco b, int horas, double precioCombustible) {
		if (b.calcularAutonomia() < horas) {
			return -1;
		}else {return horas*b.getMotor().getConsumo()*precioCombustible;}
		
	}

	public Puerto(ArrayList<Barco> barcos) {
		super();
		this.barcos = barcos;
	}

	public ArrayList<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}
	
	
	
	
	
	
	
}

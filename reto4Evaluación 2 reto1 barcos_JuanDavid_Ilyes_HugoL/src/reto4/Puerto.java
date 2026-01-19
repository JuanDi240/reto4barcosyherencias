package reto4;

import java.util.ArrayList;
import reto4.Barco;

public class Puerto {
	protected ArrayList<Barco> barcos = new ArrayList<>();
	
	public boolean entrarBarco(Barco b) {
		if (barcos.size() < 6) {
			barcos.add(b);
			return true;
		}else {return false;}
	}
	
	public boolean salirBarco(String nombre) {
		for (int i = 0; i < barcos.size(); i++) {
			Barco b = barcos.get(i);
			
		if (b.getNombre().equals(nombre)) {
			barcos.remove(i);
		}return true;
		}
	}
}

package reto4;

public class Yate extends Barco{
	protected int camarotes;

	public Yate(String nombre, Motor motor, double capacidadCombustible, int camarotes) {
		super(nombre, motor, capacidadCombustible);
		this.camarotes = camarotes;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	@Override
	public String toString() {
		return "Yate [camarotes=" + camarotes + ", toString()=" + super.toString() + super.calcularAutonomia() +"]";
	}
	
	
}

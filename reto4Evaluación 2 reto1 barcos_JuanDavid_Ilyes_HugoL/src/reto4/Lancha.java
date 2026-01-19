package reto4;

public class Lancha extends Barco{
	private boolean cubierta;

	public Lancha(String nombre, Motor motor, double capacidadCombustible, boolean cubierta) {
		super(nombre, motor, capacidadCombustible);
		this.cubierta = cubierta;
	}

	@Override
	public String toString() {
		return "Lancha [cubierta=" + cubierta + ", nombre=" + nombre + ", motor=" + motor + ", capacidadCombustible="
				+ capacidadCombustible + ", calcularAutonomia()=" + calcularAutonomia() + ", toString()="
				+ super.toString() + "]";
	}
	

}

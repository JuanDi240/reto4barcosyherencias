package reto4;

public class Catamaran extends Barco{
	@Override
	public String toString() {
		return "Catamaran [motorSecundario=" + motorSecundario + ", calcularAutonomia()=" + calcularAutonomia() + "]";
	}

	@Override
	public double calcularAutonomia() {
		// TODO Auto-generated method stub
		return super.calcularAutonomia();
	}

	public Motor getMotorSecundario() {
		return motorSecundario;
	}

	public void setMotorSecundario(Motor motorSecundario) {
		this.motorSecundario = motorSecundario;
	}

	protected Motor motorSecundario;

	public Catamaran(String nombre, Motor motor, double capacidadCombustible, Motor motorSecundario) {
		super(nombre, motor, capacidadCombustible);
		this.motorSecundario = motorSecundario;
	}
	
	public static double calcularAutonomia(int capacidad, double consumoMotor1, double consumoMotor2) {
		return (capacidad/consumoMotor1 + capacidad/consumoMotor2);
	}
	
}

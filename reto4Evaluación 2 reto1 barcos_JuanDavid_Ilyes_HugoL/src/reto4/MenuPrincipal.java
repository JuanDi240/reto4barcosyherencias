package reto4;

import reto4.Puerto;

public class MenuPrincipal {

	public static void main(String[] args) {
		Motor motor1 = new Motor("Motor1", 500, 8.5);
		Motor motor2 = new Motor("Motor2", 600, 8.5);
		Motor motor3 = new Motor("Motor3", 850, 8.5);
		Motor motor4 = new Motor("Motor4", 500, 8.5);
		Motor motor5 = new Motor("Motor5", 500, 8.5);
		Lancha lancha1 = new Lancha("Lancha1", motor1, 350, true);
		Lancha lancha2 = new Lancha("Lancha2", motor1, 350, true);
		Yate yate1 = new Yate("Yate1", motor2, 750, 6);
		Yate yate2 = new Yate("Yate2", motor2, 750, 6);
		Catamaran caramaran1 = new Catamaran("Catamaran1", motor1, 1000, motor3);
		Catamaran caramaran2 = new Catamaran("Catamaran2", motor1, 1000, motor3);
		
		Puerto marina = new Puerto(null);
		
		
		

	}

}

package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		// El avión y el tractor se encienden
		plane.start();
		tractor.start();

		// El avión despega
		plane.takeOff();

		// El avión está volando y el tractor avanza
		plane.fly();
		tractor.forward();

		// El tractor retrocede y el avión aterriza
		tractor.backward();
		plane.land();

		// El avión y el tractor están apagados
		plane.stop();
		tractor.stop();

		// El avión y el tractor están en mantenimiento
		plane.maintenance();
		tractor.maintenance();

	}

}

package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int dMaxima = 100;

		ThreadSapo sapo1 = new ThreadSapo(dMaxima);
		ThreadSapo sapo2 = new ThreadSapo(dMaxima);
		ThreadSapo sapo3 = new ThreadSapo(dMaxima);
		ThreadSapo sapo4 = new ThreadSapo(dMaxima);
		ThreadSapo sapo5 = new ThreadSapo(dMaxima);

		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}
}

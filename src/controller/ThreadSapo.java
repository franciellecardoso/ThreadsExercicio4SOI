package controller;

public class ThreadSapo extends Thread {
	private int dMaxima;
	private int dRestante;
	public int dPercorrida = 0;
	private double tInicial;
	private double tFinal;
	public double tExecucao;

	public ThreadSapo(int dMaxima) {
		this.dMaxima = dMaxima;
	}

	@Override
	public void run() {
		tInicial = System.nanoTime();

		do {
			pulo();
			try {
				sleep(1000);
			} catch (Exception error) {

			}
		} while (dPercorrida < dMaxima);
		tFinal = System.nanoTime();
		tExecucao = (tFinal - tInicial) / Math.pow(10, 9);
		System.out.println("[TERMINOU] Sapo: " + getId() + " .Tempo de execução:  " + tExecucao + ". Distância Total: "
				+ dPercorrida + "m");
	}

	private void pulo() {
		int pulo = (int) ((Math.random() * dMaxima) + 1);
		dPercorrida += pulo;
		dRestante = dMaxima - dPercorrida;
		System.out.println("Sapo ==> " + getId() + ". Pulo ==> " + pulo + "m. Restam " + dRestante
				+ "m. Percorrido ==> " + dPercorrida + "m");
	}
}
package juego.unidades;

public class Distancia {

	private double x1;
	private double x2;

	/**
	 * Constructor por defecto de la clase
	 * 
	 */
	public Distancia() {
		this.x1 = 0;
		this.x2 = 0;
	}

	/**
	 * Constructor parametrizado de la clase
	 * 
	 * @param x1
	 * @param x2
	 */
	public Distancia(double x1, double x2) {
		this.x1 = x1;
		this.x2 = x2;
	}

	/**
	 * Se calcula la distancia de la unidad
	 * 
	 * @param distancia
	 * @return
	 */
	public double calcularDistancia(Distancia distancia) {

		return Math.sqrt(Math.pow(x1 - distancia.getX1(), 2)
				+ Math.pow(x2 - distancia.getX2(), 2));
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

}

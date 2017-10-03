package juego.items;

import juego.unidades.UnidadTemplate;

public class Puñal extends ItemDecorator {

	/**
	 * Constantes de aumento de ataque y reduccion de defensa
	 */
	protected static final double DEFENSA = 3;
	protected static final double ATAQUE = 3;

	/**
	 * Constructor de la clase
	 * 
	 * @param unidad
	 */
	public Puñal(UnidadTemplate unidad) {
		super(unidad);
	}

	/**
	 * Sobreescritura del metodo que reduce la defensa en 3
	 */
	public double getDefensa() {
//		getUnidad().setDefensa(getUnidad().getDefensa() - DEFENSA);
		return getUnidad().getDefensa() - DEFENSA ;
	}

	/**
	 * Sobreescritura del metodo que aumenta el ataque en 3
	 */
	public double getAtaque() {
//		getUnidad().setAtaque(getUnidad().getAtaque() + ATAQUE);
		return getUnidad().getAtaque() + ATAQUE;
	}

	
	/** Sobre carga de metodos de la clase UnidadTemplate
	 * 
	 */
	@Override
	public boolean atacar(UnidadTemplate enemigo) {
		return this.getUnidad().atacar(enemigo);
	}

	@Override
	public void estadoUnidad() {
		this.getUnidad().estadoUnidad();

	}

	@Override
	public void pocionAgua() {
		this.getUnidad().pocionAgua();
		
	}

}

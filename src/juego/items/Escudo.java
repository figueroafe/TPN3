package juego.items;

import juego.unidades.UnidadTemplate;

public class Escudo extends ItemDecorator {

	/**
	 * Constantes de aumento de la defensa en un 60 % (reduccion de ataque en
	 * 40%)
	 */
	protected static final double DEFENSA = 0.60;

	public Escudo(UnidadTemplate unidad) {
		super(unidad);
	}

	/**
	 * Sobreescritura del metodo que aumenta la defensa
	 */
	public double getDefensa() {
//		getUnidad().setDefensa(getUnidad().getDefensa() + DEFENSA);
		return getUnidad().getDefensa() + DEFENSA ;
	}

	/**
	 * Sobrecarga de los metodos de la clase UnidadTemplate
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
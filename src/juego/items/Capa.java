package juego.items;

import juego.unidades.UnidadTemplate;

public class Capa extends ItemDecorator {

	/**
	 * Constantes de aumento de ataque y energia
	 */
	protected static final double ENERGIA = 2;
	protected static final double ATAQUE = 1.10;

	public Capa(UnidadTemplate unidad) {
		super(unidad);
	}

	/**
	 * sobreescritura del ataque que aumenta un 10%
	 */
	public double getAtaque() {
		return getUnidad().getAtaque() / ATAQUE;
	}

	/**
	 * Sobreescritura de la energia que la duplica
	 */
	public double getEnergia() {
		return getUnidad().getEnergia() * ENERGIA;
	}

	/**
	 * sobrecarga de los metodos de la clase UnidadTemplate
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

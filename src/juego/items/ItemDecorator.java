package juego.items;

import juego.unidades.UnidadTemplate;

public abstract class ItemDecorator extends UnidadTemplate {

	private UnidadTemplate unidad;

	public ItemDecorator(UnidadTemplate unidad) {
		super(unidad.getDistancia());
		this.unidad = unidad;
	}

	public UnidadTemplate getUnidad() {
		return unidad;
	}

	public void setUnidad(UnidadTemplate unidad) {
		this.unidad = unidad;
	}

	/**
	 * getters de los atributos a decorar en cada subclase segun el item que
	 * lleven
	 * 
	 */

	public double getDefensa() {
		return getUnidad().getDefensa();
	}

	public double getSalud() {
		return getUnidad().getSalud();
	}

	public double getAtaque() {
		return getUnidad().getAtaque();
	}

	public double getEnergia() {
		return getUnidad().getEnergia();
	}

}

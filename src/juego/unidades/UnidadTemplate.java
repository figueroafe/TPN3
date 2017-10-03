package juego.unidades;

import java.util.ArrayList;

import sun.security.jca.GetInstance;
import juego.items.ItemDecorator;
import juego.items.ItemInterfaz;

public abstract class UnidadTemplate {

	/**
	 * atributos que tienen en comun cada unidad
	 */
	protected ArrayList<ItemDecorator> listaItem;
	protected double energia;
	protected double defensa;
	protected int salud;
	protected double ataque;
	protected Distancia distancia;
	protected double distanciaMin;
	protected double distanciaMax;

	/**
	 * Constructor de la clase parametrizado
	 * 
	 * @param distancia
	 */
	public UnidadTemplate(Distancia distancia) {
		this.distancia = distancia;
	}

	/**
	 * Metodo abstracto que se desarrollara en cada sub clase de Unidad, de
	 * acuerdo a esta. Es el Template de la pelea con otra unidad
	 * 
	 * 
	 * @param enemigo
	 * @return
	 */
	public abstract boolean atacar(UnidadTemplate enemigo);
	
	/**
	 * Metodo que muestra el estado completo de la unidad
	 * 
	 * @param enemigo
	 * @return
	 */
	public abstract void estadoUnidad();
	/**
	 * Metodo que pregunta si esta en distancia correcta para atacar
	 * 
	 * @param enemigo
	 * @return
	 */
	protected boolean distanciaDeAtaque(UnidadTemplate enemigo) {
		double distancia = this.distancia.calcularDistancia(enemigo.distancia);
		return distancia >= distanciaMin && distancia <= distanciaMax;
	}
	
	/**metodo de la interfaz a desarrollar en la clase soldado y caballero
	 * 
	 */
	public abstract void pocionAgua();
	/**
	 * Getters y Setters
	 * 
	 */
	public ArrayList<ItemDecorator> getListaItem() {
		return listaItem;
	}

	public void setListaItem(ArrayList<ItemDecorator> listaItem) {
		this.listaItem = listaItem;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double d) {
		this.defensa = d;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double d) {
		this.ataque = d;
	}

	public Distancia getDistancia() {
		return distancia;
	}

	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

}

package juego.unidades;

import java.util.ArrayList;

import sun.security.jca.GetInstance;
import juego.items.ItemDecorator;
import juego.items.ItemInterfaz;

public abstract class UnidadTemplate implements ItemInterfaz{

	/**
	 * atributos que tienen en comun cada unidad
	 */
	protected ArrayList<ItemDecorator> listaItem;
	protected int defensa;
	protected int salud;
	protected int ataque;
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
	 * Metodo que pregunta si esta en distancia correcta para atacar
	 * 
	 * @param enemigo
	 * @return
	 */
	protected boolean distanciaDeAtaque(UnidadTemplate enemigo) {
		double distancia = this.distancia.calcularDistancia(enemigo.distancia);
		return distancia >= distanciaMin && distancia <= distanciaMax;
	}

	/**
	 * se encanrga de aplicar un item a la unidad
	 * 
	 * @param item
	 * @return
	 */
	protected boolean aplicarItem(ItemDecorator item) {
		if (this.listaItem.size() < 3) {
			listaItem.add(item);
		//	item.equipar();
			System.out.println("Se equipo con " + item.getNombreItem());
			return true;
		}

		return false;

	}

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

	public void setDefensa(int defensa) {
		this.defensa = defensa;
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

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public Distancia getDistancia() {
		return distancia;
	}

	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}

}

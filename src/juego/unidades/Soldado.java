package juego.unidades;

import java.util.ArrayList;

import juego.items.ItemDecorator;

public class Soldado extends UnidadTemplate implements Pocion {

	/**
	 * Atributo particular de la clase soldado
	 */
	private double energia;

	/**
	 * Valores iniciales de los soldados
	 * 
	 * tomamomos como defensa inicial 0
	 */
	public static final int ATAQUE_SOLDADO = 10;
	public static final int DEFENSA_SOLDADO = 0;
	public static final int SALUD_SOLDADO = 200;
	public static final int ENERGIA_SOLDADO = 100;
	public static final int DISTANCIA_MIN_SOLDADO = 0;
	public static final int DISTANCIA_MAX_SOLDADO = 1;

	/**
	 * Constructor de la clase parametrizado con sus valores por defecto
	 * 
	 * @param listaItem
	 * @param defensa
	 * @param salud
	 * @param ataque
	 * @param distancia
	 */
	public Soldado(Distancia distancia) {
		super(distancia);
		this.energia = ENERGIA_SOLDADO;
		this.ataque = ATAQUE_SOLDADO;
		this.defensa = DEFENSA_SOLDADO;
		this.distancia = distancia;
		this.listaItem = new ArrayList<ItemDecorator>();
		this.salud = SALUD_SOLDADO;
		this.distanciaMin = DISTANCIA_MIN_SOLDADO;
		this.distanciaMax = DISTANCIA_MAX_SOLDADO;

	}

	public void estadoSoldado() {
		System.out.println("Energia   --> " + this.getEnergia());
		System.out.println("Salud     --> " + this.getSalud());
		System.out.println("Defensa   --> " + this.getDefensa());
		System.out.println("Ataque    --> " + this.getAtaque());

		if (this.getListaItem().size() > 0) {
			for (int i = 0; i < this.getListaItem().size(); i++) {
				System.out
						.println("Item     --> " + this.getListaItem().get(i));
			}
		} else {
			System.out.println("Item     --> 0");

		}

	}

	/**
	 * Se implementa el metodo beber pocion solo para el soldado
	 */
	@Override
	public void pocionAgua() {
		this.energia = ENERGIA_SOLDADO;
	}

	/**
	 * Sobreescribo el metodo atacar segun la forma de combate del soldado
	 */
	@Override
	public boolean atacar(UnidadTemplate enemigo) {
		if (this.energia >= ENERGIA_SOLDADO && distanciaDeAtaque(enemigo)) {
			this.energia -= ATAQUE_SOLDADO;
			enemigo.setSalud((int) ((enemigo.getSalud() - this.getAtaque()) + enemigo
					.getDefensa()));
			System.out.println("El Soldado ataco al "
					+ enemigo.getClass().toString());
			return true;
		}
		if (this.energia <= ENERGIA_SOLDADO)
			System.out.println("Ya no posee energia suficiente para atacar.");
		return false;
	}

	/**
	 * Getters y Setterd s
	 */
	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

}

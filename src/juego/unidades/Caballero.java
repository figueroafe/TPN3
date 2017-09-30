package juego.unidades;

import java.util.ArrayList;

import juego.items.ItemDecorator;

public class Caballero extends UnidadTemplate implements Pocion {

	/**
	 * atributos particulares de los caballeros
	 */
	private boolean caballoRebelde;
	private int ataquesRecibidos;

	/**
	 * Valores iniciales de los Caballeros
	 * 
	 * tomamomos como defensa inicial 0
	 */
	public static final int ATAQUE_CABALLERO = 50;
	public static final int DEFENSA_CABALLERO = 0;
	public static final int SALUD_CABALLERO = 200;
	public static final int DISTANCIA_MIN_CABALLERO = 1;
	public static final int DISTANCIA_MAX_CABALLERO = 2;

	/**
	 * Constructor de la clase Caballero
	 * 
	 * @param distancia
	 */
	public Caballero(Distancia distancia) {
		super(distancia);
		this.ataque = ATAQUE_CABALLERO;
		this.defensa = DEFENSA_CABALLERO;
		this.distancia = distancia;
		this.listaItem = new ArrayList<ItemDecorator>();
		this.salud = SALUD_CABALLERO;
		this.distanciaMin = DISTANCIA_MIN_CABALLERO;
		this.distanciaMax = DISTANCIA_MAX_CABALLERO;
		this.ataquesRecibidos = 0;
		this.caballoRebelde = false;
	}

	/**
	 * Preguntamos si el caballo esta rebelde o no
	 * 
	 * @return
	 */
	public boolean isCaballoRebelde() {
		return caballoRebelde;
	}

	/**
	 * Metodo que muestra el estado completo del caballero
	 */
	public void estadoCaballero() {
		System.out.println("Salud             --> " + this.getSalud());
		System.out.println("Defensa           --> " + this.getDefensa());
		System.out.println("Ataque            --> " + this.getAtaque());
		System.out.println("CaballoRebelde    --> " + this.isCaballoRebelde());

		if (this.getListaItem().size() > 0) {
			for (int i = 0; i < this.getListaItem().size(); i++) {
				System.out.println("Item         --> "
						+ this.getListaItem().get(i));
			}
		} else {
			System.out.println("Item           --> 0");

		}

	}

	/**
	 * Sobreescribo el metodo pocion de agua para que el caballo vuleva a su
	 * estado normal
	 */
	@Override
	public void pocionAgua() {
		this.caballoRebelde = false;
		this.ataquesRecibidos = 0;

	}

	/**
	 * Sobreescribo el metodo atacar segun la forma de combate del caballero
	 */
	@Override
	public boolean atacar(UnidadTemplate enemigo) {
		if (isCaballoRebelde() == false && distanciaDeAtaque(enemigo)) {
			enemigo.setSalud((int) ((enemigo.getSalud() - this.getAtaque()) + enemigo
					.getDefensa()));
			System.out.println("El Caballero ataco al "+enemigo.getClass().toString());
			this.ataquesRecibidos++;

			if (this.ataquesRecibidos >= 3 && isCaballoRebelde() == false) {
				this.caballoRebelde = true;
				this.ataquesRecibidos = 0;
			}
			return true;
		}
		return false;
	}

	/**
	 * Getters y Setters
	 */

	public void setCaballoRebelde(boolean caballoRebelde) {
		this.caballoRebelde = caballoRebelde;
	}

	public int getAtaquesRecibidos() {
		return ataquesRecibidos;
	}

	public void setAtaquesRecibidos(int ataquesRecibidos) {
		this.ataquesRecibidos = ataquesRecibidos;
	}

	@Override
	public double getEnergia() {
		return 0;
	}

}

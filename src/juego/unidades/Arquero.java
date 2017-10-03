package juego.unidades;

import java.util.ArrayList;

import juego.items.ItemDecorator;

public class Arquero extends UnidadTemplate {

	/**
	 * Atributo particular de la clase arquero
	 */
	private int flechas;

	/**    
	 * Valores iniciales de los arqueros
	 * 
	 * tomamomos como defensa inicial 0
	 */
	public static final int ATAQUE_ARQUERO = 5;
	public static final int DEFENSA_ARQUERO = 0;
	public static final int SALUD_ARQUERO = 50;
	public static final int FLECHAS_INICIALES = 20;
	public static final int DISTANCIA_MIN_ARQUERO = 2;
	public static final int DISTANCIA_MAX_ARQUERO = 5;

	/**
	 * Constructor de la clase Arquero
	 * 
	 * @param distancia
	 */
	public Arquero(Distancia distancia) {
		super(distancia);
		this.ataque = ATAQUE_ARQUERO;
		this.defensa = DEFENSA_ARQUERO;
		this.distancia = distancia;
		this.listaItem = new ArrayList<ItemDecorator>();
		this.salud = SALUD_ARQUERO;
		this.flechas = FLECHAS_INICIALES;
		this.distanciaMin = DISTANCIA_MIN_ARQUERO;
		this.distanciaMax = DISTANCIA_MAX_ARQUERO;
	}

	/**
	 * Metodo que informa el estado completo del arquero
	 * 
	 */
	@Override
	public void estadoUnidad() {
		System.out.println(" --- Estado Arquero ---");
		System.out.println("Flechas   --> " + this.getFlechas());
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
	 * Sobreescribo el metodo atacar segun la forma de combate del arquero
	 */
	@Override
	public boolean atacar(UnidadTemplate enemigo) {

		if (this.flechas > 0 && distanciaDeAtaque(enemigo)) {
			this.flechas--;
			enemigo.setSalud((int) ((enemigo.getSalud() - this.getAtaque()) + enemigo
					.getDefensa()));
			System.out.println("El Arquero ataco al "
					+ enemigo.getClass().toString());
			return true;
		}
		if (this.flechas <= 0)
			System.out.println("Ya no posee flechas para atacar");
		if (distanciaDeAtaque(enemigo) == false)
			System.out.println("No esta en rango para atacar.");
		return false;
	}

	/**
	 * El arquero puede recargar 6 flechas
	 */
	public void recargarFlechas() {
		this.flechas += 6;
	}

	/**
	 * Getters y Setters
	 */
	public int getFlechas() {
		return flechas;
	}

	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}

	public double getEnergia() {
		return 0;
	}

	@Override
	public void pocionAgua() {
		// TODO Auto-generated method stub
		
	}

}

package juego.unidades;

import java.util.ArrayList;

import juego.items.ItemDecorator;

public class Lancero extends UnidadTemplate{
	
	/**
	 * Valores iniciales de los lanceros
	 * 
	 * tomamomos como defensa inicial 0
	 */
	public static final int ATAQUE_LANCERO = 25;
	public static final int DEFENSA_LANCERO = 0;
	public static final int SALUD_LANCERO = 150;
	public static final int DISTANCIA_MIN_LANCERO = 1;
	public static final int DISTANCIA_MAX_LANCERO = 3;


	/**
	 * Constructor de la clase Lancero
	 * @param distancia
	 */
	public Lancero(Distancia distancia) {
		super(distancia);
		this.ataque=ATAQUE_LANCERO;
		this.defensa = DEFENSA_LANCERO;
		this.distancia = distancia;
		this.listaItem = new ArrayList<ItemDecorator>();
		this.salud = SALUD_LANCERO;
		this.distanciaMin = DISTANCIA_MIN_LANCERO;
		this.distanciaMax = DISTANCIA_MAX_LANCERO;
	}

	/**
	 * Metodo que muestra el estado completo del Lancero
	 */
	@Override
	public void estadoUnidad() {
		System.out.println(" --- Estado Lancero ---");
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
	 * Sobreescribo el metodo atacar segun la forma de combate del lancero
	 */
	@Override
	public boolean atacar(UnidadTemplate enemigo) {
		if (distanciaDeAtaque(enemigo)) {
			enemigo.setSalud((int) ((enemigo.getSalud() - this.getAtaque()) + enemigo.getDefensa()));
			System.out.println("El Lancero ataco al "+enemigo.getClass().toString());
			return true;
		}
		if (distanciaDeAtaque(enemigo)==false)
			System.out.println("No esta en rango para atacar.");
		return false;
	}

	public double getEnergia() {
		return 0;
	}

	@Override
	public void pocionAgua() {
		
	}
	
}

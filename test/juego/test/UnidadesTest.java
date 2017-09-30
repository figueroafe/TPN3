package juego.test;

import juego.unidades.Arquero;
import juego.unidades.Distancia;
import juego.unidades.Lancero;
import juego.unidades.Soldado;
import juego.unidades.UnidadTemplate;

import org.junit.Before;
import org.junit.Test;

public class UnidadesTest {

	UnidadTemplate soldado1;
	UnidadTemplate soldado2;
	
	UnidadTemplate arquero1;
	UnidadTemplate arquero2;

	UnidadTemplate lancero1;;
	UnidadTemplate lancero2;

	Distancia distancia;
	Distancia distancia2;

	@Before
	public void setUp() {
		distancia = new Distancia(2, 1);
		distancia2 = new Distancia(1, 1);

		soldado1 = new Soldado(distancia);
		soldado2 = new Soldado(distancia2);
		arquero1 = new Arquero(distancia);
		arquero2 = new Arquero(distancia);
		lancero1 = new Lancero(distancia);
		lancero2 = new Lancero(distancia);

	}

	@Test
	public void testDeEstadoInicalSoldado() {
	
	}
	

}

package juego.test;

import juego.unidades.Arquero;
import juego.unidades.Distancia;
import juego.unidades.Lancero;
import juego.unidades.Pocion;
import juego.unidades.Soldado;
import juego.unidades.Caballero;
import juego.unidades.UnidadTemplate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnidadesTest {

	UnidadTemplate soldado1;
	UnidadTemplate soldado2;

	UnidadTemplate arquero1;
	UnidadTemplate arquero2;

	UnidadTemplate lancero1;;
	UnidadTemplate lancero2;

	UnidadTemplate caballero1;
	UnidadTemplate caballero2;

	Distancia distancia;
	Distancia distancia2;

	@Before
	public void setUp() {
		distancia = new Distancia(2, 1);
		distancia2 = new Distancia(1, 1);

		soldado1 = new Soldado(distancia);
		soldado2 = new Soldado(distancia2);
		arquero1 = new Arquero(new Distancia(4, 1));
		arquero2 = new Arquero(new Distancia(4, 1));
		lancero1 = new Lancero(distancia);
		lancero2 = new Lancero(distancia2);
		caballero1 = new Caballero(distancia);
		caballero2 = new Caballero(distancia2);

	}

	/**
	 * Testeo el estado inicial de todas las unidades
	 */
	@Test
	public void testDeEstadoInicalSoldado() {
		Assert.assertEquals(200, soldado1.getSalud(), 0);
		Assert.assertEquals(100, soldado1.getEnergia(), 0);
		Assert.assertEquals(10, soldado1.getAtaque(), 0);

	}

	@Test
	public void testDeEstadoInicialArquero() {
		Assert.assertEquals(50, arquero1.getSalud(), 0);
		// Assert.assertEquals(20, arquero1.getFlechas(), 0);
		Assert.assertEquals(5, arquero1.getAtaque(), 0);

	}

	@Test
	public void testDeEstadoInicialLancero() {
		Assert.assertEquals(150, lancero1.getSalud(), 0);
		Assert.assertEquals(25, lancero1.getAtaque(), 0);

	}
	
	@Test
	public void testDeEstadoInicialCaballero() {
		Assert.assertEquals(200, caballero1.getSalud(), 0);
		Assert.assertEquals(50, caballero1.getAtaque(), 0);
	}
	
	
	/**
	 * Testeo de los ataques entre las mismas unidades
	 */
	
	@Test
	public void testDeAtaqueEntreSoldados() {
		int cantAtaque = 0;
		while(soldado1.getEnergia() != 0) {
			soldado1.atacar(soldado2);
			cantAtaque++;
		}
			
		Assert.assertEquals(0, soldado1.getEnergia(), 0);
		Assert.assertEquals(100, soldado2.getSalud(), 0);
		Assert.assertEquals(10, cantAtaque);
		System.out.println("Soldado 1 sin energia:"+ soldado1.getEnergia());
		System.out.println("Soldado 2 con saludo luego del ataque:"
							+ soldado2.getEnergia());
		System.out.println("Ataques del soldado uno 1 existos:"+ cantAtaque);
	}
	
	@Test
	public void testDeAtaqueEntreSoldadosYPocionDeAgua() {
		int cantAtaque = 0;
		while(soldado1.getEnergia() != 0) {
			soldado1.atacar(soldado2);
			cantAtaque++;
		}
			
		Assert.assertEquals(0, soldado1.getEnergia(), 0);
		Assert.assertEquals(100, soldado2.getSalud(), 0);
		
		soldado1.pocionAgua();
		
		Assert.assertEquals(100, soldado1.getEnergia(), 0);

	}
	
	
	@Test 
	public void testDeAtaqueEntreArqueros() {
		int flechas = 0;
		while(((Arquero) arquero1).getFlechas() > 0) {
			arquero1.atacar(arquero2);
			flechas++;
		}
		
		Assert.assertEquals(0, arquero1.getEnergia(), 0);
	}
}

package juego.test;

import juego.items.Capa;
import juego.items.Escudo;
import juego.items.ItemInterfaz;
import juego.items.Punial;
import juego.unidades.Arquero;
import juego.unidades.Caballero;
import juego.unidades.Distancia;
import juego.unidades.Lancero;
import juego.unidades.Soldado;
import juego.unidades.UnidadTemplate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnidadesConItemTest {
	
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
		arquero1 = new Arquero(distancia);
		arquero2 = new Arquero(distancia2);
		lancero1 = new Lancero(distancia);
		lancero2 = new Lancero(distancia2);
		caballero1 = new Caballero(distancia);
		caballero2 = new Caballero(distancia2);
	}

	@Test
	public void testUnidadConEscudo() {

		soldado1 = new Escudo(soldado1);
		
		Assert.assertEquals(10, soldado1.getAtaque(), 0);
		Assert.assertEquals(0.6, soldado1.getDefensa(), 0);
		Assert.assertEquals(100, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);

	}

	@Test
	public void testUnidadConCapa() {

		soldado1 = new Capa(soldado1);
		
		Assert.assertEquals(9.09, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(0.0, soldado1.getDefensa(), 0);
		Assert.assertEquals(200, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testUnidadConPunial() {

		soldado1 = new Punial(soldado1);
		
		Assert.assertEquals(13, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-3, soldado1.getDefensa(), 0);
		Assert.assertEquals(100, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testUnidadConEscudoMasCapa() {

		soldado1 = new Escudo(soldado1);
		soldado1 = new Capa(soldado1);
				
		Assert.assertEquals(9.09, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(0.6, soldado1.getDefensa(), 0);
		Assert.assertEquals(200, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testUnidadConEscudoMasPunial() {

		soldado1 = new Escudo(soldado1);
		soldado1 = new Punial(soldado1);
				
		Assert.assertEquals(13, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-2.4, soldado1.getDefensa(), 0);
		Assert.assertEquals(100, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testUnidadConCapaMasPunial() {

		soldado1 = new Capa(soldado1);
		soldado1 = new Punial(soldado1);
		
		
		Assert.assertEquals(12.09, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-3, soldado1.getDefensa(), 0);
		Assert.assertEquals(200, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testUnidadConEscudoMasPunialMasCapa() {

		soldado1 = new Escudo(soldado1);
		soldado1 = new Punial(soldado1);
		soldado1 = new Capa(soldado1);
				
		Assert.assertEquals(11.81, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-2.4, soldado1.getDefensa(), 0);
		Assert.assertEquals(200, soldado1.getEnergia(), 0);
		Assert.assertEquals(200, soldado1.getSalud(), 0);
	}

	@Test
	public void testAtacarUnidadConEscudoMasPunialMasCapa() {

		soldado1 = new Escudo(soldado1);
		soldado1 = new Punial(soldado1);
		soldado1 = new Capa(soldado1);
		
		soldado1.atacar(soldado2);
		
		Assert.assertEquals(11.81, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-2.4, soldado1.getDefensa(), 0);
		Assert.assertEquals(180, soldado1.getEnergia(), 0);
		Assert.assertEquals(190, soldado2.getSalud(), 0);
	}

	@Test
	public void testAtacarUnidadConEscudoMasPunial() {

		soldado1 = new Escudo(soldado1);
		soldado1 = new Punial(soldado1);
		
		soldado1.atacar(soldado2);
		
		System.out.println("defensa " + soldado2.getDefensa());
		System.out.println("ataque " + soldado2.getAtaque());
		System.out.println("energia " + soldado2.getEnergia());
		System.out.println("salud " + soldado2.getSalud());
		
		Assert.assertEquals(13, soldado1.getAtaque(), 0.111);
		Assert.assertEquals(-2.4, soldado1.getDefensa(), 0);
		Assert.assertEquals(90, soldado1.getEnergia(), 0);
		Assert.assertEquals(190, soldado2.getSalud(), 0);
	}


}

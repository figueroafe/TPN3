package juego.test;

import juego.items.Escudo;
import juego.items.ItemInterfaz;
import juego.unidades.Arquero;
import juego.unidades.Distancia;
import juego.unidades.Soldado;
import juego.unidades.UnidadTemplate;

import org.junit.Before;
import org.junit.Test;

public class UnidadesConItemTest {

	UnidadTemplate soldado1;
	UnidadTemplate soldado2;
	UnidadTemplate arquero;
	Distancia distancia;
	Distancia distancia2;

	@Before
	public void setUp() {
		distancia = new Distancia(2, 1);
		distancia2 = new Distancia(1, 1);

		soldado1 = new Soldado(distancia);
		soldado2 = new Soldado(distancia2);
		arquero = new Arquero(distancia);
	}

	@Test
	public void testUnidad() {
		
		ItemInterfaz soldadoEscudo = new Soldado(distancia);
		soldadoEscudo = new Escudo(soldadoEscudo);
		
		soldado1.atacar(soldado2);
		soldado1.atacar(soldado2);

		System.out.println("defensa: "+ soldadoEscudo.getDefensa());
	//	soldado1.atacar( soldadoEscudo);
		
		soldado1.estadoUnidad();
		System.out.println("Soldados 2");
		soldado2.estadoUnidad();

//		arquero.estadoUnidad();

	}

}

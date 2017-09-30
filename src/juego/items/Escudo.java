package juego.items;

public class Escudo extends ItemDecorator {

	public Escudo(ItemInterfaz item) {
		super(item);
	}

	@Override
	public double getEnergia() {
		return this.getItemInterfaz().getEnergia();
	}

	@Override
	public double getDefensa() {
		return this.getItemInterfaz().getDefensa() * 1.60;
	}

	@Override
	public double getAtaque() {
		return this.getItemInterfaz().getAtaque();
	}

}

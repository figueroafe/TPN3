package juego.items;

public class Capa extends ItemDecorator {

	public Capa(ItemInterfaz item) {
		super(item);
	}

	@Override
	public double getEnergia() {
		return this.getItemInterfaz().getEnergia() * 2;
	}

	@Override
	public double getDefensa() {
		return this.getItemInterfaz().getDefensa();
	}

	@Override
	public double getAtaque() {
		return this.getItemInterfaz().getAtaque() / 1.10;
	}
}

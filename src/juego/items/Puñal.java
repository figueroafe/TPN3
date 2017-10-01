package juego.items;

public class Pu�al extends ItemDecorator {

	public Pu�al(ItemInterfaz item) {
		super(item);
	}

	@Override
	public double getEnergia() {
		return this.getItemInterfaz().getEnergia();
	}

	@Override
	public double getDefensa() {
		return this.getItemInterfaz().getDefensa() - 3;

	}

	@Override
	public double getAtaque() {
		return this.getItemInterfaz().getAtaque() - 3;
	}

}

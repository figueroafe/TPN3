package juego.items;

public class Puñal extends ItemDecorator {

	public Puñal(ItemInterfaz item) {
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

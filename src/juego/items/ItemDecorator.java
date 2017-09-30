package juego.items;

import juego.unidades.Distancia;
import juego.unidades.UnidadTemplate;

public abstract class ItemDecorator implements ItemInterfaz{

	private ItemInterfaz itemInterfaz;
	protected String nombreItem;
	
	public ItemDecorator(ItemInterfaz item) {
		this.setItemInterfaz(item);
	}

	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public ItemInterfaz getItemInterfaz() {
		return itemInterfaz;
	}

	public void setItemInterfaz(ItemInterfaz itemInterfaz) {
		this.itemInterfaz = itemInterfaz;
	}

	



}

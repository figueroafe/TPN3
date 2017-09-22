package juego.rpg;

public class Personaje {
	private double danio;
	private double salud;
	private double attack;
	private double distancia;
	private double pocion[];

	public Personaje(double[] pocion) {
		super();
		this.pocion = pocion;
	}

	public double[] getPocion() {
		return pocion;
	}

	public void setPocion(double[] pocion) {
		this.pocion = pocion;
	}

	public double getDanio() {
		return danio;
	}

	public Personaje(double danio, double salud, double attack, double distancia) {
		super();
		this.danio = danio;
		this.salud = salud;
		this.attack = attack;
		this.distancia = distancia;
	}

	public void setDanio(double danio) {
		this.danio = danio;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}

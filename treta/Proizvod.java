package treta;

public class Proizvod {
	private String ime;
	private int cena;
	private String proizvoditel;
	private int tezina;

	public Proizvod(String ime, int cena, String proizvoditel, int tezina) {
		this.ime="Smoki";
		this.cena=45;
		this.proizvoditel="Vitaminka";
		this.tezina=150;
		

	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public String getProizvoditel() {
		return proizvoditel;
	}

	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

}

package Cetvrta;

public class Avtomobil {
	private String marka;
	private String model;
	private double pominatiKm;
	private String boja;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Avtomobil(String marka, String model, double pominatiKm, String boja) {
		this.marka=marka;
		this.model=model;
		this.pominatiKm=pominatiKm;
		this.boja=boja;
	}
	public int mnozenje(int pomnoziKm) {
	int m;	
	m = (int) (pominatiKm*pomnoziKm);
	return m;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public double getPominatiKm() {
		return pominatiKm;
	}

	public void setPominatiKm(double pominatiKm) {
		this.pominatiKm = pominatiKm;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

}

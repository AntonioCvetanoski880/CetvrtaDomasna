package Cetvrta;

public class Main {

	public static void main(String[] args) {
		Avtomobil kola = new Avtomobil("Toyota","Corola",5600,"Plava");
		System.out.println("Imeto e "+kola.getMarka());
		System.out.println("Markata e "+kola.getModel());
		System.out.println("Bojata e "+kola.getBoja());
		System.out.println("Pominati kilometri "+kola.getPominatiKm()+" a pomnozenite se "+kola.mnozenje(100));
	}
}

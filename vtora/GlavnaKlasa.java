package vtora;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Restoran b = new Restoran();
		b.setIme("Lacio");
		b.setLokacija("Bulevard Prilep");
		b.setTelefBroj("078-546-897");
		b.setBrojSedista(150);
		
		
		System.out.println(b.getIme());
		System.out.println(b.getLokacija());
		System.out.println(b.getTelefBroj());
		System.out.println(b.getBrojSedista());

	}

}

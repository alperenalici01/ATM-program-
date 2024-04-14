package alperen;

public class hesap {

	private String kullaniciAdi; 
	private String parola;
	private int bakiye;
	
	public hesap(String kullaniciAdi, String parola, int bakiye) {
		this.setBakiye(bakiye);
		this.setKullaniciAdi(kullaniciAdi);
		this.setParola(parola);	
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYartir(int tutar) {
		bakiye+= tutar;
		System.out.println("yeni bakiyeniz"+bakiye);
		
	}
	public void paraCek(int tutar) {
		if (bakiye-tutar < 0) {
			System.out.println("yeterli bakiyeniz bulunmamakta bakiyeniz : "+ bakiye);
		}else {
			bakiye-=tutar;
			System.out.println("yeni bakiyeniz"+bakiye);
		}
	}
	
	
	
}

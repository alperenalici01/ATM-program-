package alperen;

public class maina {

	public static void main(String[] args) {
		atm atm = new atm();
		hesap hesap = new hesap("alperen", "312312", 23121);
		atm.calis(hesap);
		System.out.println("programdan çıkılıyor....");

	}

}

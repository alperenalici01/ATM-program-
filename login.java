package alperen;
import java.util.Scanner;
public class login {

	public boolean login (hesap hesap) {
	    Scanner sc = new Scanner(System.in);
		String parola;
		String kullaniciAdi;
		
		System.out.println("kullanıcı adınız: ");
		kullaniciAdi = sc.nextLine();
		System.out.println("Şifreniz: ");
		parola = sc.nextLine();
		if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
			System.out.println("kullanıcı adınız doğru");
			System.out.println("parolanız doğru");
			return true;
		}else {
			System.out.println("kullanıcı adınız yanlıştır..");
			System.out.println("parolanız yanlıştır.");
			return false;
		}
	
	}
}

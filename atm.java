package alperen;
import java.util.Scanner;
public class atm {

	public void calis(hesap hesap) {
		login login =new login();
		Scanner sc= new Scanner(System.in);
		System.out.println("bankaya hoşgeldiniz");
		int girisHakki=3;
		
		while(true) {
			if(login.login(hesap)) {
				System.out.println("giriş başarılı");
				break;
			}else {
				System.out.println("giriş başarısız");
				girisHakki--;
				System.out.println("giriş hakkınız"+girisHakki);
			}
			if(girisHakki == 0) {
				
				System.out.println("giriş hakkınız kalmamıştır programdan çıkılıyor.");
				return;
			}
	
			
		}
		String islemler="1. bakiye görüntüle/n"
				+ "2. para yatırma/n"
				+ "3. para çekme/n"
				+ "çıkış icin q ya basınız.";
		System.out.println(islemler);
		
		while(true) {
			System.out.println("işlemleri seçiniz");
			String islem=sc.nextLine();
			if(islem.equals("q")) {
				break;
				
			}else if(islem.equals("1")) {
				System.out.println("bakiyeniz:"+hesap.getBakiye());
							
			}else if(islem.equals("2")) {
				System.out.println("para yatırılacak mikratı giriniz");
				int tutar = sc.nextInt();
				sc.nextLine();
				hesap.paraYartir(tutar);
		
			}else if(islem.equals("3")) {
				System.out.println("para çekilecek miktarı giriniz:");
			int tutar=sc.nextInt();
			hesap.paraCek(tutar);
			
			}else {
				System.out.println("işleminiz geçersizdir");
			
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}

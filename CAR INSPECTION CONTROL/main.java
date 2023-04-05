package XII_HAFTA_ARAC_MUAYENE;

import java.time.LocalDate;
import java.util.Scanner;

import VIIII_HAFTA.Tasit;
import XII_HAFTA_ARAC_MUAYENE.Tasitlar.Marka;
import objects.Araba;

public class main {

	public enum Tur{
		OTOMOBÝL(1), KAMYONET(2), MOTORSIKLET(3);
		public int tur;

		Tur(int tur) {
			this.tur = tur;
		}
		public int getTur() {
			return tur;
		}
	}
	
	public static void main(String[] args) {
		Tasitlar tasit = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tur seciniz:");
		for(Tur tur: Tur.values())
			System.out.println(tur + " " + tur.getTur());
		int tur = scanner.nextInt();
		switch (tur) {
		case 1:
			tasit = otomobilOlustur(scanner);
			break;
		case 2:
			tasit = kamyonetOlustur(scanner);
			break;
		case 3:
			tasit = motorsikletOlustur(scanner);
			break;
		}
		while(true) {
			System.out.println("1-Yýllýk Bakým Geçti Mi ?, 2-Muayene Geçti Mi ? ,"
					+ "3-Son Bakýma Kalan Gün,4-Muayeneye Kalan Süre,5-Hurda Mý ,10-Muayene Yap, 99-Çýkýþ");
			int secim = scanner.nextInt();
			if(secim==99)
				break;
			else if (secim==1) {
				boolean kontrol = tasit.yillikBakimGectiMi();
				System.out.println(kontrol);
			}
			else if (secim==2) {
				boolean kontrol = tasit.muayeneGectiMi();
				System.out.println(kontrol);
			}
			else if (secim==3) {
				int sure = tasit.yillikBakimaKalanSure();
				System.out.println(sure);
			}
			else if (secim==4) {
				int muayeneSure = tasit.muayeneyeKalanSure();
				System.out.println(muayeneSure);
			}
			else if (secim==5) {
				boolean kontrol = tasit.hurdaMi();
				System.out.println(kontrol);
			}
			else if (secim==6) {
				System.out.println("Km artýþ gir");
				int miktar = scanner.nextInt();
				tasit.kmArttýr(miktar);
				System.out.println(tasit.getKm());
			}
			else if (secim==7) {
				tasit.yuzbinBakimYap();
				System.out.println(tasit.getSonYuzbinBakimKmsi());
			}
			else if (secim==8) {
				int sure = tasit.yuzbinKalanSure();
				System.out.println(sure);
			}
			else if (secim==9) {
				Boolean kontrol = tasit.klasikMi();
				System.out.println(kontrol);
			}
		}
	}
		
		
		private static Tasitlar motorsikletOlustur(Scanner scanner) {
			System.out.println("Motorsiklet Model Seçiniz:");
			  for (Marka m : Marka.values()) {
			        if (m == Marka.YAMAHA || m == Marka.KUBA) {
			            System.out.println(m.getMarka());
			        }
			    }
			String modelSecim = scanner.next();
			Marka mod=null;
			for(Marka m: Marka.values()) {
				if(m.getMarka().equals(modelSecim))
					mod=m;
			}
			System.out.println("Km Giriniz : ");
			int km = scanner.nextInt();
			System.out.println("Aracýn Yýlý :");
			String yil = scanner.next();
			LocalDate yili = LocalDate.parse(yil);
			System.out.println("Son Bakým Tarihi Giriniz :");
			String sonBakim = scanner.next();
			LocalDate sonBakimi = LocalDate.parse(sonBakim);
			System.out.println("Son Muayene Tarihi Giriniz :");
			String sonMuayene = scanner.next();
			LocalDate sonMuayenesi = LocalDate.parse(sonMuayene);
			System.out.println("Son Yüz Bin Bakým Tarihi Giriniz :");
			int yuzBinBakim = scanner.nextInt();
			Motorsiklet motorsiklet = new Motorsiklet(km, yili, mod, sonBakimi, sonMuayenesi, yuzBinBakim);
		return motorsiklet;
	}


		private static Tasitlar kamyonetOlustur(Scanner scanner) {
			System.out.println("Kamyonet Model Seçiniz:");
			
			  for (Marka m : Marka.values()) {
			        if (m == Marka.VOLVO || m == Marka.SCANIA) {
			            System.out.println(m.getMarka());
			        }
			    }
				
			String modelSecim = scanner.next();
			Marka mod=null;
			for(Marka m: Marka.values()) {
				if(m.getMarka().equals(modelSecim))
					mod=m;
			}
			System.out.println("Km Giriniz : ");
			int km = scanner.nextInt();
			System.out.println("Aracýn Yýlý :");
			String yil = scanner.next();
			LocalDate yili = LocalDate.parse(yil);
			System.out.println("Son Bakým Tarihi Giriniz :");
			String sonBakim = scanner.next();
			LocalDate sonBakimi = LocalDate.parse(sonBakim);
			System.out.println("Son Muayene Tarihi Giriniz :");
			String sonMuayene = scanner.next();
			LocalDate sonMuayenesi = LocalDate.parse(sonMuayene);
			System.out.println("Son Yüz Bin Bakým Tarihi Giriniz :");
			int yuzBinBakim = scanner.nextInt();
			Kamyonet kamyonet = new Kamyonet(km, yili, mod, sonBakimi, sonMuayenesi, yuzBinBakim);
		return kamyonet;
	}
	


		private static Otomobil otomobilOlustur(Scanner scanner) {
			System.out.println("Model seciniz:");
			  for (Marka m : Marka.values()) {
			        if (m == Marka.ASTRA || m == Marka.CORSA || m == Marka.POLO) {
			            System.out.println(m.getMarka());
			        }
			    }
			String modelSecim = scanner.next();
			Marka mod=null;
			for(Marka m: Marka.values()) {
				if(m.getMarka().equals(modelSecim))
					mod=m;
			}
			System.out.println("Km Giriniz : ");
			int km = scanner.nextInt();
			System.out.println("Aracýn Yýlý :");
			String yil = scanner.next();
			LocalDate yili = LocalDate.parse(yil);
			System.out.println("Son Bakým Tarihi Giriniz :");
			String sonBakim = scanner.next();
			LocalDate sonBakimi = LocalDate.parse(sonBakim);
			System.out.println("Son Muayene Tarihi Giriniz :");
			String sonMuayene = scanner.next();
			LocalDate sonMuayenesi = LocalDate.parse(sonMuayene);
			System.out.println("Son Yüz Bin Bakým Tarihi Giriniz :");
			int yuzBinBakim = scanner.nextInt();
			Otomobil otomobil = new Otomobil(km, yili, mod, sonBakimi, sonMuayenesi, yuzBinBakim);
		return otomobil;
	}



		
		
		
		
		
	}



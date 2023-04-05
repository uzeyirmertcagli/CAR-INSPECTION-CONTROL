package XII_HAFTA_ARAC_MUAYENE;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Kamyonet extends Tasitlar{

	public Kamyonet(int km, LocalDate yil, Marka marka, LocalDate sonBakim, LocalDate sonMuayene,
			int sonYuzbinBakimKmsi) {
		super(km, yil, marka, sonBakim, sonMuayene, sonYuzbinBakimKmsi);
	}

	@Override
	public boolean yillikBakimGectiMi() {
		boolean kontrol = LocalDate.now().isAfter(sonBakim.plusYears(1));
		return kontrol;
	}

	@Override
	public int yillikBakimaKalanSure() {
		boolean kontrol = LocalDate.now().isAfter(sonBakim.plusYears(1));
		if (kontrol==false) {
			int sure = (int) LocalDate.now().until(sonBakim.plusYears(1),ChronoUnit.DAYS);
			return sure;
		} else {
			return 0;
		}
	}

	@Override
	public boolean muayeneGectiMi() {
		boolean kontrol = LocalDate.now().isAfter(sonBakim.plusYears(2));
		return kontrol;
	}

	@Override
	public int muayeneyeKalanSure() {
		boolean kontrol = LocalDate.now().isAfter(sonMuayene.plusYears(1));
		if (kontrol==false) {
			int sure = (int) LocalDate.now().until(sonMuayene.plusYears(1), ChronoUnit.DAYS);
			return muayeneyeKalanSure();
		} else {
			return 0;
		}
	}

	@Override
	public void kmArttýr(int kmArtisMiktari) {
		this.km+=kmArtisMiktari;
		
	}

	@Override
	public boolean yuzbinGectiMi() {
		if(this.km>this.sonYuzbinBakimKmsi+100000) {
			return true;
		} else {
		return false;
		}
	}

	@Override
	public void yuzbinBakimYap() {
		this.sonYuzbinBakimKmsi=this.km;
		
	}
	
	@Override
	public int yuzbinKalanSure() {
		if (this.km > this.sonYuzbinBakimKmsi+100000) {
			return 0;
		}else
		return this.sonYuzbinBakimKmsi+100000-this.km;
	}


	@Override
	public boolean hurdaMi() {
		boolean kontrol = LocalDate.now().isAfter(yil.plusYears(25));
		return kontrol;
	}

	@Override
	public boolean klasikMi() {
		boolean kontrol = LocalDate.now().isAfter(yil.plusYears(25));
		return kontrol;
	}

	

}

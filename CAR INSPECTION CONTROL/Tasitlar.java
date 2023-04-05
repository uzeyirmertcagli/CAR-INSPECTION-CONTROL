package XII_HAFTA_ARAC_MUAYENE;

import java.time.LocalDate;

public abstract class Tasitlar {


	
	public enum Marka {
		POLO("Polo"), CORSA("Corsa") , ASTRA("Astra") , VOLVO("Volvo") , SCANIA("Scania") , YAMAHA("Yamaha") , KUBA("Kuba");
		
		public String marka;

		Marka(String marka) {
			this.marka = marka;
		}

		public String getMarka() {
			return marka;
		}
	}
	
	

	
	public Tasitlar(int km, LocalDate yil, Marka marka, LocalDate sonBakim, LocalDate sonMuayene,
			int sonYuzbinBakimKmsi) {

		this.km = km;
		this.yil = yil;
		this.marka = marka;
		this.sonBakim = sonBakim;
		this.sonMuayene = sonMuayene;
		this.sonYuzbinBakimKmsi = sonYuzbinBakimKmsi;
	}
	protected int km;
	protected LocalDate yil;
	protected Marka marka;
	protected LocalDate sonBakim;
	protected LocalDate sonMuayene;
	protected int sonYuzbinBakimKmsi;
	
	public abstract boolean yillikBakimGectiMi();
	public abstract int yillikBakimaKalanSure();
	public abstract boolean muayeneGectiMi();
	public abstract int muayeneyeKalanSure();
	public abstract void kmArttýr(int kmArtisMiktari);
	public abstract boolean yuzbinGectiMi();
	public abstract int yuzbinKalanSure();
	public abstract boolean hurdaMi();
	public abstract boolean klasikMi();
	public abstract void yuzbinBakimYap();


	
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public LocalDate getYil() {
		return yil;
	}
	public void setYil(LocalDate yil) {
		this.yil = yil;
	}
	public Marka getMarka() {
		return marka;
	}
	public void setMarka(Marka marka) {
		this.marka = marka;
	}
	public LocalDate getSonBakým() {
		return sonBakim;
	}
	public void setSonBakým(LocalDate sonBakým) {
		this.sonBakim = sonBakým;
	}
	public LocalDate getSonMuayene() {
		return sonMuayene;
	}
	public void setSonMuayene(LocalDate sonMuayene) {
		this.sonMuayene = sonMuayene;
	}
	public int getSonYuzbinBakimKmsi() {
		return sonYuzbinBakimKmsi;
	}
	public void setSonYuzbinBakimKmsi(int sonYuzbinBakimKmsi) {
		this.sonYuzbinBakimKmsi = sonYuzbinBakimKmsi;
	}
	
}

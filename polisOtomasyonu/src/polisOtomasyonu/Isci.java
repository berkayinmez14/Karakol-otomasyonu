package polisOtomasyonu;

public class Isci extends Calisan{
	String gorevi;

	public Isci(String ad, String soyad, String telefon, String gorevi) {
		super(ad, soyad, telefon);
		this.gorevi = gorevi;
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}
	

}

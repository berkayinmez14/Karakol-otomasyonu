package polisOtomasyonu;

public class Polis extends Calisan{
	String birim,polisNo,gorev;

	public Polis(String ad, String soyad, String telefon, String birim, String polisNo, String gorev) {
		super(ad, soyad, telefon);
		this.birim = birim;
		this.polisNo = polisNo;
		this.gorev = gorev;
	}

	public String getBirim() {
		return birim;
	}

	public void setBirim(String birim) {
		this.birim = birim;
	}

	public String getPolisNo() {
		return polisNo;
	}

	public void setPolisNo(String polisNo) {
		this.polisNo = polisNo;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	

}

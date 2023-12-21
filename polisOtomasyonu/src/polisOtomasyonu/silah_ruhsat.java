package polisOtomasyonu;

public class silah_ruhsat extends Polis {
	String ruhsat;
	
	public String getRuhsat() {
		return ruhsat;
	}

	public void setRuhsat(String ruhsat) {
		this.ruhsat = ruhsat;
	}

	public silah_ruhsat(String ad, String soyad, String telefon, String birim, String polisNo, String gorev,
			String ruhsat) {
		super(ad, soyad, telefon, birim, polisNo, gorev);
		this.ruhsat = ruhsat;
	}

	public void ruhsat() {
		System.out.println("Silah sahibi:Aydın Engin");
		System.out.println("Silah türü:Yivsiz Tüfek");
		System.out.println("Markası:A.Zoli");
		System.out.println("Seri numarası:199-I19YT-00000099");
		System.out.println("Kalibresi:8 KALİBRE");
		System.out.println("Kalan ruhsat süresi:3 yıl-5 ay");
		System.out.println();
		System.out.println("Silah sahibi:Semih Arslan");
		System.out.println("Silah Türü:Havalı Nişan Tüfeği(Kırma)");
		System.out.println("Markası:ACIER");
		System.out.println("Seri numarası:142-G19HT-0000001");
		System.out.println("Kalibresi:7.62 MM");
		System.out.println("Kalan ruhsat süresi:1 yıl-3 ay");
		
	}

}

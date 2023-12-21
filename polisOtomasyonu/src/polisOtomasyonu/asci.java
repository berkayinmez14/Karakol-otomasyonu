package polisOtomasyonu;

public class asci extends Isci {
	String yemek;

	public asci(String ad, String soyad, String telefon, String gorevi, String yemek) {
		super(ad, soyad, telefon, gorevi);
		this.yemek = yemek;
	}

	public String getYemek() {
		return yemek;
	}

	public void setYemek(String yemek) {
		this.yemek = yemek;
	}
	
	public void yemek() {
		System.out.println("İşe giriş yılı:2011");
		System.out.println("Maaş:18000 TL");
		System.out.println("Sabahları için börek ve çörek hazırlar");
		System.out.println("Öğlenleri için makarna ve köfte hazırlar");
		System.out.println("Akşamları için ıspanak ve ali nazik hazırlar");
	}

}

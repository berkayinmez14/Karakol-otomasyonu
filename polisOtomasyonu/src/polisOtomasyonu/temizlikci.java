package polisOtomasyonu;

public class temizlikci extends Isci{
	String temizlikci,cayci;

	public temizlikci(String ad, String soyad, String telefon, String gorevi, String temizlikci, String cayci) {
		super(ad, soyad, telefon, gorevi);
		this.temizlikci = temizlikci;
		this.cayci = cayci;
	}

	public String getTemizlikci() {
		return temizlikci;
	}

	public void setTemizlikci(String temizlikci) {
		this.temizlikci = temizlikci;
	}

	public String getCayci() {
		return cayci;
	}

	public void setCayci(String cayci) {
		this.cayci = cayci;
	}
	public void temizlik() {
		System.out.println("İşe Giriş yılı:2005");
		System.out.println("Maaşı:16900 TL");
		System.out.println("Sabahları 1.kattatik büroları temizler");
		System.out.println("Öğlenleri 2.kattaki büroları temizler");
		System.out.println("Öğlenleri 3.kattaki büroları temizler");
	}
	
	public void cay() {
		System.out.println("İşe giriş yılı:2007");
		System.out.println("Maaşı:11500 TL");
		System.out.println("Bütün birimlere çay vb. şeyler götürmekle hükümlüdür");
	}

}

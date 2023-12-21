package polisOtomasyonu;

public class asayisSube extends Polis{
	String hirsiz,dolandirici;

	public asayisSube(String ad, String soyad, String telefon, String birim, String polisNo, String gorev,
			String hirsiz, String dolandirici) {
		super(ad, soyad, telefon, birim, polisNo, gorev);
		this.hirsiz = hirsiz;
		this.dolandirici = dolandirici;
	}

	public String getHirsiz() {
		return hirsiz;
	}

	public void setHirsiz(String hirsiz) {
		this.hirsiz = hirsiz;
	}

	public String getDolandirici() {
		return dolandirici;
	}

	public void setDolandirici(String dolandirici) {
		this.dolandirici = dolandirici;
	}
	public void hirsiz() {
		System.out.println("1.Suçlunun bilgileri");
		System.out.println("Adı-Soyadı:Ahmet Tosun");
		System.out.println("TC NO:34670426418");
		System.out.println("Geçmiş suçlar:Dolandırıcılık,hırsızlık,insan tüccarlığı");
		System.out.println("Baba adı:Mehmet");
		System.out.println("Anne adı:Makbule");
		System.out.println("21/04/1981");
		System.out.println();
		System.out.println("2.Suçlunun bilgileri");
		System.out.println("Adı-Soyadı:İrfan Baş");
		System.out.println("TC NO:18293672324");
		System.out.println("Geçmiş suçlar:Kuyumcu soygunu,müze soygunu");
		System.out.println("Baba adı:Rahmi");
		System.out.println("Anne adı:Latife");
		System.out.println("7/10/1973");
	}
	
	public void dolandirici() {
		System.out.println("1.Suçlunun bilgileri");
		System.out.println("Adı-Soyadı:Engin Polat");
		System.out.println("TC NO:67480345180");
		System.out.println("Geçmiş suçlar:Darp");
		System.out.println("Baba adı:Sezgin");
		System.out.println("Anne adı:Şükran");
		System.out.println("3/6/1988");
		System.out.println();
		System.out.println("2.Suçlunun bilgileri");
		System.out.println("Adı-Soyadı:Dilan Polat");
		System.out.println("TC NO:41325773666");
		System.out.println("Geçmiş suçlar:YOK");
		System.out.println("Baba adı:Rıfat Doğu");
		System.out.println("Anne adı:Hüsniye Doğu");
		System.out.println("21/07/1990");
		
	}

}

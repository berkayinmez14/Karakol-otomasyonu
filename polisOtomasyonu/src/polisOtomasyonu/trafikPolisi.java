package polisOtomasyonu;
import java.util.Scanner;
public class trafikPolisi extends Polis {
	String cezaYazma;
	String denetim;
	
	public trafikPolisi(String ad, String soyad, String telefon, String birim, String polisNo, String gorev,
			String cezaYazma, String denetim) {
		super(ad, soyad, telefon, birim, polisNo, gorev);
		this.cezaYazma = cezaYazma;
		this.denetim = denetim;
	}

	public String getCezaYazma() {
		return cezaYazma;
	}

	public void setCezaYazma(String cezaYazma) {
		this.cezaYazma = cezaYazma;
	}
	
	public String getDenetim() {
		return denetim;
	}

	public void setDenetim(String denetim) {
		this.denetim = denetim;
	}
	
	public void ceza() {//araba
		System.out.println("Araba 1");
		System.out.println("Sahibi:Muzaffer Ertaş");
		System.out.println("Araç plakası:08 ERA 229");
		System.out.println("Araba modeli:BMW");
		System.out.println("Ceza sebebi:Aşırı hız yapma");
		System.out.println("Ceza ücreti: 3136 TL");
		System.out.println();
		System.out.println("Araba 2");
		System.out.println("Sahibi:Emre Aslan");
		System.out.println("Araç plakası:16 GB 13");
		System.out.println("Araç modeli:Tofaş");
		System.out.println("Ceza sebebi:Engelli yerine park");
		System.out.println("Ceza ücreti:873 TL");
	}
	public void denetim() {
		System.out.println("Kişi 1");
		System.out.println("Adı-Soyadı:Saliha Sirkeci");
		System.out.println("Ceza sebebi:Yere sigara izmariti atmak");
		System.out.println("Ceza Ücreti:3036 TL");
		System.out.println();
		System.out.println("Kişi 2");
		System.out.println("Adı-Soyadı:Mehmet Sakızcı");
		System.out.println("Ceza sebebi:Trafik magandalığı");
		System.out.println("Ceza ücreti:14061 TL");
	}

}

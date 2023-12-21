package polisOtomasyonu;
import java.util.Scanner;
public class Main {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int secenek;
		do{
			menu();
			System.out.println("Emniyet Müdürlüğü birim yönlendirme sistemine hoş geldiniz..");
			secenek=secim();
			secenekKontrol(secenek);
			if(secenek==5) {
				break;
			}
			menuYonlendirme();
		}while(secenek!=5);
		
	}
	
	public static void menu() { 
		System.out.println();
		System.out.println("***MENÜ***");
		System.out.println("1-Trafik Birimi");
		System.out.println("2-Silah Ruhsat Birimi");
		System.out.println("3-Asayiş Şube Birimi");
		System.out.println("4-Çalışan İşçi Birimi");
		System.out.println("5-Çıkış işlemi");
	}
	
	public static int secim() {
		int secenek;
		System.out.print("Girmek istediğiniz birimi girin:");
		secenek=input.nextInt();
		return secenek;
	
		}
	
	public static void secenekKontrol(int secenek) {
		if(secenek==1) {
			trafik();
		}else if(secenek==2) {
			slhRhst();
		}else if(secenek==3) {
			asayis();
		}else if(secenek==4) {
			isci();
		}else if(secenek==5) {
			System.out.println("Çıkış yapılıyor");
		}else {
			System.out.println("Yanlış bir seçenek seçtiniz.Lütfen tekrar deneyiniz..");
		}
			
		
	}	
		
	public static void trafik() {
		System.out.println("Trafik birimine hoş geldiniz...");
		trafikPolisi p1 = new trafikPolisi("Serkan ","Korkmaz ","55500011122 ","Trafik ","450314 ","ceza yazma ","Araba","Denetim yeri");
		trafikPolisi p2 = new trafikPolisi("Zeynep ", "Soysal ", "55500011133", "Trafik", "450329", "denetim", "Araba", "Kızılay Meydanı");
		System.out.println("Birimle ilgili polisinin adı ve soyadı:"+p1.getAd()+p1.getSoyad());
		System.out.println("Polisin Bölümü:"+p1.getBirim());
		System.out.println("Telefon numarası:"+p1.getTelefon());
		System.out.println("Polis Sicil Numarası:"+p1.getPolisNo());
		System.out.println("Bölümdeki görevi:"+p1.getGorev());
		System.out.println("Ceza yazdığı taşıt türü:"+p1.getCezaYazma());
		System.out.println("Ceza yazdığı taşıtların bilgileri:");
		p1.ceza();
		System.out.println();
		System.out.println("Birimle ilgili diğer polisin adı ve soyadı:"+p2.getAd()+p2.getSoyad());
		System.out.println("Bölümü:"+p2.getBirim());
		System.out.println("Telefon numarası:"+p2.getTelefon());
		System.out.println("Polis Sicil Numarası:"+p2.getPolisNo());
		System.out.println("Bölümdeki görevi:"+p2.getGorev());
		System.out.println("Görevini gerçekleştirdiği yer:"+p2.getDenetim());
		System.out.println("Ceza yazdığı vatandaşların bilgileri:");
		p2.denetim();
		System.out.println();
	}
	
	public static void slhRhst() {
		silah_ruhsat s1 = new silah_ruhsat("Kamil ","Petek", "55500011144","Silah Ruhsat", "523761","silah özelliklerinin ve ruhsat süresinin tespiti", "ruhsat");
		System.out.println("Silah ruhsat birimine hoş geldiniz...");
		System.out.println("Birimle ilgili polisin adı ve soyadı:"+s1.getAd()+s1.getSoyad());
		System.out.println("Bölümü:"+s1.getBirim());
		System.out.println("Telefon numarası:"+s1.getTelefon());
		System.out.println("Polis Sicil Numarası:"+s1.getPolisNo());
		System.out.println("Bölümdeki görevi:"+s1.getGorev());
		System.out.println("İlgilendiği kişilerin bilgileri:");
		s1.ruhsat();
		System.out.println();
	}
	
	public static void asayis() {
		asayisSube a1 = new asayisSube("Cafer ", "Yıldıray", "55500011155", "Asayiş Şube", "762354", "geniş çaplı olmayan suçlarla mücade", "hırsızlar", null);
		asayisSube a2 = new asayisSube("Eda ", "Yılmaz", "55500011166", "Asayiş Şube", "762360", "geniş çaplı olmayan suçlarla mücade", null, "dolandırıcılar");
		System.out.println("Asayiş Şube Birimine hoş geldiniz...");
		System.out.println("Birimle ilgili polisin adı ve soyadı:"+a1.getAd()+a1.getSoyad());
		System.out.println("Bölümü:"+a1.getBirim());
		System.out.println("Telefon numarası:"+a1.getTelefon());
		System.out.println("Polis Sicil Numarası:"+a1.getPolisNo());
		System.out.println("Bölümdeki görevi:"+a1.getGorev());
		System.out.println("Sorumlu olduğu suçlular:"+a1.getHirsiz());
		System.out.println("Yakaladığı suçlular:");
		a1.hirsiz();
		System.out.println();
		System.out.println("Birimle ilgili diğer polisin adı ve soyadı:"+a2.getAd()+a2.getSoyad());
		System.out.println("Bölümü:"+a2.getBirim());
		System.out.println("Telefon numarası:"+a2.getTelefon());
		System.out.println("Polis Sicil Numarası:"+a2.getPolisNo());
		System.out.println("Bölümdeki görevi:"+a2.getGorev());
		System.out.println("Sorumlu olduğu suçlular:"+a2.getDolandirici());
		System.out.println("Yakaladığı suçlular:");
		a2.dolandirici();
		System.out.println();
		
	}
	
	public static void isci() {
		temizlikci t1 = new temizlikci("Emine ", "Şanlıoğlu", "55500011177", "emniyet bürolarını temizleme", "temizlikçi", null);
		temizlikci t2 = new temizlikci("Hüseyin ","Şanlıoğlu","55500011188","emniyet bürolarına çeşitli yiyecek ve çay ikramı",null,"çaycı");
		asci y1 = new asci("Mustafa ","Bıçakçı" , "55500011199", "her öğün için yemek hazırlamak", null);
		System.out.println("İşçi birimine yönlendiriliyorsunuz");
		System.out.println("Bölümle ilgili kişinin adı ve soyadı:"+t1.getAd()+t1.getSoyad());
		System.out.println("Bölümle ilgili kişinin görevi:"+t1.getGorevi());
		System.out.println("Telefon numarası:"+t1.getTelefon());
		System.out.println("İlgilendiği iş:"+t1.getTemizlikci());
		System.out.println("İşçi hakkında bilgiler:");
		t1.temizlik();
		System.out.println();
		System.out.println("Bölümle ilgili kişinin adı ve soyadı:"+t2.getAd()+t2.getSoyad());
		System.out.println("Bölümle ilgili kişinin görevi:"+t2.getGorevi());
		System.out.println("Telefon numarası:"+t2.getTelefon());
		System.out.println("İlgilendiği iş:"+t2.getTemizlikci());
		System.out.println("İşçi hakkında bilgiler:");
		t2.cay();
		System.out.println();
		System.out.println("Bölümle ilgili kişinin adı ve soyadı:"+y1.getAd()+y1.getSoyad());
		System.out.println("Bölümle ilgili kişinin görevi:"+y1.getGorevi());
		System.out.println("Telefon numarası:"+y1.getTelefon());
		System.out.println("İşçi hakkında bilgiler:");
		y1.yemek();
	}
	
	public static void menuYonlendirme() {
		System.out.println("Menüye tekrar yönlendiriliyorsunuz...");
	}

}


public class musteri {

	private String isim;
	private String soyisim;
	private String sube;
	private int iban;		//long
	private int bakiye;  //long
	private int borc;		//long
	
	public String getİsim() {
		return isim;
	}

	public void setİsim(String ad) {
		this.isim=ad;
	}
	
	public String getSoyİsim() {
		return soyisim;
	}

	public void setSoyİsim(String soyAd) {
		this.soyisim=soyAd;
	}
	public String getSube() {
		return sube;
	}

	public void setSube(String yeniSube) {
		this.sube=yeniSube;
	}
	
	public int getIban() {
		return iban;
	}

	public void setIban(int yeniIban) {
		this.iban=yeniIban;
	}
	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int yeniBakiye) {
		this.bakiye=yeniBakiye;
	}
	public int getBorc() {
		return borc;
	}
	public void setBorc(int yeniBorc) {
		this.borc=yeniBorc;
	}
}

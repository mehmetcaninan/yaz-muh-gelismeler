
public class bankaİslemleri {
	
	musteri yeniMusteri = new musteri();
	
	public void paraCek(int miktar) {
		yeniMusteri.setBakiye(yeniMusteri.getBakiye()-miktar);
	
	}
	
	public void paraYatir(int miktar1) {
		yeniMusteri.setBakiye(yeniMusteri.getBakiye()+miktar1);
	}
	
	public void paraGonder(int miktar, int kime) {
		yeniMusteri.setBakiye(yeniMusteri.getBakiye()-miktar);
			
	}

}

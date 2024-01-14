import java.util.Date;
public class SigSigurimiPrones extends Personi{
	private String llojiprones;
	private String vleratregut2;
	private String siperfaqja2;
	private String vlerapaisjeve2;
	private String shumatotale2;
	private String mbulimi;
	private int idssp;
	private String adresassp;
	
	public SigSigurimiPrones(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String llojiprones, String vleratregut2, String siperfaqja2, String vlerapaisjeve2, String shumatotale2, String mbulimi, int idssp, String adresassp) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssp = super.getId();
		this.llojiprones = llojiprones;
		this.vleratregut2 = vleratregut2;
		this.siperfaqja2 = siperfaqja2;
		this.vlerapaisjeve2 = vlerapaisjeve2;
		this.shumatotale2 = shumatotale2;
		this.mbulimi = mbulimi;
		this.adresassp = adresassp;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i prones" + super.getEmer()+super.getMbiemer() + ", " + ", lloji i prones="
				+ llojiprones + ", vlera e tregut" + vleratregut2 + ", siperfaqja m2" + siperfaqja2 + ", vlera e paisjeve" + vlerapaisjeve2 
				+ "shuma totale" + shumatotale2 + "mbulimi(zjarr, rrufe, termet, permbytje)" + mbulimi + ", adresa" + adresassp + ", id=" + idssp + "]";
	}

	public String getLlojiprones() {
		return llojiprones;
	}
	public void setLlojoprones(String llojiprones) {
		this.llojiprones = llojiprones;
	}
	public String getVleratregut2() {
		return vleratregut2;
	}
	public void setVleratregut2(String vleratregut2) {
		this.vleratregut2 = vleratregut2;
	}
	public String getSiperfaqja2() {
		return siperfaqja2;
	}
	public void setSiperfaqja2(String siperfaqja2) {
		this.siperfaqja2 = siperfaqja2;
	}
	public String getVlerapaisjeve2() {
		return vlerapaisjeve2;
	}
	public void setVlerapaisjeve2(String vlerapaisjeve2) {
		this.vlerapaisjeve2 = vlerapaisjeve2;
	}
	public String getShumatotale2() {
		return shumatotale2;
	}
	public void setShumatotale(String shumatotale2) {
		this.shumatotale2 = shumatotale2;
	}
	public String getMbulimi() {
		return mbulimi;
	}
	public void setMbulimi(String mbulimi) {
		this.mbulimi = mbulimi;
	}
	public String getAdresassp() {
		return adresassp;
	}
	public void setAdresassp(String adresassp) {
		this.adresassp = adresassp;
	}
	public int getIdssp() {
		return idssp;
	}
	public void setIdssp(int idssp) {
		this.idssp = idssp;
	}
}
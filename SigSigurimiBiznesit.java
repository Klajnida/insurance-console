import java.util.Date;
public class SigSigurimiBiznesit extends Personi{
	private String emrisubjekt;
	private String nipt;
	private String vlerandertes;
	private String vleramakinerive;
	private String vleramallit;
	private String mbulimissb;
	private int idssb;
	private String adresassb;
	
	public SigSigurimiBiznesit(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String emrisubjekt, String nipt2, String vlerandertes2, String vleramakinerive2, String vleramallit2, String mbulimissb, int idssb, String adresassb) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssb = super.getId();
		this.emrisubjekt = emrisubjekt;
		this.nipt = nipt2;
		this.vlerandertes = vlerandertes2;
		this.vleramakinerive = vleramakinerive2;
		this.vleramallit = vleramallit2;
		this.mbulimissb = mbulimissb;
		this.adresassb = adresassb;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i biznesit" + super.getEmer()+super.getMbiemer() + ", " + ", emri i subjektit="
				+ emrisubjekt + ", nipt-i" + nipt + ", vlera e nderteses euro" + vlerandertes + ", vlera e makinerive euro" + vleramakinerive 
				+ "vlera e mallit" + vleramallit + "mbulimi(zjarr, rrufe, termet, permbytje, stuhi, xhamat)" + mbulimissb + ", adresa" + adresassb + ", id=" + idssb + "]";
	}

	public String getEmrisubjekt() {
		return emrisubjekt;
	}
	public void setEmrisubjekt(String emrisubjekt) {
		this.emrisubjekt = emrisubjekt;
	}
	public String getNipt() {
		return nipt;
	}
	public void setNipt(String nipt) {
		this.nipt = nipt;
	}
	public String getVlerandertes() {
		return vlerandertes;
	}
	public void setVlerandertes(String vlerandertes) {
		this.vlerandertes = vlerandertes;
	}
	public String getVleramakinerive() {
		return vleramakinerive;
	}
	public void setVleramakinerive(String vleramakinerive) {
		this.vleramakinerive = vleramakinerive;
	}
	public String getVleramallit() {
		return vleramallit;
	}
	public void setVleramallit(String vleramallit) {
		this.vleramallit = vleramallit;
	}
	public String getMbulimissb() {
		return mbulimissb;
	}
	public void setMbulimissb(String mbulimissb) {
		this.mbulimissb = mbulimissb;
	}
	public String getAdresassb() {
		return adresassb;
	}
	public void setAdresassb(String adresassb) {
		this.adresassb = adresassb;
	}
	public int getIdssb() {
		return idssb;
	}
	public void setIdssb(int idssb) {
		this.idssb = idssb;
	}
}
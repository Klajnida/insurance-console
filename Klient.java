import java.util.Date;
public class Klient extends Personi{
	private String vendlindja;
	private String qytetik;
	private int idk;
	
public Klient(String emer, String mbiemer, Date ditelindja, String gjinia,
		int telefon, String email, String vendlindja, String qytetik, int idk)
	{
	super(emer, mbiemer, ditelindja, gjinia, telefon, email);
	
	idk = super.getId();
	this.vendlindja = vendlindja;
	this.qytetik = qytetik;	
	}
	
	@Override
	public String toString() {
		return "Klient" + super.getEmer()+super.getMbiemer() + ", " + "[vendlindja=" + vendlindja + ", qytetik="
				+ qytetik + ", idk=" + idk + "]";
	}
	public String getVendlindja() {
		return vendlindja;
	}
	public void setVendlindja(String vendlindja) {
		this.vendlindja = vendlindja;
	}
	public String getQytetik() {
		return qytetik;
	}
	public void setQytetik(String qytetik) {
		this.qytetik = qytetik;
	}
	public int getIdk() {
		return idk;
	}
	public void setIdk(int idk) {
		this.idk = idk;
	}
	

}

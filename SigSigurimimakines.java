import java.util.Date;
public class SigSigurimimakines extends Personi{
	private String targa2;
	private String shasia2;
	private Date datafillimitssm = new Date ();
	private Date datambarimitssm = new Date ();
	private int idssm;
	private String atesiassm;
	private String qytetissm;
	private String adresa;
	
	public SigSigurimimakines(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String targa2, String shasia2, Date datafillimitssm, Date datambarimitssm, int idssm, String atesiassm, String qytetissm, String adresa) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssm = super.getId();
		this.targa2 = targa2;
		this.shasia2 = shasia2;
		this.datafillimitssm = datafillimitssm;
		this.datambarimitssm = datambarimitssm;
		this.atesiassm = atesiassm;
		this.qytetissm = qytetissm;
		this.adresa = adresa;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i makines" + super.getEmer()+super.getMbiemer() + ", " + "[targa=" + targa2 + "shasia" + shasia2 + ", data e fillimit="
				+ datafillimitssm + ", data e mbarimit" + datambarimitssm + ", atesia" + atesiassm + ", qyteti" + qytetissm + ", adresa" + adresa 
				+ ", id=" + idssm + "]";
	}
	public String getTarga2() {
		return targa2;
	}
	public void setTarga(String targa2) {
		this.targa2 = targa2;
	}
	public String getShasia() {
		return shasia2;
	}
	public void setShasia2(String shasia2) {
		this.shasia2 = shasia2;
	}
	public Date getDatafillimitssm() {
		return datafillimitssm;
	}
	public void setDatafillimitssm(Date datafillimitssm) {
		this.datafillimitssm = datafillimitssm;
	}
	public Date getDatambarimitssm() {
		return datambarimitssm;
	}
	public void setDatambarimitssm(Date datambarimitssm) {
		this.datambarimitssm = datambarimitssm;
	}
	public String getAtesiassm() {
		return atesiassm;
	}
	public void setAtesiassm(String atesiassm) {
		this.atesiassm = atesiassm;
	}
	public String getQytetissm() {
		return qytetissm;
	}
	public void setQytetissm(String qytetissm) {
		this.qytetissm = qytetissm;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public int getIdssm() {
		return idssm;
	}
	public void setIdssm(int idssm) {
		this.idssm = idssm;
	}
}

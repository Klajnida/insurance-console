import java.util.Date;
public class SigSigurimiStudentit extends Personi{
	private String zonasss;
	private String periudhasss;
	private Date datafillimitsss = new Date ();
	private Date datambarimitsss = new Date ();
	private int idsss;
	private String atesiasss;
	private String qytetisss;
	private String adresasss;
	
	public SigSigurimiStudentit(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String zonasss, String periudhasss, Date datafillimitsss, Date datambarimitsss, int idsss, String atesiasss, String qytetisss, String adresasss) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idsss = super.getId();
		this.zonasss = zonasss;
		this.periudhasss = periudhasss;
		this.datafillimitsss = datafillimitsss;
		this.datambarimitsss = datambarimitsss;
		this.atesiasss = atesiasss;
		this.qytetisss = qytetisss;
		this.adresasss = adresasss;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i studentit jashte shtetit" + super.getEmer()+super.getMbiemer() + ", " + "[zona=" + zonasss + "periudha" + periudhasss + ", data e fillimit="
				+ datafillimitsss + ", data e mbarimit" + datambarimitsss + ", atesia" + atesiasss + ", qyteti" + qytetisss + ", adresa" + adresasss + ", id=" + idsss + "]";
	}
	public String getZonasss() {
		return zonasss;
	}
	public void setZonasss(String zonasss) {
		this.zonasss = zonasss;
	}
	public String getPeriudhasss() {
		return periudhasss;
	}
	public void setPeriudhasss(String periudhasss) {
		this.periudhasss = periudhasss;
	}
	public Date getDatafillimitsss() {
		return datafillimitsss;
	}
	public void setDatafillimitsss(Date datafillimitsss) {
		this.datafillimitsss = datafillimitsss;
	}
	public Date getDatambarimitsss() {
		return datambarimitsss;
	}
	public void setDatambarimitsss(Date datambarimitsss) {
		this.datambarimitsss = datambarimitsss;
	}
	public String getAtesiasss() {
		return atesiasss;
	}
	public void setAtesiasss(String atesiasss) {
		this.atesiasss = atesiasss;
	}
	public String getQytetisss() {
		return qytetisss;
	}
	public void setQytetisss(String qytetisss) {
		this.qytetisss = qytetisss;
	}
	public String getAdresasss() {
		return adresasss;
	}
	public void setAdresasss(String adresasss) {
		this.adresasss = adresasss;
	}
	public int getIdsss() {
		return idsss;
	}
	public void setIdsss(int idsss) {
		this.idsss = idsss;
	}
}
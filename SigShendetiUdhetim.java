import java.util.Date;
public class SigShendetiUdhetim extends Personi{
	private String zona;
	private String periudha;
	private Date datafillimit = new Date ();
	private Date datambarimit = new Date ();
	private int idssu;
	private String atesia;
	private String qytetissu;
	
	public SigShendetiUdhetim(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String zona, String periudha, Date datafillimit, Date datambarimit, int idssu, String atesia, String qytetissu) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssu = super.getId();
		this.zona = zona;
		this.periudha = periudha;
		this.datafillimit = datafillimit;
		this.datambarimit = datambarimit;
		this.atesia = atesia;
		this.qytetissu = qytetissu;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i shendetit ne udhetim" + super.getEmer()+super.getMbiemer() + ", " + "[zona=" + zona + "periudha" + periudha + ", data e fillimit="
				+ datafillimit + ", data e mbarimit" + datambarimit + ", atesia" + atesia + ", qyteti" + qytetissu + ", id=" + idssu + "]";
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getPeriudha() {
		return periudha;
	}
	public void setPeriudha(String periudha) {
		this.periudha = periudha;
	}
	public Date getDatafillimit() {
		return datafillimit;
	}
	public void setDatafillimit(Date datafillimit) {
		this.datafillimit = datafillimit;
	}
	public Date getDatambarimit() {
		return datambarimit;
	}
	public void setDatambarimit(Date datambarimit) {
		this.datambarimit = datambarimit;
	}
	public String getAtesia() {
		return atesia;
	}
	public void setAtesia(String atesia) {
		this.atesia = atesia;
	}
	public String getQytetissu() {
		return qytetissu;
	}
	public void setQytetissu(String qytetissu) {
		this.qytetissu = qytetissu;
	}
	public int getIdssu() {
		return idssu;
	}
	public void setIdssu(int idssu) {
		this.idssu = idssu;
	}
}

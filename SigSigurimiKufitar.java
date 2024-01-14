import java.util.Date;
public class SigSigurimiKufitar extends Personi{
	private String targassk;
	private String shasiassk;
	private String periudhassk;
	private String kategoriassk;
	private Date datafillimitssk = new Date ();
	private Date datambarimitssk = new Date ();
	private int idssk;
	private String pikakufitare;
	private Date datamberitjes = new Date ();
	private String adresassk;
	
	public SigSigurimiKufitar(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String targassk, String shasiassk, String periudhassk, String kategoriassk, Date datafillimitssk, Date datambarimitssk, 
			int idssm, String pikakufitare, Date datamberitjes, String adresassk) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssm = super.getId();
		this.targassk = targassk;
		this.shasiassk = shasiassk;
		this.periudhassk = periudhassk;
		this.kategoriassk = kategoriassk;
		this.datafillimitssk = datafillimitssk;
		this.datambarimitssk = datambarimitssk;
		this.pikakufitare = pikakufitare;
		this.datamberitjes = datamberitjes;
		this.adresassk = adresassk;
	}
	
	@Override
	public String toString() {
		return "Sigurimi i makines" + super.getEmer()+super.getMbiemer() + ", " + "[targa=" + targassk + "shasia" + shasiassk + "periudha" + periudhassk +
				"kategoria" + kategoriassk + ", data e fillimit="
				+ datafillimitssk + ", data e mbarimit" + datambarimitssk + ", pika kufitare" + pikakufitare + ", data e mberitjes" + datamberitjes + ", adresa" + adresassk 
				+ ", id=" + idssk + "]";
	}
	public String getTargassk() {
		return targassk;
	}
	public void setTargassk(String targassk) {
		this.targassk = targassk;
	}
	public String getShasiassk() {
		return shasiassk;
	}
	public void setShasiassk(String shasiassk) {
		this.shasiassk = shasiassk;
	}
	public String getPeriudhassk() {
		return periudhassk;
	}
	public void setPeriudhassk(String periudhassk) {
		this.periudhassk = periudhassk;
	}
	public String getKategoriassk() {
		return kategoriassk;
	}
	public void setKategoriassk(String kategoriassk) {
		this.kategoriassk = kategoriassk;
	}
	public Date getDatafillimitssk() {
		return datafillimitssk;
	}
	public void setDatafillimitssk(Date datafillimitssk) {
		this.datafillimitssk = datafillimitssk;
	}
	public Date getDatambarimitssk() {
		return datambarimitssk;
	}
	public void setDatambarimitssk(Date datambarimitssk) {
		this.datambarimitssk = datambarimitssk;
	}
	public String getPikakufitare() {
		return pikakufitare;
	}
	public void setPikakufitare(String pikakufitare) {
		this.pikakufitare = pikakufitare;
	}
	public Date getDatamberitjes() {
		return datamberitjes;
	}
	public void setDatamberitjes(Date datamberitjes) {
		this.datamberitjes = datamberitjes;
	}
	public String getAdresassk() {
		return adresassk;
	}
	public void setAdresa(String adresassk) {
		this.adresassk = adresassk;
	}
	public int getIdssk() {
		return idssk;
	}
	public void setIdssk(int idssk) {
		this.idssk = idssk;
	}
}
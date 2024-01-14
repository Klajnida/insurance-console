import java.util.Date;
public class SigSigurimiFemijet extends Personi{
	private Date datafillimitssf = new Date ();
	private Date datambarimitssf = new Date ();
	private int idssf;
	private String atesiassf;
	private String qytetissf;
	private String adresassf;
	
	public SigSigurimiFemijet(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			Date datafillimitssf, Date datambarimitssf, int idssf, String atesiassf, String qytetissf, String adresassf) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		idssf = super.getId();
		this.datafillimitssf = datafillimitssf;
		this.datambarimitssf = datambarimitssf;
		this.atesiassf = atesiassf;
		this.qytetissf = qytetissf;
		this.adresassf = adresassf;
	}
	
	@Override
	public String toString() {
		return "Sigurimi per femijet" + super.getEmer()+super.getMbiemer() + ", " + ", data e fillimit="
				+ datafillimitssf + ", data e mbarimit" + datambarimitssf + ", atesia" + atesiassf + ", qyteti" + qytetissf + ", adresa" + adresassf + ", id=" + idssf + "]";
	}

	public Date getDatafillimitssf() {
		return datafillimitssf;
	}
	public void setDatafillimitssf(Date datafillimitssf) {
		this.datafillimitssf = datafillimitssf;
	}
	public Date getDatambarimitssf() {
		return datambarimitssf;
	}
	public void setDatambarimitssf(Date datambarimitssf) {
		this.datambarimitssf = datambarimitssf;
	}
	public String getAtesiassf() {
		return atesiassf;
	}
	public void setAtesiassf(String atesiassf) {
		this.atesiassf = atesiassf;
	}
	public String getQytetissf() {
		return qytetissf;
	}
	public void setQytetissf(String qytetissf) {
		this.qytetissf = qytetissf;
	}
	public String getAdresassf() {
		return adresassf;
	}
	public void setAdresassf(String adresassf) {
		this.adresassf = adresassf;
	}
	public int getIdssf() {
		return idssf;
	}
	public void setIdssf(int idssf) {
		this.idssf = idssf;
	}
}
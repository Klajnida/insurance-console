import java.util.Date;
public class DepKontabiliteti extends Personi{
	private String arsimidk;
	private String departamentidk;
	private String eksperiencadk;
	private int iddk;
	
	public DepKontabiliteti(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidk, String departamentidk, String eksperiencadk, int iddk) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddk = super.getId();
		this.arsimidk = arsimidk;
		this.departamentidk = departamentidk;
		this.eksperiencadk = eksperiencadk;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidk + ", departamenti="
				+ departamentidk + ", eksperienca" + eksperiencadk + ", id=" + iddk + "]";
	}
	public String getArsimidk() {
		return arsimidk;
	}
	public void setArsimidk(String arsimidk) {
		this.arsimidk = arsimidk;
	}
	public String getDepartamentidk() {
		return departamentidk;
	}
	public void setDepartamentidk(String departamentidk) {
		this.departamentidk = departamentidk;
	}
	public String getEksperiencadk() {
		return eksperiencadk;
	}
	public void setEksperiencadk(String eksperiencadk) {
		this.eksperiencadk = eksperiencadk;
	}
	public int getIddk() {
		return iddk;
	}
	public void setIddk(int iddk) {
		this.iddk = iddk;
	}
}

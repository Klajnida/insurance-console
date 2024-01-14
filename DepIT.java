import java.util.Date;
public class DepIT extends Personi{
	private String arsimidit;
	private String dega;
	private String departamentidit;
	private String eksperiencadit;
	private int iddit;
	
	public DepIT(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidit, String dega, String departamentidit, String eksperiencadit, int iddit) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddit = super.getId();
		this.arsimidit = arsimidit;
		this.dega = dega;
		this.departamentidit = departamentidit;
		this.eksperiencadit = eksperiencadit;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidit + "dega" + dega + ", departamenti="
				+ departamentidit + ", eksperienca" + eksperiencadit + ", id=" + iddit + "]";
	}
	public String getArsimidit() {
		return arsimidit;
	}
	public void setArsimidit(String arsimidit) {
		this.arsimidit = arsimidit;
	}
	public String getDegat() {
		return dega;
	}
	public void setDega(String dega) {
		this.dega = dega;
	}
	public String getDepartamentidit() {
		return departamentidit;
	}
	public void setDepartamentidit(String departamentidit) {
		this.departamentidit = departamentidit;
	}
	public String getEksperiencadit() {
		return eksperiencadit;
	}
	public void setEksperiencadit(String eksperiencadit) {
		this.eksperiencadit = eksperiencadit;
	}
	public int getIddit() {
		return iddit;
	}
	public void setIddit(int iddit) {
		this.iddit = iddit;
	}
}

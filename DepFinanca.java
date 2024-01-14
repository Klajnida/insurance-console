import java.util.Date;
public class DepFinanca extends Personi{
	private String arsimidf;
	private String departamentidf;
	private String eksperiencadf;
	private int iddf;
	
	public DepFinanca(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidf, String departamentidf, String eksperiencadf, int iddf) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddf = super.getId();
		this.arsimidf = arsimidf;
		this.departamentidf = departamentidf;
		this.eksperiencadf = eksperiencadf;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidf + ", departamenti="
				+ departamentidf + ", eksperienca" + eksperiencadf + ", id=" + iddf + "]";
	}
	public String getArsimidf() {
		return arsimidf;
	}
	public void setArsimidf(String arsimidf) {
		this.arsimidf = arsimidf;
	}
	public String getDepartamentidf() {
		return departamentidf;
	}
	public void setDepartamentidf(String departamentidf) {
		this.departamentidf = departamentidf;
	}
	public String getEksperiencadf() {
		return eksperiencadf;
	}
	public void setEksperiencadf(String eksperiencadf) {
		this.eksperiencadf = eksperiencadf;
	}
	public int getIddf() {
		return iddf;
	}
	public void setIddf(int iddf) {
		this.iddf = iddf;
	}
}

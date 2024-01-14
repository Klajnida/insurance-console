import java.util.Date;
public class DepRisku extends Personi{
	private String arsimidr;
	private String departamentidr;
	private String eksperiencadr;
	private int iddr;
	
	public DepRisku(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidr, String departamentidr, String eksperiencadr, int iddr) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddr = super.getId();
		this.arsimidr = arsimidr;
		this.departamentidr = departamentidr;
		this.eksperiencadr = eksperiencadr;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidr + ", departamenti="
				+ departamentidr + ", eksperienca" + eksperiencadr + ", id=" + iddr + "]";
	}
	public String getArsimidr() {
		return arsimidr;
	}
	public void setArsimidr(String arsimidr) {
		this.arsimidr = arsimidr;
	}
	public String getDepartamentidr() {
		return departamentidr;
	}
	public void setDepartamentidr(String departamentidr) {
		this.departamentidr = departamentidr;
	}
	public String getEksperiencadr() {
		return eksperiencadr;
	}
	public void setEksperiencadr(String eksperiencadr) {
		this.eksperiencadr = eksperiencadr;
	}
	public int getIddr() {
		return iddr;
	}
	public void setIddr(int iddr) {
		this.iddr = iddr;
	}
}

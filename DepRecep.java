import java.util.Date;
public class DepRecep extends Personi{
	private String arsimidr;
	private String departamentidr;
	private int iddr;
	
	public DepRecep(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidr, String departamentidr, int iddr) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddr = super.getId();
		this.arsimidr = arsimidr;
		this.departamentidr = departamentidr;
		}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidr + ", departamenti="
				+ departamentidr + ", id=" + iddr + "]";
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
	public int getIddr() {
		return iddr;
	}
	public void setIddr(int iddr) {
		this.iddr = iddr;
	}
}
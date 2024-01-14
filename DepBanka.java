import java.util.Date;
public class DepBanka extends Personi{
	private String arsimidb;
	private String departamentidb;
	private String nivelidb;
	private int iddb;
	
	public DepBanka(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidb, String departamentidb, String nivelidb, int iddb) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddb = super.getId();
		this.arsimidb = arsimidb;
		this.departamentidb = departamentidb;
		this.nivelidb = nivelidb;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidb + ", departamenti="
				+ departamentidb + ", niveli" + nivelidb + ", id=" + iddb + "]";
	}
	public String getArsimidb() {
		return arsimidb;
	}
	public void setArsimidb(String arsimidb) {
		this.arsimidb = arsimidb;
	}
	public String getDepartamentidb() {
		return departamentidb;
	}
	public void setDepartamentidb(String departamentidb) {
		this.departamentidb = departamentidb;
	}
	public String getNivelidb() {
		return nivelidb;
	}
	public void setNivelidb(String nivelidb) {
		this.nivelidb = nivelidb;
	}
	public int getIddb() {
		return iddb;
	}
	public void setIddb(int iddb) {
		this.iddb = iddb;
	}
}

import java.util.Date;
public class DepProna extends Personi{
	private String arsimi;
	private String departamentidp;
	private String niveli;
	private int iddp;
	
	public DepProna(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimi, String departamentidp, String niveli, int iddp) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddp = super.getId();
		this.arsimi = arsimi;
		this.departamentidp = departamentidp;
		this.niveli = niveli;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimi + ", departamentidp="
				+ departamentidp + ", niveli" + niveli + ", iddp=" + iddp + "]";
	}
	public String getArsimi() {
		return arsimi;
	}
	public void setArsimi(String arsimi) {
		this.arsimi = arsimi;
	}
	public String getDepartamentidp() {
		return departamentidp;
	}
	public void setDepartamentidp(String departamentidp) {
		this.departamentidp = departamentidp;
	}
	public String getNiveli() {
		return niveli;
	}
	public void setNiveli(String niveli) {
		this.niveli = niveli;
	}
	public int getIddp() {
		return iddp;
	}
	public void setIddp(int iddp) {
		this.iddp = iddp;
	}
}

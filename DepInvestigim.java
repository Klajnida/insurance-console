import java.util.Date;
public class DepInvestigim extends Personi{
	private String arsimidi;
	private String departamentidi;
	private String eksperienca;
	private int iddi;
	
	public DepInvestigim(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidi, String departamentidi, String eksperienca, int iddi) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddi = super.getId();
		this.arsimidi = arsimidi;
		this.departamentidi = departamentidi;
		this.eksperienca = eksperienca;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidi + ", departamenti="
				+ departamentidi + ", eksperienca" + eksperienca + ", id=" + iddi + "]";
	}
	public String getArsimidi() {
		return arsimidi;
	}
	public void setArsimidi(String arsimidi) {
		this.arsimidi = arsimidi;
	}
	public String getDepartamentidi() {
		return departamentidi;
	}
	public void setDepartamentidi(String departamentidi) {
		this.departamentidi = departamentidi;
	}
	public String getEksperienca() {
		return eksperienca;
	}
	public void setEksperienca(String eksperienca) {
		this.eksperienca = eksperienca;
	}
	public int getIddi() {
		return iddi;
	}
	public void setIddi(int iddi) {
		this.iddi = iddi;
	}
}

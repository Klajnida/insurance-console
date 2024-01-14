import java.util.Date;
public class DepSigMotorrik extends Personi{
	private String arsimidsm;
	private String departamentidsm;
	private String nivelidsm;
	private int iddsm;
	
	public DepSigMotorrik(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidsm, String departamentidsm, String nivelidsm, int iddsm) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddsm = super.getId();
		this.arsimidsm = arsimidsm;
		this.departamentidsm = departamentidsm;
		this.nivelidsm = nivelidsm;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidsm + ", departamentidp="
				+ departamentidsm + ", niveli" + nivelidsm + ", iddp=" + iddsm + "]";
	}
	public String getArsimidsm() {
		return arsimidsm;
	}
	public void setArsimidsm(String arsimidsm) {
		this.arsimidsm = arsimidsm;
	}
	public String getDepartamentidsm() {
		return departamentidsm;
	}
	public void setDepartamentidsm(String departamentidsm) {
		this.departamentidsm = departamentidsm;
	}
	public String getNivelidsm() {
		return nivelidsm;
	}
	public void setNivelidsm(String nivelidsm) {
		this.nivelidsm = nivelidsm;
	}
	public int getIddsm() {
		return iddsm;
	}
	public void setIddsm(int iddsm) {
		this.iddsm = iddsm;
	}
}

import java.util.Date;
public class DepHR extends Personi{
	private String arsimidhr;
	private String departamentidhr;
	private int iddhr;
	
	public DepHR(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidhr, String departamentidhr, int iddhr) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddhr = super.getId();
		this.arsimidhr = arsimidhr;
		this.departamentidhr = departamentidhr;
		}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidhr + ", departamenti="
				+ departamentidhr + ", id=" + iddhr + "]";
	}
	public String getArsimidhr() {
		return arsimidhr;
	}
	public void setArsimidhr(String arsimidhr) {
		this.arsimidhr = arsimidhr;
	}
	public String getDepartamentidhr() {
		return departamentidhr;
	}
	public void setDepartamentidhr(String departamentidhr) {
		this.departamentidhr = departamentidhr;
	}
	public int getIddhr() {
		return iddhr;
	}
	public void setIddhr(int iddhr) {
		this.iddhr = iddhr;
	}
}
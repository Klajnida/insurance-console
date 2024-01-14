import java.util.Date;
public class DepProtokolli extends Personi{
	private String arsimidp;
	private String departamentidp;
	private int iddp;
	
	public DepProtokolli(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidp, String departamentidp, int iddp) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddp = super.getId();
		this.arsimidp = arsimidp;
		this.departamentidp = departamentidp;
		}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidp + ", departamenti="
				+ departamentidp + ", id=" + iddp + "]";
	}
	public String getArsimidp() {
		return arsimidp;
	}
	public void setArsimidp(String arsimidp) {
		this.arsimidp = arsimidp;
	}
	public String getDepartamentidp() {
		return departamentidp;
	}
	public void setDepartamentidp(String departamentidp) {
		this.departamentidp = departamentidp;
	}
	public int getIddp() {
		return iddp;
	}
	public void setIddp(int iddp) {
		this.iddp = iddp;
	}
}
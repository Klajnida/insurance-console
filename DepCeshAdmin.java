import java.util.Date;
public class DepCeshAdmin extends Personi{
	private String arsimidca;
	private String degadca;
	private String departamentidca;
	private int iddca;
	
	public DepCeshAdmin(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidca, String degadca, String departamentidca, int iddca) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddca = super.getId();
		this.arsimidca = arsimidca;
		this.degadca = degadca;
		this.departamentidca = departamentidca;
		}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidca + "dega" + degadca + ", departamenti="
				+ departamentidca + ", id=" + iddca + "]";
	}
	public String getArsimidca() {
		return arsimidca;
	}
	public void setArsimidca(String arsimidca) {
		this.arsimidca = arsimidca;
	}
	public String getDegadca() {
		return degadca;
	}
	public void setDegadca(String degadca) {
		this.degadca = degadca;
	}
	public String getDepartamentidca() {
		return departamentidca;
	}
	public void setDepartamentidca(String departamentidca) {
		this.departamentidca = departamentidca;
	}
	public int getIddca() {
		return iddca;
	}
	public void setIddca(int iddca) {
		this.iddca = iddca;
	}
}

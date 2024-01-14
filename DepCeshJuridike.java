import java.util.Date;
public class DepCeshJuridike extends Personi{
	private String arsimidcj;
	private String degadcj;
	private String departamentidcj;
	private int iddcj;
	
	public DepCeshJuridike(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidcj, String degadcj, String departamentidcj, int iddcj) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddcj = super.getId();
		this.arsimidcj = arsimidcj;
		this.degadcj = degadcj;
		this.departamentidcj = departamentidcj;
		}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidcj + "dega" + degadcj + ", departamenti="
				+ departamentidcj + ", id=" + iddcj + "]";
	}
	public String getArsimidcj() {
		return arsimidcj;
	}
	public void setArsimidcj(String arsimidcj) {
		this.arsimidcj = arsimidcj;
	}
	public String getDegadcj() {
		return degadcj;
	}
	public void setDegadcj(String degadcj) {
		this.degadcj = degadcj;
	}
	public String getDepartamentidcj() {
		return departamentidcj;
	}
	public void setDepartamentidcj(String departamentidcj) {
		this.departamentidcj = departamentidcj;
	}
	public int getIddcj() {
		return iddcj;
	}
	public void setIddcj(int iddcj) {
		this.iddcj = iddcj;
	}
}


import java.util.Date;
public class DepShendeti extends Personi{
	private String arsimidsh;
	private String specialiteti;
	private String departamentidsh;
	private String nivelidsh;
	private int iddsh;
	
	public DepShendeti(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email,
			String arsimidsh, String specialiteti, String departamentidsh, String nivelidsh, int iddsh) 
	{
		super(emer, mbiemer, ditelindja, gjinia, telefon, email);
		
		iddsh = super.getId();
		this.arsimidsh = arsimidsh;
		this.specialiteti = specialiteti;
		this.departamentidsh = departamentidsh;
		this.nivelidsh = nivelidsh;
	}
	
	@Override
	public String toString() {
		return "Staf" + super.getEmer()+super.getMbiemer() + ", " + "[arsimi=" + arsimidsh + "specialiteti" 
				+ specialiteti + ", departamenti="
				+ departamentidsh + ", niveli" + nivelidsh + ", iddp=" + iddsh + "]";
	}
	public String getArsimidsh() {
		return arsimidsh;
	}
	public void setArsimidsh(String arsimidsh) {
		this.arsimidsh = arsimidsh;
	}
	public String getSpecialiteti() {
		return specialiteti;
	}
	public void setSpecialiteti(String specialiteti) {
		this.specialiteti = specialiteti;
	}
	public String getDepartamentidsh() {
		return departamentidsh;
	}
	public void setDepartamentidsh(String departamentidsh) {
		this.departamentidsh = departamentidsh;
	}
	public String getNivelidsh() {
		return nivelidsh;
	}
	public void setNivelidsh(String nivelidsh) {
		this.nivelidsh = nivelidsh;
	}
	public int getIddsh() {
		return iddsh;
	}
	public void setIddsh(int iddsh) {
		this.iddsh = iddsh;
	}
}
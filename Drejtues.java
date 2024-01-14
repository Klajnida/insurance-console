import java.util.Date;

public class Drejtues extends Personi {
	private int iddr;
	private String departamenti;
	private String pozicioni;
	
	public Drejtues (String emer, String mbiemer, Date ditelindja,
			String gjinia, int telefon, String email, String departamenti, String pozicioni, int iddr)
	{super(emer, mbiemer, ditelindja, gjinia, telefon, email);
	iddr = super.getId();
	this.departamenti = departamenti;
	this.pozicioni = pozicioni;		
	}
	@Override
	public  String toString() {
		return "Drejtues" + super.getEmer() + super.getMbiemer() + "[iddr=" + iddr + ", "
				+ "departamenti=" + departamenti + ", pozicioni=" + pozicioni + "]";
				}
	public int getIddr() {
		return iddr;
	}
	public void setIddr(int iddr) {
		this.iddr = iddr;
	}
	public String getDepartamenti() {
		return departamenti;
	}
	public void setDepartamenti(String departamenti) {
		this.departamenti = departamenti;
	}
	public String getPozicioni() {
		return pozicioni;
	}
	public void setPozicioni(String pozicioni) {
		this.pozicioni = pozicioni;
	}
	
}
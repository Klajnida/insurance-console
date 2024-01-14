import java.util.Date;
public class Personi {
	private String emer;
	private String mbiemer;
	private Date ditelindja = new Date ();
	private String gjinia;
	private int telefon;
	private String email;
	private static int id = 0;

public Personi (String emer, String mbiemer, Date ditelindja, String gjinia, int telefon, String email)
{
	id++;
	this.emer = emer;
	this.mbiemer = mbiemer;
	this.ditelindja = ditelindja;
	this.gjinia = gjinia;
	this.telefon = telefon;
	this.email = email;
}
	
	@Override
	public String toString() {
		return "Person id: " + id + "[emer = " + emer + ", mbiemer =" + mbiemer + ", " + "ditelindja =" + ditelindja
				+ ", gjinia =" + gjinia + ", telefon" + telefon + ", email" + email + "]";
	}
	public String getEmer() {
		return emer;
	}
	public void setEmer(String emer) {
		this.emer = emer;
	}
	public String getMbiemer() {
		return mbiemer;
	}
	public void setMbiemer(String mbiemer) {
		this.mbiemer = mbiemer;
	}
	public Date getDitelindja() {
		return ditelindja;
	}
	public void setDitelindja(Date ditelindja) {
		this.ditelindja = ditelindja;
	}
	public String getGjinia() {
		return gjinia;
	}
	public void setGjinia(String gjinia) {
		this.gjinia = gjinia;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getId() {
		return id;
	}
	public static void setID(int id) {
		Personi.id = id;
	}
	
	
}

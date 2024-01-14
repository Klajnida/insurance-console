import java.util.Date;
public class Agjent_terreni extends Personi {
	private String departamentia;
	private String pozicionia;
	private String qyteti;
	private int ida;
	
public Agjent_terreni(String emer, String mbiemer, Date ditelindja, String gjinia, int telefon,
		String email, String departamentia, String pozicionia, String qyteti, int ida)
	{
	super(emer, mbiemer, ditelindja, gjinia, telefon, email);
	
	ida = super.getId();
	this.departamentia = departamentia;
	this.pozicionia = pozicionia;
	this.qyteti = qyteti;
	}
	
	@Override
	public String toString() {
		return "Agjent terreni" + super.getEmer() + super.getMbiemer() + ", " + "[departamentia=" + departamentia
				+ ", pozicioni=" + pozicionia + ", qyteti=" + qyteti + "ida=" + ida + "]";
	}
	
	public String getDepartamentia() {
		return departamentia;
	}
	public void setDepartamentia(String departamentia) {
		this.departamentia = departamentia;
	}
	public String getPozicionia() {
		return pozicionia;
	}
	public void setPozicionia(String pozicionia) {
		this.pozicionia = pozicionia;
	}
	public String getQyteti() {
		return qyteti;
	}
	public void setQyteti(String qyteti) {
		this.qyteti = qyteti;
	}
	public int getIda() {
		return ida;
	}
	public void setIda(int ida) {
		this.ida = ida;
	}
}

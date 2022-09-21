
public class Emp extends Persosn {
	private int empId;
	public Emp(String nm, String gen, int empid) {
		super(nm, gen);
		this.empId=empid;
	}
	@Override
	public void work() {
		if(empId ==0) {
			System.out.println("Logged out");
		}
		else {
			System.out.println("Looged in");
		}
	}
	public static void main(String[] args) {
		Persosn empOb = new Emp("AMMAR","Male",1203);
		
		empOb.work();
		empOb.nameChange("AMMAR JAMAL");
		System.out.println(empOb.toString());
	}
	
}

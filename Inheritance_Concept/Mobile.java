/**
 * 
 */
package Inheritance_Concept;

/**
 * @author AMMAR JAMAL
 *
 */
public class Mobile {
	 int cost;
	 String name;
	 int ram;
	
	public void year() {
		System.out.println("Year of Manufacture.");
	};
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	
	
}

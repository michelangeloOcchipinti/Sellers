import java.util.Vector;

public class Sellers {
	
	private String name;
	private String surname;
	private int age;
	private float turnover;
	private String codSeller;
	private Vector sellers=new Vector();
	
	public Sellers(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
															}
	public String toString(){
		return name+" "+surname+" "+age+" "+turnover;
	}
	
	public void setCodSeller(String codSeller){
		this.codSeller=codSeller;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSurname(String surname){
		this.surname=surname;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setTurnover(float turnover){
		this.turnover=turnover;
	}
	
	public float getTurnover(){
		return turnover;
	}
	
	public void updateTurnover(float addition){
		this.turnover=turnover+addition;
	}
	
	public void printSellers(){
		
	}
}

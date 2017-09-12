import java.util.Vector;
import java.util.HashMap;
import java.util.Map;


public class Sellers {
	
	private String code;
	private String name;
	private String surname;
	private int age;
	private float turnover;
	public static int codSeller;
	
	public String getCode() {
		return code;
	}


	private static Vector<Sellers> sellers=new Vector<Sellers>();
	
	public Sellers(String name, String surname, int age) {
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.code="vend"+codSeller;
															}
	
	
	public String toString(){
		return name+" "+surname+" "+age+" "+turnover;
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
	
	public static void createSeller(String name, String surname, int age){
		sellers.addElement(new Sellers(name, surname, age));
		System.out.println("You have added below seller to this database:\n");
 		System.out.println("Code: "+sellers.get(codSeller).getCode()+"\n"+"Name: "+sellers.get(codSeller).getName()+"\n"+"Surname: "+sellers.get(codSeller).getSurname()+"\n"+"Age: "+sellers.get(codSeller).getAge()+"\n");
		codSeller++;
		
	}
	
	public void printSellers(){
		System.out.println(sellers.toString());
	}
	
	public static void removeSeller(String code){
		int index=0;
		while (index<sellers.size()){
			if(sellers.get(index).code.equals(code)){
				System.out.println("You removed below seller: \n");
				System.out.println("Code: "+sellers.get(index).code+"\n"+"Name: "+sellers.get(index).name+"\n"+"Surname: "+sellers.get(index).surname);
				sellers.remove(index);
			}
			else{
				System.out.println("Seller indicated doesn't exist! \n");
				}
			index++;
		}
	}
}

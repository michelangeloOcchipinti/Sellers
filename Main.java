
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int menuChoice = 0;
		String name;
		String surname;
		String age;
		Scanner input = new Scanner(System.in);
		
		 while (menuChoice!=10){
			 System.out.println("Welcome to TRANSNATIONAL SECURITY VENDORS SYSTEM \n");
			 System.out.println("Please choose a voice menu: \n");
			 System.out.println("1 - Add a seller \n2 - Add an article");
			 menuChoice=input.nextInt();
			 if (menuChoice==1){
			 		System.out.println("Insert the name of the seller:");
			 		name=input.nextLine();
			 		name=input.nextLine();
			 		System.out.println(name);
			 		
			 }
		 }
		
		Sellers ven1=new Sellers("Mario", "Rossi", 45);
		
		System.out.println(ven1.toString());

	}

}

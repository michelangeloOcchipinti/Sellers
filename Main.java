import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int menuChoice = 0;
		String name;
		String surname;
		int age;
		int exit;
		Scanner input = new Scanner(System.in);
		 while (menuChoice!=10){
			 System.out.println("Welcome to TRANSNATIONAL SECURITY VENDORS SYSTEM \n");
			 System.out.println("Please choose a voice menu: \n");
			 System.out.println("1 - Add a seller \n2 - Add an article");
			 try{
				 if (!input.hasNextInt()){
		 				throw new Exception("You wrote a carachter!");
		 			}
				 menuChoice=input.nextInt();
				 switch (menuChoice){
			 		case 1:
			 			System.out.println("Insert the name of the seller:");
			 			name=input.nextLine();
			 			if ( input.hasNextInt()){
			 				throw new Exception("You wrote a number!");
			 			}
			 			name=input.nextLine();
			 			/*if (name.getClass() != String.class){
			 				throw new Exception("");
			 			}*/
			 			System.out.println("Insert the surname of the seller:");
			 			if ( input.hasNext("0")){
			 				throw new Exception("You wrote a number!");
			 			}
			 			surname=input.nextLine();
			 			System.out.println(surname);
			 			System.out.println("Insert the age of the seller:");
			 			age=input.nextInt();
			 			System.out.println(age+"\n");
			 			Sellers.createSeller(name, surname, age);
			 			System.out.println("Insert 1 to return to main menu: \n");
			 			exit=input.nextInt();	
			 }
			 
			 }
		 		catch(InputMismatchException e){
		 			System.out.println( "You put a not valid value - Program closed" ) ; 
		 			//System.exit(0);
		 			System.out.println( "Insert 1 to return to main menu" ) ;
		 			input.nextLine();
		 			exit=input.nextInt();
		 			
		 		}
		 		catch(Exception e){
		 			System.out.println( e.getMessage() + "You put a not valid value - Program closed \n" ) ; 
		 			System.out.println( "Insert 1 to return to main menu" ) ;
		 			input.nextLine();
		 			exit=input.nextInt();
		 			
		 		}
		 }
		
		

	}

}

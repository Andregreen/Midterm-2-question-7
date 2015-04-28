import java.util.Scanner;

public class PasswordAuthentication {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	String password ="bugaboo";
	
	System.out.print("Enter Password: ");
	String string=input.nextLine();
	input.close();

	if(password.equals(string)){
		System.out.println("Access Granted");
	}
	else{
		System.out.println("Access Denied.");
	}  

}
}	

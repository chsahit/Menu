package lib;
import java.util.Scanner;

public class Menu {
	
	public static void run(Action[] acts){
		Scanner userIn=new Scanner(System.in);
		System.out.println("Welcome!");
		while(true){
			System.out.println("Would you like to:");
			int i;
			for(i=0;i<acts.length;i++){
				System.out.println((i+1)+".) "+acts[i].getPrompt());
			}
			System.out.println((i+1)+".) "+"Exit the Program");
			String commandStr=userIn.nextLine(); 
			int command=Integer.parseInt(commandStr);
			if(command==acts.length+1){
				userIn.close();
				System.exit(0);
			}
			else if(command>(acts.length+1)){
				System.out.println("Invalid Command");
			}
			else{						
				acts[command-1].run();
			}
		}
		
	}
}

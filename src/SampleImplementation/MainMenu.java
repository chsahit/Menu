package SampleImplementation;

import lib.*;

public class MainMenu extends Menu{
	// this is the main class
	public static void main(String[] args) {		
		Action[] acts=new Action[2]; //create the action array
		acts[0]=new Action1("Perform Action 1"); //set up the first action
		acts[1]=new Action2("Perform Action 2"); //set up the second action		
		run(acts); //run the menu
	}

}

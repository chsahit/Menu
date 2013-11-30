package SampleImplementation;

import lib.*;

public class MainMenu extends Menu{
	
	public static void main(String[] args) {
		Action[] acts=new Action[2];
		acts[0]=new Action1("Perform Action 1");
		acts[1]=new Action2("Perform Action 2");		
		run(acts);
	}

}

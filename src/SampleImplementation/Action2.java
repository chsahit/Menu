package SampleImplementation;

import lib.Action;

public class Action2 extends Action{
	
	public Action2(String prompt) {
		super(prompt);		
	}

	@Override
	public void run() {
		System.out.println("action 2 performed");
	}
	
}

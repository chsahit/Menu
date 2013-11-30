package SampleImplementation;
import lib.Action;
public class Action1 extends Action{
	
	
	public Action1(String prompt) {
		super(prompt);
	}

	//this is where the developer would write would each option would do
	@Override
	public void run() {
		System.out.println("action 1 performed"); 
	}
	
	

}

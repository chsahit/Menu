package lib;
public abstract class Action {
	String prompt; //The choice the user has
	public Action(String prompt){
		this.prompt=prompt;
	}	
	public abstract void run(); //Action that is performed  when this choice is picked 
	public String getPrompt(){
		return prompt;
	}	
}

package lib;
public abstract class Action {
	String prompt;
	public Action(String prompt){
		this.prompt=prompt;
	}	
	public abstract void run();
	public String getPrompt(){
		return prompt;
	}	
}

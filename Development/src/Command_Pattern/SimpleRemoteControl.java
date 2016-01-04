package Command_Pattern;

public class SimpleRemoteControl {
	Command slot;
	Command slot2;
	
	public SimpleRemoteControl(){}
	
	public void setCommand(Command command, Command offcommand){
		slot = command;
		slot2 = offcommand;
	}
	
	public void onButtonWasPressed(){
		slot.execute();
	}
	public void offButtonWasPushed(){
		slot2.execute();
	}
}

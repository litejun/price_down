package Command_Pattern;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class Main {
	public static void main(String args[]){
		List<Command> cmds = new ArrayList<Command>();
		
		cmds.add(new Command(){
			@Override
			public void execute(){
				System.out.println("���� ����!!");
			}
		});
		
		cmds.add(new Command(){
			@Override
			public void execute(){
				System.out.println("���尡�� � �Ա�!!");
			}
		});
		
		
		for(Command command : cmds){
			command.execute();
		}
	}
}

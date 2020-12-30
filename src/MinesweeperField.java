import javax.swing.JButton;
//i know, seperate view and game, but ugh... idk how right now and it works xD
public class MinesweeperField extends JButton{
		
	private int neighbourCount = 0;
	private boolean flagging = false;
	
	MinesweeperField(boolean isBomb) {
		
		if (isBomb)
			addActionListener(event -> boom());
		else 
			addActionListener(event -> reveal());
	}
	
	public void setNeighbourCount(int count) {
		
		neighbourCount = count;
	}
	
	public void toggleFlagMode() {
		
		flagging = !flagging;
	}
	
	private void boom() {
		
		if (flagging)
			setText("F");
		else
			setText("B");
	}
	
	private void reveal() {
		
		if (flagging)
			setText("F");
		else
			setText(Integer.toString(neighbourCount));
	}
}

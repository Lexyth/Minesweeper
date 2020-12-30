import java.awt.GridLayout;

import javax.swing.JPanel;

public class MinesweeperPanel extends JPanel{
	
	private int gridSize = 10;
	MinesweeperField[] fields = new MinesweeperField[gridSize*gridSize];

	MinesweeperPanel () {

		updateLayout();
	}
	
	public void setGridSize(int s) {
		
		gridSize = s;
		
		updateLayout();
	}
	
	public void updateLayout() {
		
		setLayout(new GridLayout(gridSize, gridSize));
		
		reset();
	}
	
	private void reset() {
		
		this.removeAll();
		
		int req = (int)(Math.random()*fields.length);
		
		fields[req] = new MinesweeperField(true);
		
		for (int i = 0; i < fields.length; i++) {
			
			if (i != req)
			fields[i] = new MinesweeperField(Math.random()<0.1?true:false);
			
			add(fields[i]);
		}
	}
	
	public void toggleDifficulty() {
		
		gridSize %= 30;

		gridSize += 10;
	}
}

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JPanel{
	
	private JButton buttonReset = new JButton("Reset");
	private JButton buttonToggleDifficulty = new JButton("Difficulty");
	private JLabel labelMessage = new JLabel("Have Fun!");
	private JLabel labelDifficulty = new JLabel("10");
	
	MinesweeperPanel gamePanel = new MinesweeperPanel();
		
	View () {
		
		setLayout(new GridLayout(2, 1));
		
		add(gamePanel);

		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(3, 1));
		JPanel resetBorder = new JPanel();
		resetBorder.add(buttonReset);
		controlPanel.add(resetBorder);

		JPanel inputRow = new JPanel();
		inputRow.add(buttonToggleDifficulty);
		inputRow.add(labelDifficulty);
		controlPanel.add(inputRow);

		controlPanel.add(labelMessage);

		add(controlPanel);
	}
	
	public void setResetListener(Runnable listener) {
		
		buttonReset.addActionListener(event -> listener.run());
	}
	
	public void setToggleDifficultyListener() {
		
		buttonToggleDifficulty.addActionListener(event -> gamePanel.toggleDifficulty());
	}
	
	public void changeDifficulty (int difficulty) {
		
		labelDifficulty.setText(Integer.toString(difficulty));
	}
	
	public void changeMessage(String message) {
		
		labelMessage.setText(message);
	}
}

package jedla.project.mines;

import javax.swing.JButton;

public class Cell {
	private JButton cel; // reference to jbutton
	private boolean bomb; // if contain bomb default value false
	private int nearBomb; // how many bomb is near
	
	// constructor
	public Cell(JButton cel) {
		super();
		this.cel = cel;
		this.bomb = false;
	}

	
	// getters and setters
	public JButton getCel() {
		return cel;
	}

	public void setCel(JButton cel) {
		this.cel = cel;
	}

	public boolean isBomb() {
		return bomb;
	}

	public void setBomb(boolean bomb) {
		this.bomb = bomb;
	}

	public int getNearBomb() {
		return nearBomb;
	}

	public void setNearBomb(int nearBomb) {
		this.nearBomb = nearBomb;
	}
	
	
}

package jedla.project.mines;

import javax.swing.JButton;

public class Cell {
	private JButton cel; // reference to jbutton
	private boolean bomb; // if contain bomb default value false
	private int nearBomb; // how many bomb is near
	private boolean uncovered;
	private boolean flag;

	// constructor
	public Cell(JButton cel) {
		super();
		this.cel = cel;
		this.bomb = false;
		this.uncovered = false;
		this.flag = false;
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

	public boolean isUncovered() {
		return uncovered;
	}

	public void setUncovered(boolean uncovered) {
		this.uncovered = uncovered;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	

}

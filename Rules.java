package jedla.project.mines;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import javax.swing.JButton;

public class Rules {
	private Random rand = new Random();
	private static Color miku = new Color(0, 236, 255); // for 0 bombs cells
	private static Color kaito = new Color(34, 9, 195); // for 1 bombs cells
	private static Color rin = new Color(216, 229, 0); // for 2 bombs cells
	private static Color luka = new Color(242, 179, 189); // for 3 bombs cells
	private static Color mikuLight = new Color(134, 206, 203); // for 4 bombs cells
	private static Color mikuSakura = new Color(57, 197, 187); // for 5 bombs cells
	private static Color salamandre = new Color(240, 94, 35); // for 5 bombs cells
	private static Color nearGumi = new Color(139, 142, 75); // for 7 bombs cells
	private static Color len = new Color(234, 212, 0); // for 8 bombs cells
	private static Color meiko = new Color(189, 4, 4); // for bombs

	// when click on cell do this
	public void onClicAction(ArrayList<ArrayList<Cell>> arr, JButton button) {
		// get id of clicked cell
		int[] position = this.findIdOfCell(arr, button);
		// if clicked on bomb show all bomb and disable buttons
		if (arr.get(position[0]).get(position[1]).isBomb() == true) {
			this.showBombs(arr);
			this.disableButtons(arr);
		} 
		// if clicked on cell which is not near bomb all nearly cells will be revealed
		else if (arr.get(position[0]).get(position[1]).getNearBomb() == 0) {
			this.findAllZeros(arr, position);
		} 
		// if near bomb show only how many bomb is near
		else {
			this.showNumberOfNearBomb(arr, position);
		}
	}

	public void findAllZeros(ArrayList<ArrayList<Cell>> arr, int[] position) {
		Queue<int[]> open = new LinkedList<int[]>(); // for all next position which i want to look
		ArrayList<int[]> close = new ArrayList<int[]>(); // contains all visited position
		open.add(position);
		// this.setZeroCell(arr, position[0], position[1]);
		while (open.peek() != null) {
			int[] pos = open.poll(); // get position from queue
			// if close contains position its not necessary vitit it again
			if (this.containsPosition(close, pos) == false) { 
				// only use position which is not out of range
				if (pos[0] >= 0 && pos[0] <= 9 && pos[1] >= 0 && pos[1] <= 9) {
					if (arr.get(pos[0]).get(pos[1]).getNearBomb() == 0) {
						this.setZeroCell(arr, pos[0], pos[1]);
						// set near position and add them to queue
						int[] posMinusY = { pos[0], pos[1] - 1 };
						int[] posPlusY = { pos[0], pos[1] + 1 };
						int[] posMinusX = { pos[0] - 1, pos[1] };
						int[] posPlusX = { pos[0] + 1, pos[1] };
						open.add(posMinusY);
						open.add(posPlusY);
						open.add(posMinusX);
						open.add(posPlusX);
					}
					// if bomb is near show cell with number to create border
					else {
						this.showNumberOfNearBomb(arr, pos);
					}
				}
				close.add(pos);
			}
		}

	}

	// if array contains position
	// this method is for support for findAllZeros
	public boolean containsPosition(ArrayList<int[]> arr, int[] pos) {
		for (int i = 0; i < arr.size(); i++) {
			int[] h = arr.get(i);
			if (h[0] == pos[0] && h[1] == pos[1]) {
				return true;
			}
		}
		return false;
	}

	// set cell which is not near bomb to color and disable them
	public void setZeroCell(ArrayList<ArrayList<Cell>> arr, int positionX, int positionY) {
		arr.get(positionX).get(positionY).getCel().setBackground(miku);
		arr.get(positionX).get(positionY).getCel().setEnabled(false);
	}

	// help for finding positions of cell
	public int[] findIdOfCell(ArrayList<ArrayList<Cell>> arr, JButton button) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				if (arr.get(i).get(j).getCel() == button) {
					int[] h = { i, j };
					return h;
				}
			}
		}
		// if not contains the button return error -1
		// this suppose to never happen
		int[] h = { -1, -1 };
		return h;
	}

	// initialization of 10 bombs
	public void setBombs(ArrayList<ArrayList<Cell>> arr) {
		int randX = 0; // x position for bomb
		int randY = 0; // y position for bomb
		// set 10 bombs randomly in grid
		for (int i = 0; i < 10; i++) {
			randX = rand.nextInt(10);
			randY = rand.nextInt(10);
			arr.get(randX).get(randY).setBomb(true);
		}
	}

	// show all bombs and numbers of near bomb
	// TODO delete else branch
	public void showBombs(ArrayList<ArrayList<Cell>> arr) {
		//int nearBomb; // number of near bomb from Cell
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				// if cell contains bomb set text on button to B and RED background
				if (arr.get(i).get(j).isBomb() == true) {
					arr.get(i).get(j).getCel().setText("B");
					arr.get(i).get(j).getCel().setBackground(meiko);
				}/*
				// set number of near bomb on button
				else {
					nearBomb = arr.get(i).get(j).getNearBomb();
					//arr.get(i).get(j).getCel().setText(Integer.toString(nearBomb));
				}*/
			}

		}
	}

	// show number of near bombs and change color by number
	public void showNumberOfNearBomb(ArrayList<ArrayList<Cell>> arr, int[] position) {
		int nearBomb = arr.get(position[0]).get(position[1]).getNearBomb();
		if (nearBomb == 1) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(kaito);
		} else if (nearBomb == 2) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(rin);
		} else if (nearBomb == 3) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(luka);
		} else if (nearBomb == 4) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(mikuLight);
		} else if (nearBomb == 5) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(mikuSakura);
		} else if (nearBomb == 6) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(salamandre);
		} else if (nearBomb == 7) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(nearGumi);
		} else if (nearBomb == 8) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(len);
		}
		arr.get(position[0]).get(position[1]).getCel().setText(Integer.toString(nearBomb));
		arr.get(position[0]).get(position[1]).getCel().setEnabled(false);

	}

	// for disable all cells
	public void disableButtons(ArrayList<ArrayList<Cell>> arr) {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				arr.get(i).get(j).getCel().setEnabled(false);
			}

		}

	}

	public void findNearBomb(ArrayList<ArrayList<Cell>> arr) {
		int counter;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				counter = 0;
				// for first row
				if (i == 0) {
					// for first column
					if (j == 0) {
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j + 1).isBomb() == true) {
							counter++;
						}
					}
					// for last column
					else if (j == 9) {
						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j - 1).isBomb() == true) {
							counter++;
						}
					}
					// for middle
					else {
						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j + 1).isBomb() == true) {
							counter++;
						}
					}
				}
				// for last row
				else if (i == 9) {
					// for first column
					if (j == 0) {
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j + 1).isBomb() == true) {
							counter++;
						}
					}
					// for last column
					else if (j == 9) {
						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j - 1).isBomb() == true) {
							counter++;
						}
					}
					// for middle
					else {
						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j + 1).isBomb() == true) {
							counter++;
						}
					}
				} else {
					// first column
					if (j == 0) {
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j + 1).isBomb() == true) {
							counter++;
						}
					}
					// last column
					else if (j == 9) {

						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j - 1).isBomb() == true) {
							counter++;
						}
					}
					// middle
					else {
						if (arr.get(i).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i + 1).get(j - 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j + 1).isBomb() == true) {
							counter++;
						}
						if (arr.get(i - 1).get(j - 1).isBomb() == true) {
							counter++;
						}
					}
				}
				arr.get(i).get(j).setNearBomb(counter);
			}
		}
	}
}

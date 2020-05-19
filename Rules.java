package jedla.project.mines;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import javax.swing.JButton;

public class Rules {
	private Random rand = new Random();
	private static Color miku = new Color(0,236,255); // for 0 bombs cells
	private static Color kaito = new Color(34,9,195); // for 1 bombs cells
	private static Color rin = new Color(216,229,0); // for 2 bombs cells
	private static Color luka = new Color(242,179,189); // for 3 bombs cells
	private static Color mikuLight = new Color(134, 206, 203); // for 4 bombs cells
	private static Color mikuSakura = new Color(57, 197, 187); // for 5 bombs cells
	private static Color salamandre = new Color(240, 94, 35); // for 5 bombs cells
	private static Color nearGumi = new Color(139,142,75); // for 7 bombs cells
	private static Color len = new Color(234,212,0); // for 8 bombs cells
	private static Color meiko = new Color(189,4,4); // for bombs
	

	public void onClicAction(ArrayList<ArrayList<Cell>> arr, JButton button) {
		// get id of clicked cell
		int[] position = this.findIdOfCell(arr, button);
		// if clicked on bomb show all bomb and disable buttons
		if (arr.get(position[0]).get(position[1]).isBomb() == true) {
			this.showBombs(arr);
			this.disableButtons(arr);
		} else if (arr.get(position[0]).get(position[1]).getNearBomb() == 0) {
			arr.get(position[0]).get(position[1]).getCel().setBackground(miku);
		} else {
			this.showNumberOfNearBomb(arr, position);
		}
	}
	
	public void findAllZeros(ArrayList<ArrayList<Cell>> arr, int[] position) {
		Queue<Integer[] > open = new LinkedList<Integer[]>(); // for all next position which i want to look
		ArrayList<Integer[] > close = new ArrayList<Integer[]>(); // contains all visited position
		
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
	// TESTING FUNCTION
	// TODO change to show only Bombs and not be testing function
	public void showBombs(ArrayList<ArrayList<Cell>> arr) {
		int nearBomb; // number of near bomb from Cell
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				// if cell contains bomb set text on button to B and RED background
				if (arr.get(i).get(j).isBomb() == true) {
					arr.get(i).get(j).getCel().setText("B");
					arr.get(i).get(j).getCel().setBackground(meiko);
				}
				// set number of near bomb on button
				else {
					nearBomb = arr.get(i).get(j).getNearBomb();
					arr.get(i).get(j).getCel().setText(Integer.toString(nearBomb));
				}
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

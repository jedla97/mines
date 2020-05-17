package jedla.project.mines;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Rules {
	private Random rand = new Random();

	public void setBombs(ArrayList<ArrayList<Cell>> arr) {
		int randX = 0;
		int randY = 0;
		for (int i = 0; i < 10; i++) {
			randX = rand.nextInt(10);
			randY = rand.nextInt(10);
			arr.get(randX).get(randY).setBomb(true);
		}
	}

	public void showBombs(ArrayList<ArrayList<Cell>> arr) {
		int nearBomb;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				if (arr.get(i).get(j).isBomb() == true) {
					arr.get(i).get(j).getCel().setText("B");
					arr.get(i).get(j).getCel().setBackground(Color.red);
				} else {
					nearBomb = arr.get(i).get(j).getNearBomb();
					arr.get(i).get(j).getCel().setText(Integer.toString(nearBomb));
				}
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

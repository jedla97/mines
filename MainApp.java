package jedla.project.mines;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainApp {

	private int counter = 0;
	private int clicCounter = 0;
	private JFrame frame;
	private JTextField flagCounter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		Rules r = new Rules();
		ArrayList<ArrayList<Cell>> list = initialize(r);
		r.setBombs(list);
		r.findNearBomb(list);
		//r.showBombs(list);
		System.out.println();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private ArrayList<ArrayList<Cell>> initialize(Rules r) {
		ArrayList<ArrayList<Cell>> cels = new ArrayList<ArrayList<Cell>>(); // for cells
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 514, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextField winner = new JTextField();
		winner.setBounds(100, 190, 300, 150);
		frame.getContentPane().add(winner);
		winner.setColumns(15);
		winner.setEditable(false);
		winner.setText("WINNER");
		winner.setHorizontalAlignment(JTextField.CENTER);
		winner.setBorder(null);
		winner.setVisible(false);
		
		// create dynamic field of buttons
		// for now is set to 10x10 field
		for (int i = 40; i <= 490; i = i + 50) {
			ArrayList<Cell> cel = new ArrayList<Cell>();
			for (int j = 0; j <= 450; j = j + 50) {
				JButton button = new JButton("");
				button.setBounds(j, i, 50, 50);
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if (clicCounter % 2 == 0) {
							r.onClicAction(cels, button);
						} else {
							r.setFlag(cels, button);
							r.setCounter(flagCounter, r.numberOfFlags(cels));
						}
						if(r.isWinner(cels)== true) {
							winner.setVisible(true);
						}
					}

				});
				frame.getContentPane().add(button);
				Cell c = new Cell(button);
				cel.add(c);
			}
			cels.add(cel);
		}

		
		flagCounter = new JTextField();
		flagCounter.setBounds(105, 1, 85, 38);
		frame.getContentPane().add(flagCounter);
		flagCounter.setColumns(10);
		flagCounter.setEditable(false);
		flagCounter.setText("Used flags = 0");
		flagCounter.setHorizontalAlignment(JTextField.CENTER);
		flagCounter.setBorder(null);

		JButton flag = new JButton("Flag");
		flag.setBounds(305, 0, 85, 40);
		frame.getContentPane().add(flag);

		flag.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clicCounter++;
			}

		});

		JButton newGame = new JButton("NewGame");
		newGame.setBounds(205, 0, 85, 40);
		frame.getContentPane().add(newGame);

		newGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				r.initCell(cels);
				counter = 0;
				clicCounter = 0;
				r.setCounter(flagCounter, counter);
			}

		});

		return cels;
	}
}

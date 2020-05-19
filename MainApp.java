package jedla.project.mines;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MainApp {

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
		
		// create dynamic field of buttons
		// for now is set to 10x10 field
		for(int i = 40; i <= 490 ;i = i + 50) {
			ArrayList<Cell> cel = new ArrayList<Cell>();
			for(int j = 0; j <= 450 ;j = j + 50) {
				JButton button = new JButton("");
				button.setBounds(j, i, 50, 50);
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						button.setBackground(Color.blue);
						r.onClicAction(cels, button);
						button.setEnabled(false);
					}
					
				});
				frame.getContentPane().add(button);
				Cell c = new Cell(button);
				cel.add(c);				
			}
			cels.add(cel);
		}
		
		JButton newGame = new JButton("NewGame");
		newGame.setBounds(205, 0, 85, 40);
		frame.getContentPane().add(newGame);
		
		JButton flag = new JButton("Flag");
		flag.setBounds(305, 0, 85, 40);
		frame.getContentPane().add(flag);
		
		flagCounter = new JTextField();
		flagCounter.setBounds(105, 1, 85, 40);
		frame.getContentPane().add(flagCounter);
		flagCounter.setColumns(10);
		
		JButton flag_1 = new JButton("Flag");
		flag_1.setBounds(405, 0, 85, 40);
		frame.getContentPane().add(flag_1);
		return cels;
	}
}

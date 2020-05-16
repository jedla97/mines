package jedla.project.mines;

import java.awt.EventQueue;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 514, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton  cell_1_1 = new JButton("");
		cell_1_1.setBounds(0, 40, 50, 50);
		frame.getContentPane().add(cell_1_1);
		
		JButton cell_2_1 = new JButton("");
		cell_2_1.setBounds(50, 40, 50, 50);
		frame.getContentPane().add(cell_2_1);

		JButton cell_3_1 = new JButton("");
		cell_3_1.setBounds(100, 40, 50, 50);
		frame.getContentPane().add(cell_3_1);
		
		JButton cell_4_1 = new JButton("");
		cell_4_1.setBounds(150, 40, 50, 50);
		frame.getContentPane().add(cell_4_1);
		
		JButton cell_5_1 = new JButton("");
		cell_5_1.setBounds(200, 40, 50, 50);
		frame.getContentPane().add(cell_5_1);
		
		JButton cell_6_1 = new JButton("");
		cell_6_1.setBounds(250, 40, 50, 50);
		frame.getContentPane().add(cell_6_1);
		
		JButton cell_7_1 = new JButton("");
		cell_7_1.setBounds(300, 40, 50, 50);
		frame.getContentPane().add(cell_7_1);
		
		JButton cell_8_1 = new JButton("");
		cell_8_1.setBounds(350, 40, 50, 50);
		frame.getContentPane().add(cell_8_1);
		
		JButton cell_9_1 = new JButton("");
		cell_9_1.setBounds(400, 40, 50, 50);
		frame.getContentPane().add(cell_9_1);
		
		JButton cell_10_1 = new JButton("");
		cell_10_1.setBounds(450, 40, 50, 50);
		frame.getContentPane().add(cell_10_1);
		
		JButton cell_1_2 = new JButton("");
		cell_1_2.setBounds(0, 90, 50, 50);
		frame.getContentPane().add(cell_1_2);
		
		JButton cell_2_2 = new JButton("");
		cell_2_2.setBounds(50, 90, 50, 50);
		frame.getContentPane().add(cell_2_2);
		
		JButton cell_3_2 = new JButton("");
		cell_3_2.setBounds(100, 90, 50, 50);
		frame.getContentPane().add(cell_3_2);
		
		JButton cell_4_2 = new JButton("");
		cell_4_2.setBounds(150, 90, 50, 50);
		frame.getContentPane().add(cell_4_2);
		
		JButton cell_5_2 = new JButton("");
		cell_5_2.setBounds(200, 90, 50, 50);
		frame.getContentPane().add(cell_5_2);
		
		JButton cell_6_2 = new JButton("");
		cell_6_2.setBounds(250, 90, 50, 50);
		frame.getContentPane().add(cell_6_2);
		
		JButton cell_7_2 = new JButton("");
		cell_7_2.setBounds(300, 90, 50, 50);
		frame.getContentPane().add(cell_7_2);
		
		JButton cell_8_2 = new JButton("");
		cell_8_2.setBounds(350, 90, 50, 50);
		frame.getContentPane().add(cell_8_2);
		
		JButton cell_9_2 = new JButton("");
		cell_9_2.setBounds(400, 90, 50, 50);
		frame.getContentPane().add(cell_9_2);
		
		JButton cell_10_2 = new JButton("");
		cell_10_2.setBounds(450, 90, 50, 50);
		frame.getContentPane().add(cell_10_2);
		
		JButton cell_1_3 = new JButton("");
		cell_1_3.setBounds(0, 140, 50, 50);
		frame.getContentPane().add(cell_1_3);
		
		JButton cell_2_3 = new JButton("");
		cell_2_3.setBounds(50, 140, 50, 50);
		frame.getContentPane().add(cell_2_3);
		
		JButton cell_3_3 = new JButton("");
		cell_3_3.setBounds(100, 140, 50, 50);
		frame.getContentPane().add(cell_3_3);
		
		JButton cell_4_3 = new JButton("");
		cell_4_3.setBounds(150, 140, 50, 50);
		frame.getContentPane().add(cell_4_3);
		
		JButton cell_5_3 = new JButton("");
		cell_5_3.setBounds(200, 140, 50, 50);
		frame.getContentPane().add(cell_5_3);
		
		JButton cell_6_3 = new JButton("");
		cell_6_3.setBounds(250, 140, 50, 50);
		frame.getContentPane().add(cell_6_3);
		
		JButton cell_7_3 = new JButton("");
		cell_7_3.setBounds(300, 140, 50, 50);
		frame.getContentPane().add(cell_7_3);
		
		JButton cell_8_3 = new JButton("");
		cell_8_3.setBounds(350, 140, 50, 50);
		frame.getContentPane().add(cell_8_3);
		
		JButton cell_9_3 = new JButton("");
		cell_9_3.setBounds(400, 140, 50, 50);
		frame.getContentPane().add(cell_9_3);
		
		JButton cell_10_3 = new JButton("");
		cell_10_3.setBounds(450, 140, 50, 50);
		frame.getContentPane().add(cell_10_3);
		
		JButton cell_1_4 = new JButton("");
		cell_1_4.setBounds(0, 190, 50, 50);
		frame.getContentPane().add(cell_1_4);
		
		JButton cell_2_4 = new JButton("");
		cell_2_4.setBounds(50, 190, 50, 50);
		frame.getContentPane().add(cell_2_4);
		
		JButton cell_3_4 = new JButton("");
		cell_3_4.setBounds(100, 190, 50, 50);
		frame.getContentPane().add(cell_3_4);
		
		JButton cell_4_4 = new JButton("");
		cell_4_4.setBounds(150, 190, 50, 50);
		frame.getContentPane().add(cell_4_4);
		
		JButton cell_5_4 = new JButton("");
		cell_5_4.setBounds(200, 190, 50, 50);
		frame.getContentPane().add(cell_5_4);
		
		JButton cell_6_4 = new JButton("");
		cell_6_4.setBounds(250, 190, 50, 50);
		frame.getContentPane().add(cell_6_4);
		
		JButton cell_7_4 = new JButton("");
		cell_7_4.setBounds(300, 190, 50, 50);
		frame.getContentPane().add(cell_7_4);
		
		JButton cell_8_4 = new JButton("");
		cell_8_4.setBounds(350, 190, 50, 50);
		frame.getContentPane().add(cell_8_4);
		
		JButton cell_9_4 = new JButton("");
		cell_9_4.setBounds(400, 190, 50, 50);
		frame.getContentPane().add(cell_9_4);
		
		JButton cell_10_4 = new JButton("");
		cell_10_4.setBounds(450, 190, 50, 50);
		frame.getContentPane().add(cell_10_4);
		
		JButton cell_1_5 = new JButton("");
		cell_1_5.setBounds(0, 240, 50, 50);
		frame.getContentPane().add(cell_1_5);
		
		JButton cell_2_5 = new JButton("");
		cell_2_5.setBounds(50, 240, 50, 50);
		frame.getContentPane().add(cell_2_5);
		
		JButton cell_3_5 = new JButton("");
		cell_3_5.setBounds(100, 240, 50, 50);
		frame.getContentPane().add(cell_3_5);
		
		JButton cell_4_5 = new JButton("");
		cell_4_5.setBounds(150, 240, 50, 50);
		frame.getContentPane().add(cell_4_5);
		
		JButton cell_5_5 = new JButton("");
		cell_5_5.setBounds(200, 240, 50, 50);
		frame.getContentPane().add(cell_5_5);
		
		JButton cell_6_5 = new JButton("");
		cell_6_5.setBounds(250, 240, 50, 50);
		frame.getContentPane().add(cell_6_5);
		
		JButton cell_7_5 = new JButton("");
		cell_7_5.setBounds(300, 240, 50, 50);
		frame.getContentPane().add(cell_7_5);
		
		JButton cell_8_5 = new JButton("");
		cell_8_5.setBounds(350, 240, 50, 50);
		frame.getContentPane().add(cell_8_5);
		
		JButton cell_9_5 = new JButton("");
		cell_9_5.setBounds(400, 240, 50, 50);
		frame.getContentPane().add(cell_9_5);
		
		JButton cell_10_5 = new JButton("");
		cell_10_5.setBounds(450, 240, 50, 50);
		frame.getContentPane().add(cell_10_5);
		
		JButton cell_1_6 = new JButton("");
		cell_1_6.setBounds(0, 290, 50, 50);
		frame.getContentPane().add(cell_1_6);
		
		JButton cell_2_6 = new JButton("");
		cell_2_6.setBounds(50, 290, 50, 50);
		frame.getContentPane().add(cell_2_6);
		
		JButton cell_3_6 = new JButton("");
		cell_3_6.setBounds(100, 290, 50, 50);
		frame.getContentPane().add(cell_3_6);
		
		JButton cell_4_6 = new JButton("");
		cell_4_6.setBounds(150, 290, 50, 50);
		frame.getContentPane().add(cell_4_6);
		
		JButton cell_5_6 = new JButton("");
		cell_5_6.setBounds(200, 290, 50, 50);
		frame.getContentPane().add(cell_5_6);
		
		JButton cell_6_6 = new JButton("");
		cell_6_6.setBounds(250, 290, 50, 50);
		frame.getContentPane().add(cell_6_6);
		
		JButton cell_7_6 = new JButton("");
		cell_7_6.setBounds(300, 290, 50, 50);
		frame.getContentPane().add(cell_7_6);
		
		JButton cell_8_6 = new JButton("");
		cell_8_6.setBounds(350, 290, 50, 50);
		frame.getContentPane().add(cell_8_6);
		
		JButton cell_9_6 = new JButton("");
		cell_9_6.setBounds(400, 290, 50, 50);
		frame.getContentPane().add(cell_9_6);
		
		JButton cell_10_6 = new JButton("");
		cell_10_6.setBounds(450, 290, 50, 50);
		frame.getContentPane().add(cell_10_6);
		
		JButton cell_1_7 = new JButton("");
		cell_1_7.setBounds(0, 340, 50, 50);
		frame.getContentPane().add(cell_1_7);
		
		JButton cell_2_7 = new JButton("");
		cell_2_7.setBounds(50, 340, 50, 50);
		frame.getContentPane().add(cell_2_7);
		
		JButton cell_3_7 = new JButton("");
		cell_3_7.setBounds(100, 340, 50, 50);
		frame.getContentPane().add(cell_3_7);
		
		JButton cell_4_7 = new JButton("");
		cell_4_7.setBounds(150, 340, 50, 50);
		frame.getContentPane().add(cell_4_7);
		
		JButton cell_5_7 = new JButton("");
		cell_5_7.setBounds(200, 340, 50, 50);
		frame.getContentPane().add(cell_5_7);
		
		JButton cell_6_7 = new JButton("");
		cell_6_7.setBounds(250, 340, 50, 50);
		frame.getContentPane().add(cell_6_7);
		
		JButton cell_7_7 = new JButton("");
		cell_7_7.setBounds(300, 340, 50, 50);
		frame.getContentPane().add(cell_7_7);
		
		JButton cell_8_7 = new JButton("");
		cell_8_7.setBounds(350, 340, 50, 50);
		frame.getContentPane().add(cell_8_7);
		
		JButton cell_9_7 = new JButton("");
		cell_9_7.setBounds(400, 340, 50, 50);
		frame.getContentPane().add(cell_9_7);
		
		JButton cell_10_7 = new JButton("");
		cell_10_7.setBounds(450, 340, 50, 50);
		frame.getContentPane().add(cell_10_7);
		
		JButton cell_1_8 = new JButton("");
		cell_1_8.setBounds(0, 390, 50, 50);
		frame.getContentPane().add(cell_1_8);
		
		JButton cell_2_8 = new JButton("");
		cell_2_8.setBounds(50, 390, 50, 50);
		frame.getContentPane().add(cell_2_8);
		
		JButton cell_3_8 = new JButton("");
		cell_3_8.setBounds(100, 390, 50, 50);
		frame.getContentPane().add(cell_3_8);
		
		JButton cell_4_8 = new JButton("");
		cell_4_8.setBounds(150, 390, 50, 50);
		frame.getContentPane().add(cell_4_8);
		
		JButton cell_5_8 = new JButton("");
		cell_5_8.setBounds(200, 390, 50, 50);
		frame.getContentPane().add(cell_5_8);
		
		JButton cell_6_8 = new JButton("");
		cell_6_8.setBounds(250, 390, 50, 50);
		frame.getContentPane().add(cell_6_8);
		
		JButton cell_7_8 = new JButton("");
		cell_7_8.setBounds(300, 390, 50, 50);
		frame.getContentPane().add(cell_7_8);
		
		JButton cell_8_8 = new JButton("");
		cell_8_8.setBounds(350, 390, 50, 50);
		frame.getContentPane().add(cell_8_8);
		
		JButton cell_9_8 = new JButton("");
		cell_9_8.setBounds(400, 390, 50, 50);
		frame.getContentPane().add(cell_9_8);
		
		JButton cell_10_8 = new JButton("");
		cell_10_8.setBounds(450, 390, 50, 50);
		frame.getContentPane().add(cell_10_8);
		
		JButton cell_1_9 = new JButton("");
		cell_1_9.setBounds(0, 440, 50, 50);
		frame.getContentPane().add(cell_1_9);
		
		JButton cell_2_9 = new JButton("");
		cell_2_9.setBounds(50, 440, 50, 50);
		frame.getContentPane().add(cell_2_9);
		
		JButton cell_3_9 = new JButton("");
		cell_3_9.setBounds(100, 440, 50, 50);
		frame.getContentPane().add(cell_3_9);
		
		JButton cell_4_9 = new JButton("");
		cell_4_9.setBounds(150, 440, 50, 50);
		frame.getContentPane().add(cell_4_9);
		
		JButton cell_5_9 = new JButton("");
		cell_5_9.setBounds(200, 440, 50, 50);
		frame.getContentPane().add(cell_5_9);
		
		JButton cell_6_9 = new JButton("");
		cell_6_9.setBounds(250, 440, 50, 50);
		frame.getContentPane().add(cell_6_9);
		
		JButton cell_7_9 = new JButton("");
		cell_7_9.setBounds(300, 440, 50, 50);
		frame.getContentPane().add(cell_7_9);
		
		JButton cell_8_9 = new JButton("");
		cell_8_9.setBounds(350, 440, 50, 50);
		frame.getContentPane().add(cell_8_9);
		
		JButton cell_9_9 = new JButton("");
		cell_9_9.setBounds(400, 440, 50, 50);
		frame.getContentPane().add(cell_9_9);
		
		JButton cell_10_9 = new JButton("");
		cell_10_9.setBounds(450, 440, 50, 50);
		frame.getContentPane().add(cell_10_9);		
				
		JButton cell_1_10 = new JButton("");
		cell_1_10.setBounds(0, 490, 50, 50);
		frame.getContentPane().add(cell_1_10);
		
		JButton cell_2_10 = new JButton("");
		cell_2_10.setBounds(50, 490, 50, 50);
		frame.getContentPane().add(cell_2_10);
		
		JButton cell_3_10 = new JButton("");
		cell_3_10.setBounds(100, 490, 50, 50);
		frame.getContentPane().add(cell_3_10);
		
		JButton cell_4_10 = new JButton("");
		cell_4_10.setBounds(150, 490, 50, 50);
		frame.getContentPane().add(cell_4_10);
		
		JButton cell_5_10 = new JButton("");
		cell_5_10.setBounds(200, 490, 50, 50);
		frame.getContentPane().add(cell_5_10);
		
		JButton cell_6_10 = new JButton("");
		cell_6_10.setBounds(250, 490, 50, 50);
		frame.getContentPane().add(cell_6_10);
		
		JButton cell_7_10 = new JButton("");
		cell_7_10.setBounds(300, 490, 50, 50);
		frame.getContentPane().add(cell_7_10);
		
		JButton cell_8_10 = new JButton("");
		cell_8_10.setBounds(350, 490, 50, 50);
		frame.getContentPane().add(cell_8_10);
		
		JButton cell_9_10 = new JButton("");
		cell_9_10.setBounds(400, 490, 50, 50);
		frame.getContentPane().add(cell_9_10);
		
		JButton cell_10_10 = new JButton("");
		cell_10_10.setBounds(450, 490, 50, 50);
		frame.getContentPane().add(cell_10_10);
		
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
	}
}

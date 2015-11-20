package game;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board {
	protected JButton[] button = new JButton[72];

	public Board(){
		JPanel board = new JPanel();
		for (int i = 0; i<72; i++){
			button[i] = new JButton(Integer.toString(i));
			board.add(button[i]);
		}
		board.setLayout(new GridLayout(8,9));
		board.setVisible(true);		
		frame().add(board);
	}
	
	private JFrame frame(){
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setPreferredSize(new Dimension(500,500));
		window.setTitle("GGame");
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		return window;
	}
	
	 void update(String[] position){
		for(int i = 0; i < 72; i++){
			button[i].setText(position[i]);
		}
	}
}

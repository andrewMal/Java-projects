package ticTacToeMVCfinal;

import java.awt.EventQueue;


public class TicTacToeApp {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGui frame = new TicTacToeGui();
					frame.setLocationRelativeTo(null);//center of the screen
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		TicTacToeGame.tr.Grid();
		
	}

}

package ticTacToeMVCfinal;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class TicTacToeGui extends JFrame {//view

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public TicTacToeGui() {
		setTitle("Triliza (tic tac) game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton zeroZero = new JButton("");
		//zeroZero.setPreferredSize(new Dimension(20,20));
		zeroZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		zeroZero.setBackground(new Color(255, 255, 224));
		zeroZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(0,0,TicTacToeGame.turn)==1 ){
					zeroZero.setText("X");
				}
				else zeroZero.setText("O");
				zeroZero.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
//				if(TrilizaGame.restart){
//					zeroZero.setText("");
//					TrilizaGame.restart=false;
//				}
			}
		});
		GridBagConstraints gbc_zeroZero = new GridBagConstraints();
		gbc_zeroZero.fill = GridBagConstraints.BOTH;
		gbc_zeroZero.ipadx = 40;
		gbc_zeroZero.ipady = 40;
		gbc_zeroZero.insets = new Insets(0, 0, 5, 5);
		gbc_zeroZero.gridx = 0;
		gbc_zeroZero.gridy = 0;
		contentPane.add(zeroZero, gbc_zeroZero);
		
		JButton zeroOne = new JButton("");
		zeroOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		zeroOne.setBackground(new Color(255, 255, 224));
		zeroOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(0,1,TicTacToeGame.turn)==1){
					zeroOne.setText("X");
				}
				else zeroOne.setText("O");
				zeroOne.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		GridBagConstraints gbc_zeroOne = new GridBagConstraints();
		gbc_zeroOne.fill = GridBagConstraints.BOTH;
		gbc_zeroOne.ipady = 40;
		gbc_zeroOne.ipadx = 40;
		gbc_zeroOne.insets = new Insets(0, 0, 5, 5);
		gbc_zeroOne.gridx = 1;
		gbc_zeroOne.gridy = 0;
		contentPane.add(zeroOne, gbc_zeroOne);
		
		JButton zeroTwo = new JButton("");
		zeroTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(0,2,TicTacToeGame.turn)==1){
					zeroTwo.setText("X");
				}
				else zeroTwo.setText("O");
				zeroTwo.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		zeroTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
		zeroTwo.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_zeroTwo = new GridBagConstraints();
		gbc_zeroTwo.fill = GridBagConstraints.BOTH;
		gbc_zeroTwo.ipady = 40;
		gbc_zeroTwo.ipadx = 40;
		gbc_zeroTwo.insets = new Insets(0, 0, 5, 5);
		gbc_zeroTwo.gridx = 2;
		gbc_zeroTwo.gridy = 0;
		contentPane.add(zeroTwo, gbc_zeroTwo);
		
		JButton oneZero = new JButton("");
		oneZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(1,0,TicTacToeGame.turn)==1){
					oneZero.setText("X");
				}
				else oneZero.setText("O");
				oneZero.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		
		oneZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneZero.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_oneZero = new GridBagConstraints();
		gbc_oneZero.fill = GridBagConstraints.BOTH;
		gbc_oneZero.ipady = 40;
		gbc_oneZero.ipadx = 40;
		gbc_oneZero.insets = new Insets(0, 0, 5, 5);
		gbc_oneZero.gridx = 0;
		gbc_oneZero.gridy = 1;
		contentPane.add(oneZero, gbc_oneZero);
		
		JButton oneOne = new JButton("");
		oneOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(1,1,TicTacToeGame.turn)==1){
					oneOne.setText("X");
				}
				else oneOne.setText("O");
				oneOne.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		oneOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneOne.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_oneOne = new GridBagConstraints();
		gbc_oneOne.fill = GridBagConstraints.BOTH;
		gbc_oneOne.ipady = 40;
		gbc_oneOne.ipadx = 40;
		gbc_oneOne.insets = new Insets(0, 0, 5, 5);
		gbc_oneOne.gridx = 1;
		gbc_oneOne.gridy = 1;
		contentPane.add(oneOne, gbc_oneOne);
		
		JButton oneTwo = new JButton("");
		oneTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(1,2,TicTacToeGame.turn)==1){
					oneTwo.setText("X");
				}
				else oneTwo.setText("O");
				oneTwo.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		oneTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
		oneTwo.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_oneTwo = new GridBagConstraints();
		gbc_oneTwo.fill = GridBagConstraints.BOTH;
		gbc_oneTwo.ipady = 40;
		gbc_oneTwo.ipadx = 40;
		gbc_oneTwo.insets = new Insets(0, 0, 5, 5);
		gbc_oneTwo.gridx = 2;
		gbc_oneTwo.gridy = 1;
		contentPane.add(oneTwo, gbc_oneTwo);
		
		JButton twoZero = new JButton("");
		twoZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(2,0,TicTacToeGame.turn)==1){
					twoZero.setText("X");
				}
				else twoZero.setText("O");
				twoZero.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		
		
		twoZero.setFont(new Font("Tahoma", Font.BOLD, 20));
		twoZero.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_twoZero = new GridBagConstraints();
		gbc_twoZero.fill = GridBagConstraints.BOTH;
		gbc_twoZero.ipady = 40;
		gbc_twoZero.ipadx = 40;
		gbc_twoZero.insets = new Insets(0, 0, 0, 5);
		gbc_twoZero.gridx = 0;
		gbc_twoZero.gridy = 2;
		contentPane.add(twoZero, gbc_twoZero);
		
		JButton twoOne = new JButton("");
		twoOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(2,1,TicTacToeGame.turn)==1){
					twoOne.setText("X");
				}
				else twoOne.setText("O");
				twoOne.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		twoOne.setFont(new Font("Tahoma", Font.BOLD, 20));
		twoOne.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_twoOne = new GridBagConstraints();
		gbc_twoOne.fill = GridBagConstraints.BOTH;
		gbc_twoOne.ipady = 40;
		gbc_twoOne.ipadx = 40;
		gbc_twoOne.insets = new Insets(0, 0, 0, 5);
		gbc_twoOne.gridx = 1;
		gbc_twoOne.gridy = 2;
		contentPane.add(twoOne, gbc_twoOne);
		
		JButton twoTwo = new JButton("");
		twoTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TicTacToeGame.doSetValue(2,2,TicTacToeGame.turn)==1){
					twoTwo.setText("X");
				}
				else twoTwo.setText("O");
				twoTwo.setEnabled(false);
				TicTacToeGame.turn++;
				TicTacToeGame.doCheckForTriliza();
			}
		});
		twoTwo.setFont(new Font("Tahoma", Font.BOLD, 20));
		twoTwo.setBackground(new Color(255, 255, 224));
		GridBagConstraints gbc_twoTwo = new GridBagConstraints();
		gbc_twoTwo.insets = new Insets(0, 0, 0, 5);
		gbc_twoTwo.fill = GridBagConstraints.BOTH;
		gbc_twoTwo.ipady = 40;
		gbc_twoTwo.ipadx = 40;
		gbc_twoTwo.gridx = 2;
		gbc_twoTwo.gridy = 2;
		contentPane.add(twoTwo, gbc_twoTwo);
		
		JLabel playerOnewins = new JLabel("Player(X) wins "+TicTacToeGame.winX);
		playerOnewins.setFont(new Font("Tahoma", Font.BOLD, 13));
		playerOnewins.setForeground(Color.BLUE);
		GridBagConstraints gbc_playerOnewins = new GridBagConstraints();
		gbc_playerOnewins.insets = new Insets(0, 0, 5, 0);
		gbc_playerOnewins.gridx = 3;
		gbc_playerOnewins.gridy = 0;
		contentPane.add(playerOnewins, gbc_playerOnewins);
		
		JLabel playerTwoWins = new JLabel("Player(O) wins "+ TicTacToeGame.winO);
		playerTwoWins.setFont(new Font("Tahoma", Font.BOLD, 13));
		playerTwoWins.setForeground(Color.RED);
		GridBagConstraints gbc_playerTwoWins = new GridBagConstraints();
		gbc_playerTwoWins.gridx = 3;
		gbc_playerTwoWins.gridy = 2;
		contentPane.add(playerTwoWins, gbc_playerTwoWins);
		
		JButton btnRestart = new JButton("RESTART");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zeroZero.setText("");
				zeroZero.setEnabled(true);
				zeroOne.setText("");
				zeroOne.setEnabled(true);
				zeroTwo.setText("");
				zeroTwo.setEnabled(true);
				oneZero.setText("");
				oneZero.setEnabled(true);
				oneOne.setText("");
				oneOne.setEnabled(true);
				oneTwo.setText("");
				oneTwo.setEnabled(true);
				twoZero.setText("");
				twoZero.setEnabled(true);
				twoOne.setText("");
				twoOne.setEnabled(true);
				twoTwo.setText("");
				twoTwo.setEnabled(true);
				if(TicTacToeGame.Winner()==1) TicTacToeGame.winX++;
				else if (TicTacToeGame.Winner()==2) TicTacToeGame.winO++;
				TicTacToeGame.doRestart();
				playerOnewins.setText("Player(X) wins "+TicTacToeGame.winX);
				playerTwoWins.setText("Player(O) wins "+ TicTacToeGame.winO);
			}
		});
		GridBagConstraints gbc_btnRestart = new GridBagConstraints();
		gbc_btnRestart.insets = new Insets(0, 0, 5, 0);
		gbc_btnRestart.gridx = 3;
		gbc_btnRestart.gridy = 1;
		contentPane.add(btnRestart, gbc_btnRestart);
		
		
	}
	

}

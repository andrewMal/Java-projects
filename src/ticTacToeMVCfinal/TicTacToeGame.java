package ticTacToeMVCfinal;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TicTacToeGame {
		
	static TicTacToe tr = new TicTacToe();
	static int turn = 1;
	static int winX=0;
	static int winO=0;
	
	//controller
	public static int doSetValue(int x,int y,int turn){
		if (turn%2!=0){
			tr.setValue(x, y, 1);
			return 1;
		}
		else{
			tr.setValue(x, y, 2);
			return 2;
		}
	}
	public static void doCheckForTriliza(){
		if (tr.CheckForTriliza()==1){
			JOptionPane.showMessageDialog(null,"Winner is player(X) if you want to rematch press restart","Winner",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("D:\\coding\\TrilizaGuiMVCfinal\\STAR.png"));
		}
		else if (tr.CheckForTriliza()==2){
			JOptionPane.showMessageDialog(null,"Winner is player(O) if you want to rematch press restart","Winner",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("D:\\coding\\TrilizaGuiMVCfinal\\STAR.png"));
		}
		else if (turn>9){
			JOptionPane.showMessageDialog(null,"The game is draw","Tie!!",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void doRestart(){
		tr.Grid();
		turn=1;
	}
	public static int Winner(){
		return tr.CheckForTriliza();
	}

}


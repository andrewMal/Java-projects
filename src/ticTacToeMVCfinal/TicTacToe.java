package ticTacToeMVCfinal;

public class TicTacToe {//model
	private int x;
	private int y;
	private int grid[][];
	
	
	
	public void Grid(){
		this.grid=new int[3][3];
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

//	public void showContents(){
//		for (int i=0;i<=2;i++){
//			for (int j=0;j<=2;j++){
//				System.out.print(this.grid[i][j]);
//			}
//			System.out.println();
//		}
//	}
	public void setValue(int x,int y,int value){
		if ((x<3 && x>-1) && (y<3 && y>-1)&& (value==1 || value==2)){
			grid[x][y]=value;
		}
		else System.out.println("The place or the value is incorect");
	}
	
	
	
	public int CheckForTriliza(){
		//[0] and [1] diagonal 
		int xCheck[]={0,0};
		int oCheck[]={0,0};
		for (int i=0;i<=2;i++){
			int z=3;
			for(int j=0;j<=2;j++){
				z--;
				if (i==j && grid[i][j]==1){
					xCheck[0]=xCheck[0]+1;
					if(xCheck[0]==3) return 1;
				}
				else if (i==j && grid[i][j]==2){
					oCheck[0]=oCheck[0]+1;
					if(oCheck[0]==3) return 2;
				}
				//check second diagonal
				if (i+z==2 && grid[i][z]==1){
					xCheck[1]=xCheck[1]+1;
					if(xCheck[1]==3) return 1;
				}
				else if (i+z==2 && grid[i][z]==2){
					oCheck[1]=oCheck[1]+1;
					if(oCheck[1]==3) return 2;
				}

				//check triliza per row
				else if( grid[i][0]==grid[i][1] && grid[i][1]==grid[i][2]){
					if(grid[i][0]==1) return 1;
					else if (grid[i][0]==2)  return 2;
				}
				//check triliza per column
				else if (grid[0][j]==grid[1][j]&& grid[1][j]==grid[2][j]){
					if(grid[0][j]==1) return 1;
					else if (grid[0][j]==2) return 2;
				}
			}
		}
		return -1;
	}
}

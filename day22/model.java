import java.util.Random;
import java.util.Arrays;
public class model{
	private boolean[][] board;
	private int rand;
	private Random random = new Random();
	private int length = 4;
	public model(){
		board = new boolean[length][length];
		for (int i = 0; i < 4; i++) {
			Arrays.fill(board[i], false);
		}
		rand = random.nextInt(11)+10;
		reset();
	}

	private void changecell(int row, int col){
        	if (board[row][col] == true){board[row][col] = false;}
        	else {board[row][col] = true;}
        }
	private void presscell(int row, int col){
		changecell(row, col);
		if (row+1 <=3) changecell(row+1, col);
		if (col+1 <=3) changecell(row, col+1);
		if (row-1 >=0) changecell(row-1, col);
		if (col-1 >=0) changecell(row, col-1);
	}

	private void reset(){
		int rand0, rand1;
		while(rand>0){
			rand0 = random.nextInt(4);
			rand1 = random.nextInt(4);
			changecell(rand0, rand1);
			rand--;
		}
	}

        private boolean isCleared(){
                for(int i=0; i<length; i++){
                        for (int j=0; j<length; j++){
                                if(board[i][j] == false) return false;
                        }
                }
                return true;
        }
}

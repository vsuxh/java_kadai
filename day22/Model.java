import java.util.Random;
import java.util.Arrays;

public class Model {
    private boolean[][] board;
    private final int SIZE = 4;
    private Random random = new Random();

    public Model() {
        initializeBoard();
    }

    public boolean[][] getBoard() {
        return board;
    }

    private void changeCell(int row, int col) {
        board[row][col] = !board[row][col];
    }

    public void pressCell(int row, int col) {
        changeCell(row, col);
        if (row + 1 < SIZE) changeCell(row + 1, col);
        if (row - 1 >= 0)  changeCell(row - 1, col);
        if (col + 1 < SIZE) changeCell(row, col + 1);
        if (col - 1 >= 0)  changeCell(row, col - 1);
    }

    public void reset() {
        initializeBoard();
    }

    private void initializeBoard() {
        board = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(board[i], false);
        }

        int presses = random.nextInt(11) + 10;
        for (int i = 0; i < presses; i++) {
            pressCell(random.nextInt(SIZE), random.nextInt(SIZE));
        }
    }

    public boolean isCleared() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j]) return false;
            }
        }
        return true;
    }
}


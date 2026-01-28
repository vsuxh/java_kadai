import java.util.Random;
import java.util.Arrays;

public class Model {
    private boolean[][] board;
    private final int SIZE = 4;
    private Random random = new Random();

    public Model() {
        initializeBoard();
    }

    public boolean isOn(int row, int col) {
        return board[row][col];
    }

    public int getSize() {
        return SIZE;
    }

    public void pressCell(int row, int col) {
        changeCell(row, col);
        if (row + 1 < SIZE) changeCell(row + 1, col);
        if (row - 1 >= 0)  changeCell(row - 1, col);
        if (col + 1 < SIZE) changeCell(row, col + 1);
        if (col - 1 >= 0)  changeCell(row, col - 1);
    }

    private void changeCell(int row, int col) {
        board[row][col] = !board[row][col];
    }

    public void reset() {
        initializeBoard();
    }

    private void initializeBoard() {
        board = new boolean[SIZE][SIZE];
        int presses = random.nextInt(11) + 10;
        for (int i = 0; i < presses; i++) {
            pressCell(random.nextInt(SIZE), random.nextInt(SIZE));
        }
    }

    public boolean isCleared() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (board[r][c]) return false;
            }
        }
        return true;
    }
}


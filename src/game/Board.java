package game;
import units.Unit;

public class Board {
    // Board of 6 rows and 5 columns (3 rows for each player)
    // All cells are null initially
    private Unit[][] board = new Unit[6][5];

    // Empty constructor
    public Board() {

    }

    public Unit getUnitAt(int row, int col) {
        return board[row][col];
    }

    public void placeUnitAt(int row, int col, Unit unit) {
        if (board[row][col] == null) {
            board[row][col] = unit;
        } else {
            throw new IllegalArgumentException("Cell is already occupied");
        }
    }
}
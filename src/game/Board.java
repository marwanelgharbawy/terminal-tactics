package game;

import units.*;

public class Board {
    private Unit[][] grid;

    public Board() {
        // Board of 5 rows and 8 columns (4 columns for each player, right facing left)
        // All cells are null initially
        this.grid = new Unit[Constants.BOARD_ROWS][Constants.BOARD_COLS];
    }

    // Copy constructor
    public Board(Board source) {
        this.grid = new Unit[Constants.BOARD_ROWS][Constants.BOARD_COLS];
        for (int i = 0; i < Constants.BOARD_ROWS; i++) {
            for (int j = 0; j < Constants.BOARD_COLS; j++) {
                this.grid[i][j] = source.grid[i][j].copy(); // Deep copy each unit
            }
        }
    }

    public Unit getUnitAt(int row, int col) {
        return grid[row][col];
    }

    public void placeUnitAt(int row, int col, Unit unit) {
        if (grid[row][col] == null) {
            grid[row][col] = unit;
        } else {
            throw new IllegalArgumentException("Cell is already occupied");
        }
    }

    public void removeUnit(Unit unit) {
        // Search for unit and remove it
        for (int i = 0; i < Constants.BOARD_ROWS; i++) {
            for (int j = 0; j < Constants.BOARD_COLS; j++) {
                if (grid[i][j] == unit) {
                    grid[i][j] = null;
                    return;
                }
            }
        }
    }

    public void removeUnitAt(int row, int col) {
        grid[row][col] = null;
    }
}
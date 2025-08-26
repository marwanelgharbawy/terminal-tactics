package game;

import units.*;

public class Board {
    private Unit[][] grid;

    public Board() {
        // Board of 8 rows and 5 columns (4 rows for each player)
        // All cells are null initially
        this.grid = new Unit[8][5];
    }

    // Copy constructor
    public Board(Board source) {
        this.grid = new Unit[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
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
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
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
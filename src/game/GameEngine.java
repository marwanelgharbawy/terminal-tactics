package game;

import units.*;

public class GameEngine {
    // Singleton principle
    private static GameEngine instance = null;
    private Board board;

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public GameEngine() {
        this.board = new Board(); // Initialize the board
    }

    public void placeUnit(int row, int col, Unit unit) {
            board.placeUnitAt(row, col, unit);
    }

    public Unit getUnit(int row, int col) {
        return board.getUnitAt(row, col);
    }

    public void deleteUnit(int row, int col) {
        board.placeUnitAt(row, col, null); // Remove unit by setting to null
    }
}
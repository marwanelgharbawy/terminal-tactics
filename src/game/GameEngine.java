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

    // Board setup methods
    public void placeUnit(int row, int col, Unit unit) {
            board.placeUnitAt(row, col, unit);
    }

    public Unit getUnit(int row, int col) {
        return board.getUnitAt(row, col);
    }

    public void deleteUnit(int row, int col) {
        board.placeUnitAt(row, col, null); // Remove unit by setting to null
    }

    // Game logic methods
    public void startGame() {
        // TODO: Game logic, including unit movement (forward) and attacking
    }

    public void unitAction(Unit unit) {
        // Attack if enemy in range, else move forward
    }

    public void moveUnit(Unit unit) {
        // Simply move forward one cell if it's empty
    }

    public void unitAttack(Unit attacker, Unit target) {
        attacker.dealDamage(target);
    }

    public void killUnit(Unit unit) {
        // unit.die(); ?
    }

    public void endGame() {
        // Reset the board
        // Score calculation
    }
}
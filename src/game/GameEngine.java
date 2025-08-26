package game;

import units.*;

public class GameEngine {
    // Singleton principle
    private static GameEngine instance = null;
    private final Board setupBoard;
    private Board gameBoard;

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }

    public GameEngine() {
        this.setupBoard = new Board(); // Initialize Board for setup phase
        this.gameBoard = new Board();  // Initialize Board for game phase
    }

    // Board setup methods
    public void placeUnit(int row, int col, Unit unit) {
            setupBoard.placeUnitAt(row, col, unit);
    }

    public Unit getUnit(int row, int col) {
        return setupBoard.getUnitAt(row, col);
    }

    public void deleteUnit(int row, int col) {
        setupBoard.placeUnitAt(row, col, null); // Remove unit by setting to null
    }

    // Game logic methods
    public void startRound() {
        // TODO: Game logic, including unit movement (forward) and attacking
        gameBoard = new Board(setupBoard); // Deep copy of the setupBoard, will be used once for game phase
    }

    public void unitAction(Unit unit) {
        // Attackers only start attacking when they have a target in range
        // Attack if enemy in range, else move forward
    }

    public void moveUnit(Unit unit) {
        // Simply move forward one cell if it's empty
    }

    public void unitAttack(Unit attacker, Unit target) {
        // Apply damage from attacker to target
        target.takeDamage(attacker.getDamage());
    }

    public void applyDamageToArea(int damage, int row, int col) {
        // Apply damage to all enemy units in that area
        // If team red attacks, team blue enemy units only are affected, and vice versa
    }

    public void killUnit(Unit unit) {
        // Remove unit from the board
        // unit.die(); ?
        gameBoard.removeUnit(unit);
    }

    public void endRound() {
        // Reset the setupBoard
        // Score calculation
    }
}
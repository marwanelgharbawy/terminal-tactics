package game;

import java.util.ArrayList;
import units.Unit;

public class Player {
    // Available units, main stats such as health (that gets updated after each round)
    // For current design, each player has no special abilities
    // For current design, each player has a fixed set of units they can use
    // TODO: Later, this will become an abstract class which special heroes will extend
    private String name;
    private int health;
    private int balance;
    private ArrayList<Unit> units; // List of units owned by the player
    private GameEngine gameEngine;

    public Player(String name, GameEngine gameEngine) {
        this.name = name;
        this.health = Constants.DefaultHealth;   // Default health
        this.balance = Constants.DefaultBalance; // Default balance
        this.units = new ArrayList<>(); // Initialize the list of units
        this.gameEngine = gameEngine;
    }

    public void placeUnit(int row, int col, Unit unit) {
        System.out.println(this.name + " placing " + unit.getName() + " at (" + row + ", " + col + ")");
        gameEngine.placeUnit(row, col, unit);
    }

    // Getters
    public String getName() {
        return this.name;
    }
}